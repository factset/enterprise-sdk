package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.BatchResultResponse;
import com.factset.sdk.FactSetFundamentals.models.BatchStatusResponse;
import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchProcessingApi {
  private ApiClient apiClient;

  public BatchProcessingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BatchProcessingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getBatchDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBatchDataResponseTypeMap.put(200, new GenericType<BatchResultResponse>(){});
    getBatchDataResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchDataResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getBatchStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBatchStatusResponseTypeMap.put(201, new GenericType<BatchStatusResponse>(){});
    getBatchStatusResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchStatusResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support GET /batch-result returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code BatchResultResponse }<br>Request Response Object when the batch request has been completed and the response is created</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>The batch Request has not finished and the result has NOT been created.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetBatchDataResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     BatchResultResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetBatchDataResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetBatchDataResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public BatchResultResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (BatchResultResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetBatchDataResponseWrapper other = (GetBatchDataResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetBatchDataResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Returns the response for a Batch Request 
   * Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
   * @param id Batch Request identifier. (required)
   * @return GetBatchDataResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when the batch request has been completed and the response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> The batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     </table>
   */
  public GetBatchDataResponseWrapper getBatchData(java.util.UUID id) throws ApiException {
    return getBatchDataWithHttpInfo(id).getData();
  }

  /**
   * Returns the response for a Batch Request 
   * Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
   * @param id Batch Request identifier. (required)
   * @return ApiResponse&lt;GetBatchDataResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when the batch request has been completed and the response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> The batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetBatchDataResponseWrapper> getBatchDataWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBatchData");
    }
    
    // create path and map variables
    String localVarPath = "/batch-result";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("BatchProcessingApi.getBatchData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBatchDataResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetBatchDataResponseWrapper responseWrapper = new GetBatchDataResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetBatchDataResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the status for a Batch Request 
   * Return the status for the underlying batch request that is specified by the id.
   * @param id Batch Request identifier. (required)
   * @return BatchStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> The batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     </table>
   */
  public BatchStatusResponse getBatchStatus(java.util.UUID id) throws ApiException {
    return getBatchStatusWithHttpInfo(id).getData();
  }

  /**
   * Returns the status for a Batch Request 
   * Return the status for the underlying batch request that is specified by the id.
   * @param id Batch Request identifier. (required)
   * @return ApiResponse&lt;BatchStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> The batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BatchStatusResponse> getBatchStatusWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBatchStatus");
    }
    
    // create path and map variables
    String localVarPath = "/batch-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BatchStatusResponse
      
    > apiResponse = apiClient.invokeAPI("BatchProcessingApi.getBatchStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBatchStatusResponseTypeMap, false);

    return apiResponse;

  }
}
