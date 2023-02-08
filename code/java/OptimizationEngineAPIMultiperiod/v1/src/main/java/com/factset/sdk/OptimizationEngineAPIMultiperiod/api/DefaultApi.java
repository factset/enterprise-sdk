package com.factset.sdk.OptimizationEngineAPIMultiperiod.api;

import com.factset.sdk.OptimizationEngineAPIMultiperiod.ApiException;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.ApiClient;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.ApiResponse;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.Configuration;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMultiPeriodInput;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerOutputsMultiPeriodOutput;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> mpoV1OptimizeFPOPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    mpoV1OptimizeFPOPostResponseTypeMap.put(200, new GenericType<OptimizerOutputsMultiPeriodOutput>(){});
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
   * 
   * 
   * @param multiPeriodInput Multiperiod protobuf input (optional)
   * @return OptimizerOutputsMultiPeriodOutput
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiperiod protobuf output </td><td>  -  </td></tr>
     </table>
   */
  public OptimizerOutputsMultiPeriodOutput mpoV1OptimizeFPOPost(OptimizerInputsMultiPeriodInput multiPeriodInput) throws ApiException {
    return mpoV1OptimizeFPOPostWithHttpInfo(multiPeriodInput).getData();
  }

  /**
   * 
   * 
   * @param multiPeriodInput Multiperiod protobuf input (optional)
   * @return ApiResponse&lt;OptimizerOutputsMultiPeriodOutput&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiperiod protobuf output </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptimizerOutputsMultiPeriodOutput> mpoV1OptimizeFPOPostWithHttpInfo(OptimizerInputsMultiPeriodInput multiPeriodInput) throws ApiException {
    Object localVarPostBody = multiPeriodInput;
    
    // create path and map variables
    String localVarPath = "/mpo/v1/optimizeFPO";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/x-protobuf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-protobuf"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        OptimizerOutputsMultiPeriodOutput
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.mpoV1OptimizeFPOPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, mpoV1OptimizeFPOPostResponseTypeMap, false);

    return apiResponse;

  }
}
