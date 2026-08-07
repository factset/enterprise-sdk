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
import com.factset.sdk.FactSetBanks.models.Filings10DResponse;
import com.factset.sdk.FactSetBanks.models.FilingsUCC1Response;
import com.factset.sdk.FactSetBanks.models.TenDFilingsRequest;
import com.factset.sdk.FactSetBanks.models.Ucc1FilingsRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilingsApi {
  private ApiClient apiClient;

  public FilingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTenDFilingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTenDFilingsResponseTypeMap.put(200, new GenericType<Filings10DResponse>(){});
    getTenDFilingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getTenDFilingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUcc1FilingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUcc1FilingsResponseTypeMap.put(200, new GenericType<FilingsUCC1Response>(){});
    getUcc1FilingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getUcc1FilingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Form 10-D distribution reports
   * Returns SEC Form 10-D distribution reports for bank-issued asset-backed securities — pool performance and credit enhancement data including payments received, delinquencies, defaults, and cash flow distributions. Offers more frequent (monthly) insight into credit card receivables than 8-K/10-K filings.  Covers credit cards (110 data items) and auto loans (254 data items). History since 2017. Updated monthly.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FILINGS&#x60; * **subcategory**: &#x60;TEN_D&#x60; 
   * @param tenDFilingsRequest  (required)
   * @return Filings10DResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 10-D filing data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public Filings10DResponse getTenDFilings(TenDFilingsRequest tenDFilingsRequest) throws ApiException {
    return getTenDFilingsWithHttpInfo(tenDFilingsRequest).getData();
  }

  /**
   * Returns Form 10-D distribution reports
   * Returns SEC Form 10-D distribution reports for bank-issued asset-backed securities — pool performance and credit enhancement data including payments received, delinquencies, defaults, and cash flow distributions. Offers more frequent (monthly) insight into credit card receivables than 8-K/10-K filings.  Covers credit cards (110 data items) and auto loans (254 data items). History since 2017. Updated monthly.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FILINGS&#x60; * **subcategory**: &#x60;TEN_D&#x60; 
   * @param tenDFilingsRequest  (required)
   * @return ApiResponse&lt;Filings10DResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> 10-D filing data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Filings10DResponse> getTenDFilingsWithHttpInfo(TenDFilingsRequest tenDFilingsRequest) throws ApiException {
    Object localVarPostBody = tenDFilingsRequest;
    
    // verify the required parameter 'tenDFilingsRequest' is set
    if (tenDFilingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tenDFilingsRequest' when calling getTenDFilings");
    }
    
    // create path and map variables
    String localVarPath = "/ten-d";

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
        
        Filings10DResponse
      
    > apiResponse = apiClient.invokeAPI("FilingsApi.getTenDFilings", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTenDFilingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns UCC-1 filings data
   * Returns UCC-1 financing statement filings — notices filed by creditors of an interest in a debtor&#39;s personal property. Includes secured party (banking institution), debtor name, and filing details such as expiration date.  Covers 4,500+ banking institutions; history since 2002. Updated monthly. 
   * @param ucc1FilingsRequest  (required)
   * @return FilingsUCC1Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> UCC-1 filing data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FilingsUCC1Response getUcc1Filings(Ucc1FilingsRequest ucc1FilingsRequest) throws ApiException {
    return getUcc1FilingsWithHttpInfo(ucc1FilingsRequest).getData();
  }

  /**
   * Returns UCC-1 filings data
   * Returns UCC-1 financing statement filings — notices filed by creditors of an interest in a debtor&#39;s personal property. Includes secured party (banking institution), debtor name, and filing details such as expiration date.  Covers 4,500+ banking institutions; history since 2002. Updated monthly. 
   * @param ucc1FilingsRequest  (required)
   * @return ApiResponse&lt;FilingsUCC1Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> UCC-1 filing data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FilingsUCC1Response> getUcc1FilingsWithHttpInfo(Ucc1FilingsRequest ucc1FilingsRequest) throws ApiException {
    Object localVarPostBody = ucc1FilingsRequest;
    
    // verify the required parameter 'ucc1FilingsRequest' is set
    if (ucc1FilingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ucc1FilingsRequest' when calling getUcc1Filings");
    }
    
    // create path and map variables
    String localVarPath = "/ucc1";

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
        
        FilingsUCC1Response
      
    > apiResponse = apiClient.invokeAPI("FilingsApi.getUcc1Filings", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUcc1FilingsResponseTypeMap, false);

    return apiResponse;

  }
}
