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
import com.factset.sdk.FactSetBanks.models.SearchEntitiesRequest;
import com.factset.sdk.FactSetBanks.models.SearchEntitiesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SearchEntitiesApi {
  private ApiClient apiClient;

  public SearchEntitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchEntitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSearchEntitiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSearchEntitiesResponseTypeMap.put(200, new GenericType<SearchEntitiesResponse>(){});
    getSearchEntitiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getSearchEntitiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name
   * Finds the subsidiary or private affiliate entity IDs needed to query other Banks API endpoints from a given parent ticker, ultimate parent entity ID, or entity name. Several endpoints require an entity ID that differs from the parent&#39;s public ticker:  * &#x60;/financials&#x60;, &#x60;/branches&#x60;, and &#x60;/country-exposure&#x60; require bank entities from the parent company. * &#x60;/ubpr&#x60;, &#x60;/ucc1&#x60;, and &#x60;/deposit-rates&#x60; require the **subsidiary** bank entity, not the holding company. * &#x60;/ten-d&#x60; requires the **asset-backed trust** entity, not the subsidiary bank or holding company. For auto loan securitizations, the trust&#39;s ultimate parent may itself be a non-bank company (e.g., an auto manufacturer&#39;s finance arm like GM Financial, Toyota Financial, or Harley-Davidson Financial). * &#x60;/aum/ria&#x60; requires the **private Registered Investment Adviser** entity. * &#x60;/focus&#x60; requires the **private broker-dealer** entity.  Use &#x60;reportType&#x60; to select which of these destination endpoints you&#39;re resolving entities for; only entities eligible for that report type are returned, and the response&#39;s &#x60;reportType&#x60; field echoes back your selection. Pass the resulting &#x60;factsetEntityId&#x60; values into the &#x60;ids&#x60; field of the corresponding endpoint.  Not every bank has a holding company above it with its own ticker — for those, use &#x60;searchText&#x60; to look the entity up by (partial) name instead of &#x60;ids&#x60;. At least one of &#x60;ids&#x60; or &#x60;searchText&#x60; is required.  **Date filtering behavior:** * **No dates entered**: Returns only currently active subsidiaries (those with no end date). * **Dates entered**: Returns only subsidiaries active during the specified time period. * **End date is null**: The end date defaults to today&#39;s date for filtering purposes. 
   * @param searchEntitiesRequest  (required)
   * @return SearchEntitiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Search entity data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SearchEntitiesResponse getSearchEntities(SearchEntitiesRequest searchEntitiesRequest) throws ApiException {
    return getSearchEntitiesWithHttpInfo(searchEntitiesRequest).getData();
  }

  /**
   * Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name
   * Finds the subsidiary or private affiliate entity IDs needed to query other Banks API endpoints from a given parent ticker, ultimate parent entity ID, or entity name. Several endpoints require an entity ID that differs from the parent&#39;s public ticker:  * &#x60;/financials&#x60;, &#x60;/branches&#x60;, and &#x60;/country-exposure&#x60; require bank entities from the parent company. * &#x60;/ubpr&#x60;, &#x60;/ucc1&#x60;, and &#x60;/deposit-rates&#x60; require the **subsidiary** bank entity, not the holding company. * &#x60;/ten-d&#x60; requires the **asset-backed trust** entity, not the subsidiary bank or holding company. For auto loan securitizations, the trust&#39;s ultimate parent may itself be a non-bank company (e.g., an auto manufacturer&#39;s finance arm like GM Financial, Toyota Financial, or Harley-Davidson Financial). * &#x60;/aum/ria&#x60; requires the **private Registered Investment Adviser** entity. * &#x60;/focus&#x60; requires the **private broker-dealer** entity.  Use &#x60;reportType&#x60; to select which of these destination endpoints you&#39;re resolving entities for; only entities eligible for that report type are returned, and the response&#39;s &#x60;reportType&#x60; field echoes back your selection. Pass the resulting &#x60;factsetEntityId&#x60; values into the &#x60;ids&#x60; field of the corresponding endpoint.  Not every bank has a holding company above it with its own ticker — for those, use &#x60;searchText&#x60; to look the entity up by (partial) name instead of &#x60;ids&#x60;. At least one of &#x60;ids&#x60; or &#x60;searchText&#x60; is required.  **Date filtering behavior:** * **No dates entered**: Returns only currently active subsidiaries (those with no end date). * **Dates entered**: Returns only subsidiaries active during the specified time period. * **End date is null**: The end date defaults to today&#39;s date for filtering purposes. 
   * @param searchEntitiesRequest  (required)
   * @return ApiResponse&lt;SearchEntitiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Search entity data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchEntitiesResponse> getSearchEntitiesWithHttpInfo(SearchEntitiesRequest searchEntitiesRequest) throws ApiException {
    Object localVarPostBody = searchEntitiesRequest;
    
    // verify the required parameter 'searchEntitiesRequest' is set
    if (searchEntitiesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchEntitiesRequest' when calling getSearchEntities");
    }
    
    // create path and map variables
    String localVarPath = "/search-entities";

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
        
        SearchEntitiesResponse
      
    > apiResponse = apiClient.invokeAPI("SearchEntitiesApi.getSearchEntities", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSearchEntitiesResponseTypeMap, false);

    return apiResponse;

  }
}
