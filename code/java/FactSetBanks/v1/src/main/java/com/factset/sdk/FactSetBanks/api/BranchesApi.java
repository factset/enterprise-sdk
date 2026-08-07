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

import com.factset.sdk.FactSetBanks.models.BranchesRequest;
import com.factset.sdk.FactSetBanks.models.BranchesResponse;
import com.factset.sdk.FactSetBanks.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BranchesApi {
  private ApiClient apiClient;

  public BranchesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BranchesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getBranchesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBranchesResponseTypeMap.put(200, new GenericType<BranchesResponse>(){});
    getBranchesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getBranchesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns bank branch and location data
   * Returns branch and location data for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — FDIC-insured bank branches with branch counts and deposit market share by county, ZIP, and MSA. 85,000+ current branches across 9,000+ banks and BHCs. Sourced from the FDIC Summary of Deposits (annual) and Institutions and Locations (weekly). Current-only feed; deposit balances as of the most recent June 30. * **CREDIT_UNION** — US credit union branches and ATMs with service flags. 5,800+ credit unions, 21,000+ branches, and 17,000+ ATM addresses; reported quarterly since September 2022. * **AUSTRALIA** — Service channel locations with remoteness classifications. 149+ banks; 30,000+ branches, 47,000+ ATMs, 6,600+ other face-to-face, and 4.9M+ EFTPOS channels. Annual data as of June 30. * **GLOBAL** — Global bank branches and ATMs ex-US with country, region, city, lat/long, postal, and street details where available. 300,000+ banks, 800,000+ locations, 180+ countries. Current-only feed. 
   * @param branchesRequest  (required)
   * @return BranchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Branch and location data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BranchesResponse getBranches(BranchesRequest branchesRequest) throws ApiException {
    return getBranchesWithHttpInfo(branchesRequest).getData();
  }

  /**
   * Returns bank branch and location data
   * Returns branch and location data for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — FDIC-insured bank branches with branch counts and deposit market share by county, ZIP, and MSA. 85,000+ current branches across 9,000+ banks and BHCs. Sourced from the FDIC Summary of Deposits (annual) and Institutions and Locations (weekly). Current-only feed; deposit balances as of the most recent June 30. * **CREDIT_UNION** — US credit union branches and ATMs with service flags. 5,800+ credit unions, 21,000+ branches, and 17,000+ ATM addresses; reported quarterly since September 2022. * **AUSTRALIA** — Service channel locations with remoteness classifications. 149+ banks; 30,000+ branches, 47,000+ ATMs, 6,600+ other face-to-face, and 4.9M+ EFTPOS channels. Annual data as of June 30. * **GLOBAL** — Global bank branches and ATMs ex-US with country, region, city, lat/long, postal, and street details where available. 300,000+ banks, 800,000+ locations, 180+ countries. Current-only feed. 
   * @param branchesRequest  (required)
   * @return ApiResponse&lt;BranchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Branch and location data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BranchesResponse> getBranchesWithHttpInfo(BranchesRequest branchesRequest) throws ApiException {
    Object localVarPostBody = branchesRequest;
    
    // verify the required parameter 'branchesRequest' is set
    if (branchesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'branchesRequest' when calling getBranches");
    }
    
    // create path and map variables
    String localVarPath = "/branches";

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
        
        BranchesResponse
      
    > apiResponse = apiClient.invokeAPI("BranchesApi.getBranches", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBranchesResponseTypeMap, false);

    return apiResponse;

  }
}
