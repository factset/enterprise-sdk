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

import com.factset.sdk.FactSetBanks.models.AUMRequest;
import com.factset.sdk.FactSetBanks.models.AUMResponse;
import com.factset.sdk.FactSetBanks.models.ErrorResponse;
import com.factset.sdk.FactSetBanks.models.FOCUSRequest;
import com.factset.sdk.FactSetBanks.models.FOCUSResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SpecialtyFinanceApi {
  private ApiClient apiClient;

  public SpecialtyFinanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SpecialtyFinanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAUMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAUMResponseTypeMap.put(200, new GenericType<AUMResponse>(){});
    getAUMResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getAUMResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFOCUSResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFOCUSResponseTypeMap.put(200, new GenericType<FOCUSResponse>(){});
    getFOCUSResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFOCUSResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Form ADV AUM data
   * Returns SEC Form ADV assets under management data for investment advisers — 19,000+ public and private US companies, wealth managers, traditional asset managers, private equity hedge funds, and Business Development Companies (BDCs). BDC coverage includes 120+ companies with annual history since 2014.  Form ADV history since 2017. Updated annually.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 
   * @param auMRequest  (required)
   * @return AUMResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Form ADV AUM data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AUMResponse getAUM(AUMRequest auMRequest) throws ApiException {
    return getAUMWithHttpInfo(auMRequest).getData();
  }

  /**
   * Returns Form ADV AUM data
   * Returns SEC Form ADV assets under management data for investment advisers — 19,000+ public and private US companies, wealth managers, traditional asset managers, private equity hedge funds, and Business Development Companies (BDCs). BDC coverage includes 120+ companies with annual history since 2014.  Form ADV history since 2017. Updated annually.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 
   * @param auMRequest  (required)
   * @return ApiResponse&lt;AUMResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Form ADV AUM data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AUMResponse> getAUMWithHttpInfo(AUMRequest auMRequest) throws ApiException {
    Object localVarPostBody = auMRequest;
    
    // verify the required parameter 'auMRequest' is set
    if (auMRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'auMRequest' when calling getAUM");
    }
    
    // create path and map variables
    String localVarPath = "/aum";

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
        
        AUMResponse
      
    > apiResponse = apiClient.invokeAPI("SpecialtyFinanceApi.getAUM", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAUMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns FOCUS report data
   * Returns FOCUS report financial data for SEC-registered broker-dealers, derived from Form X-17A-5 — income statement, balance sheet, and net capital data covering financial and operating status.  Covers 3,000+ broker-dealers; 300+ data items; history since 2015. Updated annually.  Income statement data is rarely reported by filers, so it is expected that users will see income statement values populated infrequently.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 
   * @param foCUSRequest  (required)
   * @return FOCUSResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> FOCUS report data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FOCUSResponse getFOCUS(FOCUSRequest foCUSRequest) throws ApiException {
    return getFOCUSWithHttpInfo(foCUSRequest).getData();
  }

  /**
   * Returns FOCUS report data
   * Returns FOCUS report financial data for SEC-registered broker-dealers, derived from Form X-17A-5 — income statement, balance sheet, and net capital data covering financial and operating status.  Covers 3,000+ broker-dealers; 300+ data items; history since 2015. Updated annually.  Income statement data is rarely reported by filers, so it is expected that users will see income statement values populated infrequently.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 
   * @param foCUSRequest  (required)
   * @return ApiResponse&lt;FOCUSResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> FOCUS report data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FOCUSResponse> getFOCUSWithHttpInfo(FOCUSRequest foCUSRequest) throws ApiException {
    Object localVarPostBody = foCUSRequest;
    
    // verify the required parameter 'foCUSRequest' is set
    if (foCUSRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'foCUSRequest' when calling getFOCUS");
    }
    
    // create path and map variables
    String localVarPath = "/focus";

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
        
        FOCUSResponse
      
    > apiResponse = apiClient.invokeAPI("SpecialtyFinanceApi.getFOCUS", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFOCUSResponseTypeMap, false);

    return apiResponse;

  }
}
