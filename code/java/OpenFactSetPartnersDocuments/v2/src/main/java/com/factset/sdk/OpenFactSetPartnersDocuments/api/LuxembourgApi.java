package com.factset.sdk.OpenFactSetPartnersDocuments.api;

import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenFactSetPartnersDocuments.models.AuthStatus;
import java.time.LocalDate;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.LuxResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LuxembourgApi {
  private ApiClient apiClient;

  public LuxembourgApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LuxembourgApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLuxembourgGreenbondsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLuxembourgGreenbondsDailyResponseTypeMap.put(200, new GenericType<LuxResponse>(){});
    getLuxembourgGreenbondsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getLuxembourgGreenbondsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getLuxembourgGreenbondsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getLuxembourgGreenbondsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
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
   * Returns daily files from Open:FactSet Partner - Luxembourg
   * Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param isin Specifies the ISIN of the record.  (optional)
   * @param preissuancePubDate The pre-issuance date of the record.  (optional)
   * @param type Please input the value as **idMap** to get the symbology files     (optional)
   * @return LuxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for luxembourg files. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LuxResponse getLuxembourgGreenbondsDaily(String sort, Integer paginationLimit, Integer paginationOffset, String isin, LocalDate preissuancePubDate, String type) throws ApiException {
    return getLuxembourgGreenbondsDailyWithHttpInfo(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type).getData();
  }

  /**
   * Returns daily files from Open:FactSet Partner - Luxembourg
   * Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param isin Specifies the ISIN of the record.  (optional)
   * @param preissuancePubDate The pre-issuance date of the record.  (optional)
   * @param type Please input the value as **idMap** to get the symbology files     (optional)
   * @return ApiResponse&lt;LuxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for luxembourg files. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LuxResponse> getLuxembourgGreenbondsDailyWithHttpInfo(String sort, Integer paginationLimit, Integer paginationOffset, String isin, LocalDate preissuancePubDate, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/luxembourg/green-bonds/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "preissuancePubDate", preissuancePubDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        LuxResponse
      
    > apiResponse = apiClient.invokeAPI("LuxembourgApi.getLuxembourgGreenbondsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLuxembourgGreenbondsDailyResponseTypeMap, false);

    return apiResponse;

  }
}
