package com.factset.sdk.FactSetOwnership.api;

import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiResponse;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOwnership.models.ErrorResponse;
import com.factset.sdk.FactSetOwnership.models.FundHoldingsRequest;
import com.factset.sdk.FactSetOwnership.models.FundHoldingsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FundHoldingsApi {
  private ApiClient apiClient;

  public FundHoldingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundHoldingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOwnershipHoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipHoldingsResponseTypeMap.put(200, new GenericType<FundHoldingsResponse>(){});
    getOwnershipHoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOwnershipHoldingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOwnershipHoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipHoldingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOwnershipHoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postOwnershipHoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOwnershipHoldingsResponseTypeMap.put(200, new GenericType<FundHoldingsResponse>(){});
    postOwnershipHoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postOwnershipHoldingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postOwnershipHoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postOwnershipHoldingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postOwnershipHoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get underlying holdings information for a requested fund identifer.
   * Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type. 
   * @param ids List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; (required)
   * @param date Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
   * @param topn Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional, default to ALL)
   * @param assetType Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  (optional, default to EQ)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return FundHoldingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fund Holdings Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundHoldingsResponse getOwnershipHoldings(java.util.List<String> ids, String date, String topn, String assetType, String currency) throws ApiException {
    return getOwnershipHoldingsWithHttpInfo(ids, date, topn, assetType, currency).getData();
  }

  /**
   * Get underlying holdings information for a requested fund identifer.
   * Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type. 
   * @param ids List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; (required)
   * @param date Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
   * @param topn Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional, default to ALL)
   * @param assetType Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  (optional, default to EQ)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return ApiResponse&lt;FundHoldingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fund Holdings Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundHoldingsResponse> getOwnershipHoldingsWithHttpInfo(java.util.List<String> ids, String date, String topn, String assetType, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getOwnershipHoldings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-ownership/v1/fund-holdings";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topn", topn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetType", assetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FundHoldingsResponse
      
    > apiResponse = apiClient.invokeAPI("FundHoldingsApi.getOwnershipHoldings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipHoldingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get holdings for a list of funds.
   * Gets Holding information for a long list of Fund objects.
   * @param fundHoldingsRequest Requesting Underlying Holdings for a list of Fund Identifiers. (required)
   * @return FundHoldingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fund Holdings Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundHoldingsResponse postOwnershipHoldings(FundHoldingsRequest fundHoldingsRequest) throws ApiException {
    return postOwnershipHoldingsWithHttpInfo(fundHoldingsRequest).getData();
  }

  /**
   * Get holdings for a list of funds.
   * Gets Holding information for a long list of Fund objects.
   * @param fundHoldingsRequest Requesting Underlying Holdings for a list of Fund Identifiers. (required)
   * @return ApiResponse&lt;FundHoldingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fund Holdings Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundHoldingsResponse> postOwnershipHoldingsWithHttpInfo(FundHoldingsRequest fundHoldingsRequest) throws ApiException {
    Object localVarPostBody = fundHoldingsRequest;
    
    // verify the required parameter 'fundHoldingsRequest' is set
    if (fundHoldingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundHoldingsRequest' when calling postOwnershipHoldings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-ownership/v1/fund-holdings";

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
        
        FundHoldingsResponse
      
    > apiResponse = apiClient.invokeAPI("FundHoldingsApi.postOwnershipHoldings", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOwnershipHoldingsResponseTypeMap, false);

    return apiResponse;

  }
}
