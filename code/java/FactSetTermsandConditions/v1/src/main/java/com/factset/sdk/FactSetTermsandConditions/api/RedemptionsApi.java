package com.factset.sdk.FactSetTermsandConditions.api;

import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiResponse;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTermsandConditions.models.ErrorResponse;
import com.factset.sdk.FactSetTermsandConditions.models.RedemptionPricesRequest;
import com.factset.sdk.FactSetTermsandConditions.models.RedemptionPricesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RedemptionsApi {
  private ApiClient apiClient;

  public RedemptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RedemptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getFixedIncomeRedemptionPricesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFixedIncomeRedemptionPricesResponseTypeMap.put(200, new GenericType<RedemptionPricesResponse>(){});
    getFixedIncomeRedemptionPricesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFixedIncomeRedemptionPricesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(200, new GenericType<RedemptionPricesResponse>(){});
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFixedIncomeRedemptionPricesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Return Redemption Prices for a Fixed Income security.
   * Returns Redemption Prices for the Fixed Income security. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @param categories Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  (required)
   * @return RedemptionPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Negative Redemption Prices Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RedemptionPricesResponse getFixedIncomeRedemptionPrices(java.util.List<String> ids, String categories) throws ApiException {
    return getFixedIncomeRedemptionPricesWithHttpInfo(ids, categories).getData();
  }

  /**
   * Return Redemption Prices for a Fixed Income security.
   * Returns Redemption Prices for the Fixed Income security. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @param categories Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  (required)
   * @return ApiResponse&lt;RedemptionPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Negative Redemption Prices Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RedemptionPricesResponse> getFixedIncomeRedemptionPricesWithHttpInfo(java.util.List<String> ids, String categories) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFixedIncomeRedemptionPrices");
    }
    
    // verify the required parameter 'categories' is set
    if (categories == null) {
      throw new ApiException(400, "Missing the required parameter 'categories' when calling getFixedIncomeRedemptionPrices");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/redemption-prices";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RedemptionPricesResponse
      
    > apiResponse = apiClient.invokeAPI("RedemptionsApi.getFixedIncomeRedemptionPrices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFixedIncomeRedemptionPricesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Redemption Prices for a list of Fixed Income securities.
   * Returns Redemption Prices for a list of Fixed Income securities. 
   * @param redemptionPricesRequest Request object for Fixed Income Redemption Prices. (required)
   * @return RedemptionPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Negative Redemption Prices Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RedemptionPricesResponse getFixedIncomeRedemptionPricesForList(RedemptionPricesRequest redemptionPricesRequest) throws ApiException {
    return getFixedIncomeRedemptionPricesForListWithHttpInfo(redemptionPricesRequest).getData();
  }

  /**
   * Return Redemption Prices for a list of Fixed Income securities.
   * Returns Redemption Prices for a list of Fixed Income securities. 
   * @param redemptionPricesRequest Request object for Fixed Income Redemption Prices. (required)
   * @return ApiResponse&lt;RedemptionPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Negative Redemption Prices Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RedemptionPricesResponse> getFixedIncomeRedemptionPricesForListWithHttpInfo(RedemptionPricesRequest redemptionPricesRequest) throws ApiException {
    Object localVarPostBody = redemptionPricesRequest;
    
    // verify the required parameter 'redemptionPricesRequest' is set
    if (redemptionPricesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'redemptionPricesRequest' when calling getFixedIncomeRedemptionPricesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/redemption-prices";

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
        
        RedemptionPricesResponse
      
    > apiResponse = apiClient.invokeAPI("RedemptionsApi.getFixedIncomeRedemptionPricesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFixedIncomeRedemptionPricesForListResponseTypeMap, false);

    return apiResponse;

  }
}
