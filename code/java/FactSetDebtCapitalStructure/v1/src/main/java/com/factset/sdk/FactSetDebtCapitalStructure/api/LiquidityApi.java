package com.factset.sdk.FactSetDebtCapitalStructure.api;

import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetDebtCapitalStructure.models.ErrorResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.LiquidityRequest;
import com.factset.sdk.FactSetDebtCapitalStructure.models.LiquidityResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LiquidityApi {
  private ApiClient apiClient;

  public LiquidityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LiquidityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLiquidityPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLiquidityPostResponseTypeMap.put(200, new GenericType<LiquidityResponse>(){});
    getLiquidityPostResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getLiquidityPostResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getLiquidityPostResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getLiquidityPostResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getLiquidityPostResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getLiquidityPostResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns liquidity information for specified metrics and date ranges.
   * Gets liquidity detail and summary information (includes all instrument details). 
   * @param liquidityRequest Request object for &#x60;Liquidity&#x60;. (required)
   * @return LiquidityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LiquidityResponse getLiquidityPost(LiquidityRequest liquidityRequest) throws ApiException {
    return getLiquidityPostWithHttpInfo(liquidityRequest).getData();
  }

  /**
   * Returns liquidity information for specified metrics and date ranges.
   * Gets liquidity detail and summary information (includes all instrument details). 
   * @param liquidityRequest Request object for &#x60;Liquidity&#x60;. (required)
   * @return ApiResponse&lt;LiquidityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LiquidityResponse> getLiquidityPostWithHttpInfo(LiquidityRequest liquidityRequest) throws ApiException {
    Object localVarPostBody = liquidityRequest;
    
    // verify the required parameter 'liquidityRequest' is set
    if (liquidityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'liquidityRequest' when calling getLiquidityPost");
    }
    
    // create path and map variables
    String localVarPath = "/liquidity";

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
        
        LiquidityResponse
      
    > apiResponse = apiClient.invokeAPI("LiquidityApi.getLiquidityPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLiquidityPostResponseTypeMap, false);

    return apiResponse;

  }
}
