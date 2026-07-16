package com.factset.sdk.FactSetRBICS.api;

import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiResponse;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetRBICS.models.ErrorsResponse;
import com.factset.sdk.FactSetRBICS.models.TradeNamesRequest;
import com.factset.sdk.FactSetRBICS.models.TradeNamesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TradeNamesApi {
  private ApiClient apiClient;

  public TradeNamesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradeNamesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTradeNamesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTradeNamesForListResponseTypeMap.put(200, new GenericType<TradeNamesResponse>(){});
    getTradeNamesForListResponseTypeMap.put(400, new GenericType<ErrorsResponse>(){});
    getTradeNamesForListResponseTypeMap.put(401, new GenericType<ErrorsResponse>(){});
    getTradeNamesForListResponseTypeMap.put(403, new GenericType<ErrorsResponse>(){});
    getTradeNamesForListResponseTypeMap.put(415, new GenericType<ErrorsResponse>(){});
    getTradeNamesForListResponseTypeMap.put(500, new GenericType<ErrorsResponse>(){});
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
   * Get a company&#39;s associated tradeNames and product lines.
   * RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company.   Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level. 
   * @param tradeNamesRequest Request Body to request a list of tradeName objects. (required)
   * @return TradeNamesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of RBICS Tradename Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TradeNamesResponse getTradeNamesForList(TradeNamesRequest tradeNamesRequest) throws ApiException {
    return getTradeNamesForListWithHttpInfo(tradeNamesRequest).getData();
  }

  /**
   * Get a company&#39;s associated tradeNames and product lines.
   * RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company.   Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level. 
   * @param tradeNamesRequest Request Body to request a list of tradeName objects. (required)
   * @return ApiResponse&lt;TradeNamesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of RBICS Tradename Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TradeNamesResponse> getTradeNamesForListWithHttpInfo(TradeNamesRequest tradeNamesRequest) throws ApiException {
    Object localVarPostBody = tradeNamesRequest;
    
    // verify the required parameter 'tradeNamesRequest' is set
    if (tradeNamesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tradeNamesRequest' when calling getTradeNamesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/trade-names";

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
        
        TradeNamesResponse
      
    > apiResponse = apiClient.invokeAPI("TradeNamesApi.getTradeNamesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTradeNamesForListResponseTypeMap, false);

    return apiResponse;

  }
}
