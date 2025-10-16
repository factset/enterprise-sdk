package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.BatchStatusResponse;
import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;
import com.factset.sdk.FactSetFundamentals.models.FundamentalsPITRequest;
import com.factset.sdk.FactSetFundamentals.models.OneOfintegerDateTime;
import com.factset.sdk.FactSetFundamentals.models.PeriodsRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FundamentalsPointInTimeApi {
  private ApiClient apiClient;

  public FundamentalsPointInTimeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundamentalsPointInTimeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postFundamentalsFiscalPeriodsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFundamentalsFiscalPeriodsResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    postFundamentalsFiscalPeriodsResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postFundamentalsPITDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFundamentalsPITDataResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    postFundamentalsPITDataResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
   * This endpoint initiates an asynchronous batch job to fetch detailed information about fiscal periods. The request allows filtering for fiscal periods ending within a specified calendar date range. The response provides Point-in-Time (PIT) details, showing when each period&#39;s information was first published and when it was superseded. This is crucial for historical backtesting. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 
   * @param periodsRequest Request object containing parameters for the fiscal periods request. (required)
   * @return BatchStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. </td><td>  * Location - The URL to poll for status of the batch request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. </td><td>  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  </td></tr>
     </table>
   */
  public BatchStatusResponse postFundamentalsFiscalPeriods(PeriodsRequest periodsRequest) throws ApiException {
    return postFundamentalsFiscalPeriodsWithHttpInfo(periodsRequest).getData();
  }

  /**
   * Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
   * This endpoint initiates an asynchronous batch job to fetch detailed information about fiscal periods. The request allows filtering for fiscal periods ending within a specified calendar date range. The response provides Point-in-Time (PIT) details, showing when each period&#39;s information was first published and when it was superseded. This is crucial for historical backtesting. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 
   * @param periodsRequest Request object containing parameters for the fiscal periods request. (required)
   * @return ApiResponse&lt;BatchStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. </td><td>  * Location - The URL to poll for status of the batch request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. </td><td>  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  </td></tr>
     </table>
   */
  public ApiResponse<BatchStatusResponse> postFundamentalsFiscalPeriodsWithHttpInfo(PeriodsRequest periodsRequest) throws ApiException {
    Object localVarPostBody = periodsRequest;
    
    // verify the required parameter 'periodsRequest' is set
    if (periodsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'periodsRequest' when calling postFundamentalsFiscalPeriods");
    }
    
    // create path and map variables
    String localVarPath = "/periods";

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
        
        BatchStatusResponse
      
    > apiResponse = apiClient.invokeAPI("FundamentalsPointInTimeApi.postFundamentalsFiscalPeriods", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFundamentalsFiscalPeriodsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Point-in-Time data for multiple securities.
   * This endpoint initiates an asynchronous batch job to fetch Point-in-Time (PIT) data. PIT data allows you to view fundamentals data as it was known on a specific date. This is crucial for backtesting trading strategies, performing academic research, and avoiding lookahead bias. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 
   * @param fundamentalsPITRequest Request object containing parameters for the PIT fundamentals request. (required)
   * @return BatchStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. </td><td>  * Location - The URL to poll for status of the batch request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. </td><td>  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  </td></tr>
     </table>
   */
  public BatchStatusResponse postFundamentalsPITData(FundamentalsPITRequest fundamentalsPITRequest) throws ApiException {
    return postFundamentalsPITDataWithHttpInfo(fundamentalsPITRequest).getData();
  }

  /**
   * Retrieve Point-in-Time data for multiple securities.
   * This endpoint initiates an asynchronous batch job to fetch Point-in-Time (PIT) data. PIT data allows you to view fundamentals data as it was known on a specific date. This is crucial for backtesting trading strategies, performing academic research, and avoiding lookahead bias. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 
   * @param fundamentalsPITRequest Request object containing parameters for the PIT fundamentals request. (required)
   * @return ApiResponse&lt;BatchStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. </td><td>  * Location - The URL to poll for status of the batch request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. </td><td>  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  </td></tr>
     </table>
   */
  public ApiResponse<BatchStatusResponse> postFundamentalsPITDataWithHttpInfo(FundamentalsPITRequest fundamentalsPITRequest) throws ApiException {
    Object localVarPostBody = fundamentalsPITRequest;
    
    // verify the required parameter 'fundamentalsPITRequest' is set
    if (fundamentalsPITRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundamentalsPITRequest' when calling postFundamentalsPITData");
    }
    
    // create path and map variables
    String localVarPath = "/point-in-time";

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
        
        BatchStatusResponse
      
    > apiResponse = apiClient.invokeAPI("FundamentalsPointInTimeApi.postFundamentalsPITData", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFundamentalsPITDataResponseTypeMap, false);

    return apiResponse;

  }
}
