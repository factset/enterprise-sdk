package com.factset.sdk.FactSetBanks.api;

import com.factset.sdk.FactSetBanks.ApiException;
import com.factset.sdk.FactSetBanks.ApiClient;
import com.factset.sdk.FactSetBanks.ApiResponse;
import com.factset.sdk.FactSetBanks.Configuration;
import com.factset.sdk.FactSetBanks.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetBanks.models.ErrorResponse;
import com.factset.sdk.FactSetBanks.models.RatesRequest;
import com.factset.sdk.FactSetBanks.models.RatesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DepositRatesApi {
  private ApiClient apiClient;

  public DepositRatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DepositRatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getRatesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRatesResponseTypeMap.put(200, new GenericType<RatesResponse>(){});
    getRatesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getRatesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns deposit rates
   * Returns current and historical deposit rates from US banks and credit unions — APY, previous APY, national APY averages, terms, and minimum balances — across CD, Savings, Interest Checking, Money Market, Fixed IRA, and Variable IRA products. Identifies where banks offer better rates than geographic competitors.  Covers 500+ financial institutions (US banks, credit unions, internet banks); 40+ data items. 
   * @param ratesRequest  (required)
   * @return RatesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Deposit rates data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RatesResponse getRates(RatesRequest ratesRequest) throws ApiException {
    return getRatesWithHttpInfo(ratesRequest).getData();
  }

  /**
   * Returns deposit rates
   * Returns current and historical deposit rates from US banks and credit unions — APY, previous APY, national APY averages, terms, and minimum balances — across CD, Savings, Interest Checking, Money Market, Fixed IRA, and Variable IRA products. Identifies where banks offer better rates than geographic competitors.  Covers 500+ financial institutions (US banks, credit unions, internet banks); 40+ data items. 
   * @param ratesRequest  (required)
   * @return ApiResponse&lt;RatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Deposit rates data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RatesResponse> getRatesWithHttpInfo(RatesRequest ratesRequest) throws ApiException {
    Object localVarPostBody = ratesRequest;
    
    // verify the required parameter 'ratesRequest' is set
    if (ratesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ratesRequest' when calling getRates");
    }
    
    // create path and map variables
    String localVarPath = "/deposit-rates";

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
        
        RatesResponse
      
    > apiResponse = apiClient.invokeAPI("DepositRatesApi.getRates", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRatesResponseTypeMap, false);

    return apiResponse;

  }
}
