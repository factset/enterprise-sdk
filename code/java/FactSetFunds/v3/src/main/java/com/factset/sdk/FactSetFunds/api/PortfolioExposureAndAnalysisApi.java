package com.factset.sdk.FactSetFunds.api;

import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiResponse;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFunds.models.AnalyticsType;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.FinancialsKeyItemsRequest;
import com.factset.sdk.FactSetFunds.models.FinancialsKeyItemsResponse;
import com.factset.sdk.FactSetFunds.models.Frequency;
import com.factset.sdk.FactSetFunds.models.KeyItemsType;
import java.time.LocalDate;
import com.factset.sdk.FactSetFunds.models.PortfolioAnalyticsRequest;
import com.factset.sdk.FactSetFunds.models.PortfolioAnalyticsResponse;
import com.factset.sdk.FactSetFunds.models.PortfolioStatisticsRequest;
import com.factset.sdk.FactSetFunds.models.PortfolioStatisticsResponse;
import com.factset.sdk.FactSetFunds.models.RiskAnalyticsRequest;
import com.factset.sdk.FactSetFunds.models.RiskAnalyticsResponse;
import com.factset.sdk.FactSetFunds.models.RiskType;
import com.factset.sdk.FactSetFunds.models.TopHoldingsRequest;
import com.factset.sdk.FactSetFunds.models.TopHoldingsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PortfolioExposureAndAnalysisApi {
  private ApiClient apiClient;

  public PortfolioExposureAndAnalysisApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortfolioExposureAndAnalysisApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFinancialKeyItemsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialKeyItemsResponseTypeMap.put(200, new GenericType<FinancialsKeyItemsResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFinancialKeyItemsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialKeyItemsForListResponseTypeMap.put(200, new GenericType<FinancialsKeyItemsResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFinancialKeyItemsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPortfolioAnalyticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioAnalyticsResponseTypeMap.put(200, new GenericType<PortfolioAnalyticsResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPortfolioAnalyticsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioAnalyticsForListResponseTypeMap.put(200, new GenericType<PortfolioAnalyticsResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getPortfolioAnalyticsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPortfolioStatisticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioStatisticsResponseTypeMap.put(200, new GenericType<PortfolioStatisticsResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPortfolioStatisticsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioStatisticsForListResponseTypeMap.put(200, new GenericType<PortfolioStatisticsResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getPortfolioStatisticsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getRiskAnalyticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRiskAnalyticsResponseTypeMap.put(200, new GenericType<RiskAnalyticsResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getRiskAnalyticsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRiskAnalyticsForListResponseTypeMap.put(200, new GenericType<RiskAnalyticsResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getRiskAnalyticsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getTop10HoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTop10HoldingsResponseTypeMap.put(200, new GenericType<TopHoldingsResponse>(){});
    getTop10HoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getTop10HoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getTop10HoldingsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTop10HoldingsForListResponseTypeMap.put(200, new GenericType<TopHoldingsResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getTop10HoldingsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get Financial Key Items for Funds
   * Get Last Twelve Months (LTM) Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param keyItemsType The Key Items type report. (optional, default to GROWTH)
   * @return FinancialsKeyItemsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialsKeyItemsResponse getFinancialKeyItems(java.util.List<String> ids, KeyItemsType keyItemsType) throws ApiException {
    return getFinancialKeyItemsWithHttpInfo(ids, keyItemsType).getData();
  }

  /**
   * Get Financial Key Items for Funds
   * Get Last Twelve Months (LTM) Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param keyItemsType The Key Items type report. (optional, default to GROWTH)
   * @return ApiResponse&lt;FinancialsKeyItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialsKeyItemsResponse> getFinancialKeyItemsWithHttpInfo(java.util.List<String> ids, KeyItemsType keyItemsType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFinancialKeyItems");
    }
    
    // create path and map variables
    String localVarPath = "/financials/key-items";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyItemsType", keyItemsType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FinancialsKeyItemsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getFinancialKeyItems", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialKeyItemsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Financial Key Items for Funds
   * Get Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param financialsKeyItemsRequest  (required)
   * @return FinancialsKeyItemsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialsKeyItemsResponse getFinancialKeyItemsForList(FinancialsKeyItemsRequest financialsKeyItemsRequest) throws ApiException {
    return getFinancialKeyItemsForListWithHttpInfo(financialsKeyItemsRequest).getData();
  }

  /**
   * Get Financial Key Items for Funds
   * Get Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param financialsKeyItemsRequest  (required)
   * @return ApiResponse&lt;FinancialsKeyItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialsKeyItemsResponse> getFinancialKeyItemsForListWithHttpInfo(FinancialsKeyItemsRequest financialsKeyItemsRequest) throws ApiException {
    Object localVarPostBody = financialsKeyItemsRequest;
    
    // verify the required parameter 'financialsKeyItemsRequest' is set
    if (financialsKeyItemsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'financialsKeyItemsRequest' when calling getFinancialKeyItemsForList");
    }
    
    // create path and map variables
    String localVarPath = "/financials/key-items";

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
        
        FinancialsKeyItemsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getFinancialKeyItemsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialKeyItemsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
   * Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param analyticsType Type of portfolio analytics data items to be returned.  * **ASSETALLOCATION**: Returns the asset types weights in the fund&#39;s portfolio. * **SECTOR_WEIGHTAGE**: Returns the weighted average percent of revenue derived from multiple industries for a universe of companies. Data is available for L1(Economy) level of the RBICS Classification. For more details, visit [Online Assistant Page   #20710](https://oa.apps.factset.com/pages/20710) * **GEOGRAPHIC_REVENUE**: Returns an aggregated percent of revenue derived based on super region for a universe of companies. For more details, visit [Online Assistant Page   #17555](https://oa.apps.factset.com/pages/17555) * **MARKET_CAPITALIZATION**: Returns the percentage of the aggregate that is composed of large-cap, mid-cap, small-cap and micro-cap holdings  (optional, default to ASSET_ALLOCATION)
   * @return PortfolioAnalyticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PortfolioAnalyticsResponse getPortfolioAnalytics(java.util.List<String> ids, AnalyticsType analyticsType) throws ApiException {
    return getPortfolioAnalyticsWithHttpInfo(ids, analyticsType).getData();
  }

  /**
   * Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
   * Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param analyticsType Type of portfolio analytics data items to be returned.  * **ASSETALLOCATION**: Returns the asset types weights in the fund&#39;s portfolio. * **SECTOR_WEIGHTAGE**: Returns the weighted average percent of revenue derived from multiple industries for a universe of companies. Data is available for L1(Economy) level of the RBICS Classification. For more details, visit [Online Assistant Page   #20710](https://oa.apps.factset.com/pages/20710) * **GEOGRAPHIC_REVENUE**: Returns an aggregated percent of revenue derived based on super region for a universe of companies. For more details, visit [Online Assistant Page   #17555](https://oa.apps.factset.com/pages/17555) * **MARKET_CAPITALIZATION**: Returns the percentage of the aggregate that is composed of large-cap, mid-cap, small-cap and micro-cap holdings  (optional, default to ASSET_ALLOCATION)
   * @return ApiResponse&lt;PortfolioAnalyticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortfolioAnalyticsResponse> getPortfolioAnalyticsWithHttpInfo(java.util.List<String> ids, AnalyticsType analyticsType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getPortfolioAnalytics");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/analytics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "analyticsType", analyticsType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PortfolioAnalyticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getPortfolioAnalytics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioAnalyticsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
   * Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter data for a large list of IDs. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param portfolioAnalyticsRequest  (required)
   * @return PortfolioAnalyticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PortfolioAnalyticsResponse getPortfolioAnalyticsForList(PortfolioAnalyticsRequest portfolioAnalyticsRequest) throws ApiException {
    return getPortfolioAnalyticsForListWithHttpInfo(portfolioAnalyticsRequest).getData();
  }

  /**
   * Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
   * Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter data for a large list of IDs. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param portfolioAnalyticsRequest  (required)
   * @return ApiResponse&lt;PortfolioAnalyticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortfolioAnalyticsResponse> getPortfolioAnalyticsForListWithHttpInfo(PortfolioAnalyticsRequest portfolioAnalyticsRequest) throws ApiException {
    Object localVarPostBody = portfolioAnalyticsRequest;
    
    // verify the required parameter 'portfolioAnalyticsRequest' is set
    if (portfolioAnalyticsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'portfolioAnalyticsRequest' when calling getPortfolioAnalyticsForList");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/analytics";

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
        
        PortfolioAnalyticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getPortfolioAnalyticsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioAnalyticsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Portfolio Statistics for Funds
   * Fetch Last Twelve Months (LTM) Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return PortfolioStatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Portfolio Statistics response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PortfolioStatisticsResponse getPortfolioStatistics(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getPortfolioStatisticsWithHttpInfo(ids, startDate, endDate, frequency, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Portfolio Statistics for Funds
   * Fetch Last Twelve Months (LTM) Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;PortfolioStatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Portfolio Statistics response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortfolioStatisticsResponse> getPortfolioStatisticsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getPortfolioStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/statistics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PortfolioStatisticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getPortfolioStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioStatisticsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Portfolio Statistics for Funds
   * Fetch Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param portfolioStatisticsRequest Portfolio Statistics request body. (required)
   * @return PortfolioStatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Portfolio Statistics object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PortfolioStatisticsResponse getPortfolioStatisticsForList(PortfolioStatisticsRequest portfolioStatisticsRequest) throws ApiException {
    return getPortfolioStatisticsForListWithHttpInfo(portfolioStatisticsRequest).getData();
  }

  /**
   * Get Portfolio Statistics for Funds
   * Fetch Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param portfolioStatisticsRequest Portfolio Statistics request body. (required)
   * @return ApiResponse&lt;PortfolioStatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Portfolio Statistics object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortfolioStatisticsResponse> getPortfolioStatisticsForListWithHttpInfo(PortfolioStatisticsRequest portfolioStatisticsRequest) throws ApiException {
    Object localVarPostBody = portfolioStatisticsRequest;
    
    // verify the required parameter 'portfolioStatisticsRequest' is set
    if (portfolioStatisticsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'portfolioStatisticsRequest' when calling getPortfolioStatisticsForList");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/statistics";

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
        
        PortfolioStatisticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getPortfolioStatisticsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioStatisticsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Credit Risk and Rate Risk Analytics
   * Returns credit risk or rate risk analytics based on the &#x60;riskType&#x60; parameter.This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param riskType Type of risk analytics to return. (optional, default to CREDIT_RISK)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return RiskAnalyticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RiskAnalyticsResponse getRiskAnalytics(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, RiskType riskType, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getRiskAnalyticsWithHttpInfo(ids, startDate, endDate, frequency, currency, riskType, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Credit Risk and Rate Risk Analytics
   * Returns credit risk or rate risk analytics based on the &#x60;riskType&#x60; parameter.This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param riskType Type of risk analytics to return. (optional, default to CREDIT_RISK)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;RiskAnalyticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RiskAnalyticsResponse> getRiskAnalyticsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, RiskType riskType, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRiskAnalytics");
    }
    
    // create path and map variables
    String localVarPath = "/risk-analytics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "riskType", riskType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RiskAnalyticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getRiskAnalytics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRiskAnalyticsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Credit Risk and Rate Risk Analytics.
   * Returns credit risk or rate risk analytics for a large list of IDs based on the &#x60;riskType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param riskAnalyticsRequest  (required)
   * @return RiskAnalyticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RiskAnalyticsResponse getRiskAnalyticsForList(RiskAnalyticsRequest riskAnalyticsRequest) throws ApiException {
    return getRiskAnalyticsForListWithHttpInfo(riskAnalyticsRequest).getData();
  }

  /**
   * Get Credit Risk and Rate Risk Analytics.
   * Returns credit risk or rate risk analytics for a large list of IDs based on the &#x60;riskType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.
   * @param riskAnalyticsRequest  (required)
   * @return ApiResponse&lt;RiskAnalyticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RiskAnalyticsResponse> getRiskAnalyticsForListWithHttpInfo(RiskAnalyticsRequest riskAnalyticsRequest) throws ApiException {
    Object localVarPostBody = riskAnalyticsRequest;
    
    // verify the required parameter 'riskAnalyticsRequest' is set
    if (riskAnalyticsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'riskAnalyticsRequest' when calling getRiskAnalyticsForList");
    }
    
    // create path and map variables
    String localVarPath = "/risk-analytics";

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
        
        RiskAnalyticsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getRiskAnalyticsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRiskAnalyticsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Top 10 Holdings
   * Returns the top 10 holdings for the requested fund or ETF.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return TopHoldingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TopHoldingsResponse getTop10Holdings(java.util.List<String> ids) throws ApiException {
    return getTop10HoldingsWithHttpInfo(ids).getData();
  }

  /**
   * Get Top 10 Holdings
   * Returns the top 10 holdings for the requested fund or ETF.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  200 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return ApiResponse&lt;TopHoldingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TopHoldingsResponse> getTop10HoldingsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTop10Holdings");
    }
    
    // create path and map variables
    String localVarPath = "/holdings/top-10";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TopHoldingsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getTop10Holdings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTop10HoldingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Top 10 Holdings
   * Returns the top 10 holdings for a list of funds or ETFs.
   * @param topHoldingsRequest  (required)
   * @return TopHoldingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TopHoldingsResponse getTop10HoldingsForList(TopHoldingsRequest topHoldingsRequest) throws ApiException {
    return getTop10HoldingsForListWithHttpInfo(topHoldingsRequest).getData();
  }

  /**
   * Get Top 10 Holdings
   * Returns the top 10 holdings for a list of funds or ETFs.
   * @param topHoldingsRequest  (required)
   * @return ApiResponse&lt;TopHoldingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TopHoldingsResponse> getTop10HoldingsForListWithHttpInfo(TopHoldingsRequest topHoldingsRequest) throws ApiException {
    Object localVarPostBody = topHoldingsRequest;
    
    // verify the required parameter 'topHoldingsRequest' is set
    if (topHoldingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'topHoldingsRequest' when calling getTop10HoldingsForList");
    }
    
    // create path and map variables
    String localVarPath = "/holdings/top-10";

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
        
        TopHoldingsResponse
      
    > apiResponse = apiClient.invokeAPI("PortfolioExposureAndAnalysisApi.getTop10HoldingsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTop10HoldingsForListResponseTypeMap, false);

    return apiResponse;

  }
}
