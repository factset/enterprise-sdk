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

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.EntityStrategiesResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StrategiesApi {
  private ApiClient apiClient;

  public StrategiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StrategiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityStrategiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityStrategiesResponseTypeMap.put(200, new GenericType<EntityStrategiesResponse>(){});
    getEntityStrategiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityStrategiesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityStrategiesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityStrategiesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityStrategiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve detailed investment strategy mandates for a specified fund or General Partner.
   * Provides a granular breakdown of the defined investment mandate for a fund or General Partner (GP). The strategy is multi-faceted, covering areas such as target **geographic exposure** (region, country, state), preferred **industry/sector** focus, targeted **investment instruments** (e.g., debt, equity, convertible notes), and **control criteria**.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return EntityStrategiesResponse
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
  public EntityStrategiesResponse getEntityStrategies(java.util.List<String> ids) throws ApiException {
    return getEntityStrategiesWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve detailed investment strategy mandates for a specified fund or General Partner.
   * Provides a granular breakdown of the defined investment mandate for a fund or General Partner (GP). The strategy is multi-faceted, covering areas such as target **geographic exposure** (region, country, state), preferred **industry/sector** focus, targeted **investment instruments** (e.g., debt, equity, convertible notes), and **control criteria**.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return ApiResponse&lt;EntityStrategiesResponse&gt;
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
  public ApiResponse<EntityStrategiesResponse> getEntityStrategiesWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getEntityStrategies");
    }
    
    // create path and map variables
    String localVarPath = "/entities/strategies";

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
        
        EntityStrategiesResponse
      
    > apiResponse = apiClient.invokeAPI("StrategiesApi.getEntityStrategies", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityStrategiesResponseTypeMap, false);

    return apiResponse;

  }
}
