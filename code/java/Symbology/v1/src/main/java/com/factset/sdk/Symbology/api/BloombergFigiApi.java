package com.factset.sdk.Symbology.api;

import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiResponse;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Symbology.models.BloombergTranslationRequest;
import com.factset.sdk.Symbology.models.BloombergTranslationResponse;
import com.factset.sdk.Symbology.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BloombergFigiApi {
  private ApiClient apiClient;

  public BloombergFigiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BloombergFigiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> batchTranslateBloombergResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchTranslateBloombergResponseTypeMap.put(200, new GenericType<BloombergTranslationResponse>(){});
    batchTranslateBloombergResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchTranslateBloombergResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchTranslateBloombergResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchTranslateBloombergResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchTranslateBloombergResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> translateBloombergResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    translateBloombergResponseTypeMap.put(200, new GenericType<BloombergTranslationResponse>(){});
    translateBloombergResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    translateBloombergResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    translateBloombergResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    translateBloombergResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    translateBloombergResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Translate market security symbols into Bloomberg Identifiers.
   * Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
   * @param bloombergTranslationRequest Request Body for Bloomberg FIGIs. (required)
   * @return BloombergTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol Translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BloombergTranslationResponse batchTranslateBloomberg(BloombergTranslationRequest bloombergTranslationRequest) throws ApiException {
    return batchTranslateBloombergWithHttpInfo(bloombergTranslationRequest).getData();
  }

  /**
   * Translate market security symbols into Bloomberg Identifiers.
   * Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
   * @param bloombergTranslationRequest Request Body for Bloomberg FIGIs. (required)
   * @return ApiResponse&lt;BloombergTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol Translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BloombergTranslationResponse> batchTranslateBloombergWithHttpInfo(BloombergTranslationRequest bloombergTranslationRequest) throws ApiException {
    Object localVarPostBody = bloombergTranslationRequest;
    
    // verify the required parameter 'bloombergTranslationRequest' is set
    if (bloombergTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bloombergTranslationRequest' when calling batchTranslateBloomberg");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/bloomberg";

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
        
        BloombergTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("BloombergFigiApi.batchTranslateBloomberg", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchTranslateBloombergResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate FactSet symbols into Bloomberg Identifiers.
   * Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @return BloombergTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Ticker-Exchange or Ticker-Region for a given security. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BloombergTranslationResponse translateBloomberg(java.util.List<String> ids) throws ApiException {
    return translateBloombergWithHttpInfo(ids).getData();
  }

  /**
   * Translate FactSet symbols into Bloomberg Identifiers.
   * Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @return ApiResponse&lt;BloombergTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Ticker-Exchange or Ticker-Region for a given security. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BloombergTranslationResponse> translateBloombergWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling translateBloomberg");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/bloomberg";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BloombergTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("BloombergFigiApi.translateBloomberg", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, translateBloombergResponseTypeMap, false);

    return apiResponse;

  }
}
