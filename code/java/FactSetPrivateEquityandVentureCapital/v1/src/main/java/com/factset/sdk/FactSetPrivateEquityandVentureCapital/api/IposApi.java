package com.factset.sdk.FactSetPrivateEquityandVentureCapital.api;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.ErrorResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.IPODetailsResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.IPOSearchRequest;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.IPOSearchResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IposApi {
  private ApiClient apiClient;

  public IposApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IposApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getIPOResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIPOResponseTypeMap.put(200, new GenericType<IPODetailsResponse>(){});
    getIPOResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getIPOResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getIPOResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getIPOResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getIPOResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> searchIPOsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchIPOsResponseTypeMap.put(200, new GenericType<IPOSearchResponse>(){});
    searchIPOsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    searchIPOsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    searchIPOsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    searchIPOsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    searchIPOsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
   * Provides comprehensive details on the **Initial Public Offering (IPO)** process for portfolio companies, typically representing an exit for a fund. Information includes the **IPO size**, **pricing**, date, and other relevant capital markets data.  Use the &#x60;/transactions/ma-activity&#x60; endpoint to find fund deal ids for your request.
   * @param ids A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger &amp; Acquisition (M&amp;A) or Venture Capital (VC) deal**. This ID represents the main event being tracked. (required)
   * @return IPODetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IPODetailsResponse getIPO(java.util.List<Integer> ids) throws ApiException {
    return getIPOWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
   * Provides comprehensive details on the **Initial Public Offering (IPO)** process for portfolio companies, typically representing an exit for a fund. Information includes the **IPO size**, **pricing**, date, and other relevant capital markets data.  Use the &#x60;/transactions/ma-activity&#x60; endpoint to find fund deal ids for your request.
   * @param ids A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger &amp; Acquisition (M&amp;A) or Venture Capital (VC) deal**. This ID represents the main event being tracked. (required)
   * @return ApiResponse&lt;IPODetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IPODetailsResponse> getIPOWithHttpInfo(java.util.List<Integer> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getIPO");
    }
    
    // create path and map variables
    String localVarPath = "/ipos";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IPODetailsResponse
      
    > apiResponse = apiClient.invokeAPI("IposApi.getIPO", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIPOResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search and filter the universe of portfolio company IPOs by status, size, and date range.
   * Enables filtering of the IPO universe by criteria such as **IPO status** (e.g., Completed, Withdrawn), the **date range** of the IPO, and the minimum or maximum **offering size** in USD.
   * @param ipOSearchRequest  (required)
   * @return IPOSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IPOSearchResponse searchIPOs(IPOSearchRequest ipOSearchRequest) throws ApiException {
    return searchIPOsWithHttpInfo(ipOSearchRequest).getData();
  }

  /**
   * Search and filter the universe of portfolio company IPOs by status, size, and date range.
   * Enables filtering of the IPO universe by criteria such as **IPO status** (e.g., Completed, Withdrawn), the **date range** of the IPO, and the minimum or maximum **offering size** in USD.
   * @param ipOSearchRequest  (required)
   * @return ApiResponse&lt;IPOSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IPOSearchResponse> searchIPOsWithHttpInfo(IPOSearchRequest ipOSearchRequest) throws ApiException {
    Object localVarPostBody = ipOSearchRequest;
    
    // verify the required parameter 'ipOSearchRequest' is set
    if (ipOSearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ipOSearchRequest' when calling searchIPOs");
    }
    
    // create path and map variables
    String localVarPath = "/ipos/search";

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
        
        IPOSearchResponse
      
    > apiResponse = apiClient.invokeAPI("IposApi.searchIPOs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchIPOsResponseTypeMap, false);

    return apiResponse;

  }
}
