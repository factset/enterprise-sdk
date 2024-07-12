package com.factset.sdk.IDLookup.api;

import com.factset.sdk.IDLookup.ApiException;
import com.factset.sdk.IDLookup.ApiClient;
import com.factset.sdk.IDLookup.ApiResponse;
import com.factset.sdk.IDLookup.Configuration;
import com.factset.sdk.IDLookup.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IDLookup.models.ErrorResponse;
import com.factset.sdk.IDLookup.models.HelperEndpoint;
import com.factset.sdk.IDLookup.models.LookupRequest;
import com.factset.sdk.IDLookup.models.LookupResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetIdLookupApi {
  private ApiClient apiClient;

  public FactSetIdLookupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetIdLookupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> helperResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    helperResponseTypeMap.put(200, new GenericType<HelperEndpoint>(){});
    helperResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    helperResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    helperResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    helperResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    helperResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> searchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchResponseTypeMap.put(200, new GenericType<LookupResponse>(){});
    searchResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    searchResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    searchResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    searchResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    searchResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Helper endpoint offering a list of supported fields and values to filter a requested dataset.
   * By querying this helper endpoint, users can retrieve a comprehensive list of supported fields, each associated with its permissible values. This functionality enhances the usability of the API by empowering users to construct precise queries tailored to their requirements when accessing the requested dataset. 
   * @param dataset Type of dataset. (required)
   * @return HelperEndpoint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Authorization Issue </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public HelperEndpoint helper(String dataset) throws ApiException {
    return helperWithHttpInfo(dataset).getData();
  }

  /**
   * Helper endpoint offering a list of supported fields and values to filter a requested dataset.
   * By querying this helper endpoint, users can retrieve a comprehensive list of supported fields, each associated with its permissible values. This functionality enhances the usability of the API by empowering users to construct precise queries tailored to their requirements when accessing the requested dataset. 
   * @param dataset Type of dataset. (required)
   * @return ApiResponse&lt;HelperEndpoint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Authorization Issue </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HelperEndpoint> helperWithHttpInfo(String dataset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataset' is set
    if (dataset == null) {
      throw new ApiException(400, "Missing the required parameter 'dataset' when calling helper");
    }
    
    // create path and map variables
    String localVarPath = "/metadata/fields/list-by-dataset";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataset", dataset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        HelperEndpoint
      
    > apiResponse = apiClient.invokeAPI("FactSetIdLookupApi.helper", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, helperResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search functionality to return tickers, company names, and unique identifiers for FactSet data.
   * This functionality enables users to input search queries, such as company names or keywords, and receive results containing matching entities along with their associated tickers and unique identifiers.   Essentially, it provides a streamlined means of locating specific data points within the FactSet database, facilitating the efficient retrieval of essential information related to companies or financial instruments.  The dataset names provided in the table below can be used in the request body.  | Dataset Name                | Dataset Description                 | ID Type           | ID Example   | |-----------------------------|-------------------------------------|-------------------|--------------| | *&#x60;bankLoans&#x60;*               | Bank Loans                          | symbol            | LX056750     | | *&#x60;commodities&#x60;*             | Commodities                         | symbol            | DUBAIM-FDS   | | *&#x60;cepBonds&#x60;*                | Continuous Evaluated Pricing        | tickerExchange    | N3ZWW5.FI-CEP| | *&#x60;countries&#x60;*               | Countries                           | symbol            | CC_MA        | | *&#x60;deals&#x60;*                   | Deals                               | symbol            | 4161715      | | *&#x60;economicReports&#x60;*             | Economic Reports                    | symbol            | USKEY-ECON   | | *&#x60;economicSeries&#x60;*          | Economic Series                     | symbol            | EUZ.GDPR     | | *&#x60;equities&#x60;*                | Equities                            | tickerRegion      | AAPL-US      | | *&#x60;equitiesRealTime&#x60;*        | Equities RealTime                   | tickerExchange    | M-BKK        | | *&#x60;etfs&#x60;*                    | ETFs                                | tickerRegion      | ACWI-US      | | *&#x60;etfsRealTime&#x60;*            | ETFs RealTime                       | symbol            | JPNA | *&#x60;exchangeRatesRealTime&#x60;*   | Exchange Rates RealTime             | symbol            | AUDUSD-FX1   | | *&#x60;bonds&#x60;*                   | Fixed Income                        | symbol            | XS2027359756 | | *&#x60;forex&#x60;*                   | Foreign Exchange                    | symbol            | USDARS       | | *&#x60;futures&#x60;*                 | Futures (continuous)                | symbol            | AP00-SFE     | | *&#x60;indices&#x60;*                 | Indices                             | symbol            | 186745       | | *&#x60;indicesRealTime&#x60;*         | Indices RealTime                    | symbol            | BB3MUS.A-PSE | | *&#x60;industries&#x60;*              | Industries                          | symbol            | FI1225R1     | | *&#x60;markitLoans&#x60;*             | Markit Loans                        | symbol            | LX111044-USA | | *&#x60;mutualFunds&#x60;*             | Mutual Funds                        | tickerRegion      | AMECX-US     | | *&#x60;mutualFundsRealTime&#x60;*     | Mutual Funds RealTime               | symbol            | 015414       | | *&#x60;ownershipHolders&#x60;*        | Ownership Holders                   | symbol            | F5102330     | | *&#x60;people&#x60;*                  | People                              | entityId          | 065SLB-E     | | *&#x60;privateCompanies&#x60;*        | Private Companies                   | entityId          | 0CBD2D-E     | | *&#x60;pevcFirms&#x60;*               | Private Equity/Venture Capital Firms| entityId          | 000BKX-E     | | *&#x60;pevcFunds&#x60;*               | Private Equity/Venture Capital Funds| entityId          | 0WCD0X-E     | | *&#x60;regions&#x60;*                 | Region                              | symbol            | RG_AMER      | | *&#x60;yields&#x60;*                  | Yields                              | symbol            | TRYAU10Y-FDS | | *&#x60;options&#x60;*                 | options                             | tickerExchange           | A#P1924C100000-USA| 
   * @param lookupRequest Request body to lookup any FactSet identifiers. (required)
   * @return LookupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Authorization Issue </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LookupResponse search(LookupRequest lookupRequest) throws ApiException {
    return searchWithHttpInfo(lookupRequest).getData();
  }

  /**
   * Search functionality to return tickers, company names, and unique identifiers for FactSet data.
   * This functionality enables users to input search queries, such as company names or keywords, and receive results containing matching entities along with their associated tickers and unique identifiers.   Essentially, it provides a streamlined means of locating specific data points within the FactSet database, facilitating the efficient retrieval of essential information related to companies or financial instruments.  The dataset names provided in the table below can be used in the request body.  | Dataset Name                | Dataset Description                 | ID Type           | ID Example   | |-----------------------------|-------------------------------------|-------------------|--------------| | *&#x60;bankLoans&#x60;*               | Bank Loans                          | symbol            | LX056750     | | *&#x60;commodities&#x60;*             | Commodities                         | symbol            | DUBAIM-FDS   | | *&#x60;cepBonds&#x60;*                | Continuous Evaluated Pricing        | tickerExchange    | N3ZWW5.FI-CEP| | *&#x60;countries&#x60;*               | Countries                           | symbol            | CC_MA        | | *&#x60;deals&#x60;*                   | Deals                               | symbol            | 4161715      | | *&#x60;economicReports&#x60;*             | Economic Reports                    | symbol            | USKEY-ECON   | | *&#x60;economicSeries&#x60;*          | Economic Series                     | symbol            | EUZ.GDPR     | | *&#x60;equities&#x60;*                | Equities                            | tickerRegion      | AAPL-US      | | *&#x60;equitiesRealTime&#x60;*        | Equities RealTime                   | tickerExchange    | M-BKK        | | *&#x60;etfs&#x60;*                    | ETFs                                | tickerRegion      | ACWI-US      | | *&#x60;etfsRealTime&#x60;*            | ETFs RealTime                       | symbol            | JPNA | *&#x60;exchangeRatesRealTime&#x60;*   | Exchange Rates RealTime             | symbol            | AUDUSD-FX1   | | *&#x60;bonds&#x60;*                   | Fixed Income                        | symbol            | XS2027359756 | | *&#x60;forex&#x60;*                   | Foreign Exchange                    | symbol            | USDARS       | | *&#x60;futures&#x60;*                 | Futures (continuous)                | symbol            | AP00-SFE     | | *&#x60;indices&#x60;*                 | Indices                             | symbol            | 186745       | | *&#x60;indicesRealTime&#x60;*         | Indices RealTime                    | symbol            | BB3MUS.A-PSE | | *&#x60;industries&#x60;*              | Industries                          | symbol            | FI1225R1     | | *&#x60;markitLoans&#x60;*             | Markit Loans                        | symbol            | LX111044-USA | | *&#x60;mutualFunds&#x60;*             | Mutual Funds                        | tickerRegion      | AMECX-US     | | *&#x60;mutualFundsRealTime&#x60;*     | Mutual Funds RealTime               | symbol            | 015414       | | *&#x60;ownershipHolders&#x60;*        | Ownership Holders                   | symbol            | F5102330     | | *&#x60;people&#x60;*                  | People                              | entityId          | 065SLB-E     | | *&#x60;privateCompanies&#x60;*        | Private Companies                   | entityId          | 0CBD2D-E     | | *&#x60;pevcFirms&#x60;*               | Private Equity/Venture Capital Firms| entityId          | 000BKX-E     | | *&#x60;pevcFunds&#x60;*               | Private Equity/Venture Capital Funds| entityId          | 0WCD0X-E     | | *&#x60;regions&#x60;*                 | Region                              | symbol            | RG_AMER      | | *&#x60;yields&#x60;*                  | Yields                              | symbol            | TRYAU10Y-FDS | | *&#x60;options&#x60;*                 | options                             | tickerExchange           | A#P1924C100000-USA| 
   * @param lookupRequest Request body to lookup any FactSet identifiers. (required)
   * @return ApiResponse&lt;LookupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Authorization Issue </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LookupResponse> searchWithHttpInfo(LookupRequest lookupRequest) throws ApiException {
    Object localVarPostBody = lookupRequest;
    
    // verify the required parameter 'lookupRequest' is set
    if (lookupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'lookupRequest' when calling search");
    }
    
    // create path and map variables
    String localVarPath = "/lookup";

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
        
        LookupResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetIdLookupApi.search", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchResponseTypeMap, false);

    return apiResponse;

  }
}
