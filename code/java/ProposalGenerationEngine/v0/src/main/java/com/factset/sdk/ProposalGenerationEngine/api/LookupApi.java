package com.factset.sdk.ProposalGenerationEngine.api;

import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiResponse;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProposalGenerationEngine.models.PagedSecurities;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LookupApi {
  private ApiClient apiClient;

  public LookupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LookupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSecuritiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecuritiesResponseTypeMap.put(200, new GenericType<PagedSecurities>(){});
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
   * 
   * search for securities within the security universe for the user/client
   * @param name search by (part of) security name (optional)
   * @param identifier search by security identifier (e.g. cusip or tradingSymbol). (optional)
   * @param asOfDate search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well (optional)
   * @param udfs specify list of UDFs to retrieve for every security in the result (optional)
   * @param paginationOffset Specifies the starting index for pagination. (optional)
   * @param paginationLimit Specifies the maximum number of results to return (optional)
   * @return PagedSecurities
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of investments </td><td>  -  </td></tr>
     </table>
   */
  public PagedSecurities getSecurities(String name, String identifier, String asOfDate, String udfs, Integer paginationOffset, Integer paginationLimit) throws ApiException {
    return getSecuritiesWithHttpInfo(name, identifier, asOfDate, udfs, paginationOffset, paginationLimit).getData();
  }

  /**
   * 
   * search for securities within the security universe for the user/client
   * @param name search by (part of) security name (optional)
   * @param identifier search by security identifier (e.g. cusip or tradingSymbol). (optional)
   * @param asOfDate search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well (optional)
   * @param udfs specify list of UDFs to retrieve for every security in the result (optional)
   * @param paginationOffset Specifies the starting index for pagination. (optional)
   * @param paginationLimit Specifies the maximum number of results to return (optional)
   * @return ApiResponse&lt;PagedSecurities&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of investments </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PagedSecurities> getSecuritiesWithHttpInfo(String name, String identifier, String asOfDate, String udfs, Integer paginationOffset, Integer paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/securities";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asOfDate", asOfDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "udfs", udfs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PagedSecurities
      
    > apiResponse = apiClient.invokeAPI("LookupApi.getSecurities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecuritiesResponseTypeMap, false);

    return apiResponse;

  }
}
