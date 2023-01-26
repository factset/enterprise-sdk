package com.factset.sdk.Formula.api;

import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiResponse;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Formula.models.BatchDataRequest;
import com.factset.sdk.Formula.models.BatchDataResponse;
import com.factset.sdk.Formula.models.BatchStatusResponse;
import com.factset.sdk.Formula.models.ErrorDetail;

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
    getBatchDataResponseTypeMap.put(200, new GenericType<BatchDataResponse>(){});
    getBatchDataResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchDataResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
  }
  private static final Map<Integer, GenericType> getBatchDataWithPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBatchDataWithPostResponseTypeMap.put(200, new GenericType<BatchDataResponse>(){});
    getBatchDataWithPostResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchDataWithPostResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
  }
  private static final Map<Integer, GenericType> getBatchStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBatchStatusResponseTypeMap.put(201, new GenericType<BatchStatusResponse>(){});
    getBatchStatusResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchStatusResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
  }
  private static final Map<Integer, GenericType> getBatchStatusWithPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBatchStatusWithPostResponseTypeMap.put(201, new GenericType<BatchStatusResponse>(){});
    getBatchStatusWithPostResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getBatchStatusWithPostResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
  }

   
 /**
   * Wrapper to support GET /v1/batch-result returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code BatchDataResponse }<br>Request Response Object when batch request has completed and response is created</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch Request has not finished and the result has NOT been created.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetBatchDataResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     BatchDataResponse data200 = response.getResponse200();
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
    
    public BatchDataResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (BatchDataResponse) this.response;
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
   * Wrapper to support POST /v1/batch-result returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code BatchDataResponse }<br>Request Response Object when batch request has completed and response is created</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch Request has not finished and the result has NOT been created.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetBatchDataWithPostResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     BatchDataResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetBatchDataWithPostResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetBatchDataWithPostResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public BatchDataResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (BatchDataResponse) this.response;
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
      GetBatchDataWithPostResponseWrapper other = (GetBatchDataWithPostResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetBatchDataWithPostResponseWrapper {\n"
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
   * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param id Batch Request identifier. (required)
   * @return GetBatchDataResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when batch request has completed and response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetBatchDataResponseWrapper getBatchData(java.util.UUID id) throws ApiException {
    return getBatchDataWithHttpInfo(id).getData();
  }

  /**
   * Returns the response for a Batch Request
   * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param id Batch Request identifier. (required)
   * @return ApiResponse&lt;GetBatchDataResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when batch request has completed and response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetBatchDataResponseWrapper> getBatchDataWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBatchData");
    }
    
    // create path and map variables
    String localVarPath = "/v1/batch-result";

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
   * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param batchDataRequest  (required)
   * @return GetBatchDataWithPostResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when batch request has completed and response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetBatchDataWithPostResponseWrapper getBatchDataWithPost(BatchDataRequest batchDataRequest) throws ApiException {
    return getBatchDataWithPostWithHttpInfo(batchDataRequest).getData();
  }

  /**
   * Returns the status for a Batch Request
   * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param batchDataRequest  (required)
   * @return ApiResponse&lt;GetBatchDataWithPostResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request Response Object when batch request has completed and response is created </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetBatchDataWithPostResponseWrapper> getBatchDataWithPostWithHttpInfo(BatchDataRequest batchDataRequest) throws ApiException {
    Object localVarPostBody = batchDataRequest;
    
    // verify the required parameter 'batchDataRequest' is set
    if (batchDataRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'batchDataRequest' when calling getBatchDataWithPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/batch-result";

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("BatchProcessingApi.getBatchDataWithPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBatchDataWithPostResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetBatchDataWithPostResponseWrapper responseWrapper = new GetBatchDataWithPostResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetBatchDataWithPostResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the status for a Batch Request
   * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param id Batch Request identifier. (required)
   * @return BatchStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public BatchStatusResponse getBatchStatus(java.util.UUID id) throws ApiException {
    return getBatchStatusWithHttpInfo(id).getData();
  }

  /**
   * Returns the status for a Batch Request
   * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param id Batch Request identifier. (required)
   * @return ApiResponse&lt;BatchStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<BatchStatusResponse> getBatchStatusWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBatchStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v1/batch-status";

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
  /**
   * Returns the status for a Batch Request
   * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param batchDataRequest  (required)
   * @return BatchStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public BatchStatusResponse getBatchStatusWithPost(BatchDataRequest batchDataRequest) throws ApiException {
    return getBatchStatusWithPostWithHttpInfo(batchDataRequest).getData();
  }

  /**
   * Returns the status for a Batch Request
   * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the &#x60;batch&#x60; parameter in the &#x60;/time-series&#x60; endpoint and up to **10 minutes** in the &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param batchDataRequest  (required)
   * @return ApiResponse&lt;BatchStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Batch Request has been completed and the response has been created. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 202 </td><td> Batch Request has not finished and the result has NOT been created. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<BatchStatusResponse> getBatchStatusWithPostWithHttpInfo(BatchDataRequest batchDataRequest) throws ApiException {
    Object localVarPostBody = batchDataRequest;
    
    // verify the required parameter 'batchDataRequest' is set
    if (batchDataRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'batchDataRequest' when calling getBatchStatusWithPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/batch-status";

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
      
    > apiResponse = apiClient.invokeAPI("BatchProcessingApi.getBatchStatusWithPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBatchStatusWithPostResponseTypeMap, false);

    return apiResponse;

  }
}
