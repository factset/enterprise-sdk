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
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundCashflowsRequest;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundCashflowsResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundDetailsResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundFundraisingResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundPortfolioCompaniesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FundsApi {
  private ApiClient apiClient;

  public FundsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFundResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundResponseTypeMap.put(200, new GenericType<FundDetailsResponse>(){});
    getFundResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundCashflowsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundCashflowsResponseTypeMap.put(200, new GenericType<FundCashflowsResponse>(){});
    getFundCashflowsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundCashflowsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundCashflowsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundCashflowsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundCashflowsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundFundraisingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundFundraisingResponseTypeMap.put(200, new GenericType<FundFundraisingResponse>(){});
    getFundFundraisingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundFundraisingResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundFundraisingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundFundraisingResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundFundraisingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundPortfolioCompaniesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundPortfolioCompaniesResponseTypeMap.put(200, new GenericType<FundPortfolioCompaniesResponse>(){});
    getFundPortfolioCompaniesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundPortfolioCompaniesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundPortfolioCompaniesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundPortfolioCompaniesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundPortfolioCompaniesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
   * Retrieves the main descriptive and profile information for one or more Private Equity or Venture Capital funds identified by their FactSet entity IDs. This includes key characteristics like fund status (e.g., Open, Closed), fund type (e.g., Venture, Buyout), vintage year, and high-level strategy details.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return FundDetailsResponse
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
  public FundDetailsResponse getFund(java.util.List<String> ids) throws ApiException {
    return getFundWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
   * Retrieves the main descriptive and profile information for one or more Private Equity or Venture Capital funds identified by their FactSet entity IDs. This includes key characteristics like fund status (e.g., Open, Closed), fund type (e.g., Venture, Buyout), vintage year, and high-level strategy details.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return ApiResponse&lt;FundDetailsResponse&gt;
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
  public ApiResponse<FundDetailsResponse> getFundWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFund");
    }
    
    // create path and map variables
    String localVarPath = "/funds";

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
        
        FundDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("FundsApi.getFund", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve time-series cash flow data (contributions and distributions) for specified funds.
   * Provides **quarterly** cash flow data for one or more funds, including **contributions** (capital calls) and **distributions** (payouts). This raw data is fundamental for calculating net cash flows and performance metrics like DPI, TVPI, and IRR.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param fundCashflowsRequest  (required)
   * @return FundCashflowsResponse
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
  public FundCashflowsResponse getFundCashflows(FundCashflowsRequest fundCashflowsRequest) throws ApiException {
    return getFundCashflowsWithHttpInfo(fundCashflowsRequest).getData();
  }

  /**
   * Retrieve time-series cash flow data (contributions and distributions) for specified funds.
   * Provides **quarterly** cash flow data for one or more funds, including **contributions** (capital calls) and **distributions** (payouts). This raw data is fundamental for calculating net cash flows and performance metrics like DPI, TVPI, and IRR.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param fundCashflowsRequest  (required)
   * @return ApiResponse&lt;FundCashflowsResponse&gt;
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
  public ApiResponse<FundCashflowsResponse> getFundCashflowsWithHttpInfo(FundCashflowsRequest fundCashflowsRequest) throws ApiException {
    Object localVarPostBody = fundCashflowsRequest;
    
    // verify the required parameter 'fundCashflowsRequest' is set
    if (fundCashflowsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundCashflowsRequest' when calling getFundCashflows");
    }
    
    // create path and map variables
    String localVarPath = "/funds/cashflows";

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
        
        FundCashflowsResponse
      
    > apiResponse = apiClient.invokeAPI("FundsApi.getFundCashflows", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundCashflowsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
   * Provides detailed information on the **fundraising lifecycle** of one or more funds, including data on interim and **final closes**, the **total amount raised** (fund size), and the as-reported currency for each fundraising round.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return FundFundraisingResponse
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
  public FundFundraisingResponse getFundFundraising(java.util.List<String> ids) throws ApiException {
    return getFundFundraisingWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
   * Provides detailed information on the **fundraising lifecycle** of one or more funds, including data on interim and **final closes**, the **total amount raised** (fund size), and the as-reported currency for each fundraising round.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return ApiResponse&lt;FundFundraisingResponse&gt;
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
  public ApiResponse<FundFundraisingResponse> getFundFundraisingWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundFundraising");
    }
    
    // create path and map variables
    String localVarPath = "/funds/fundraising";

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
        
        FundFundraisingResponse
      
    > apiResponse = apiClient.invokeAPI("FundsApi.getFundFundraising", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundFundraisingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.
   * Provides a list of **FactSet entity identifiers** for the portfolio companies in which a specified fund has invested. This endpoint is key for analyzing a fund&#39;s holdings and exposure to different companies in the private market.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return FundPortfolioCompaniesResponse
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
  public FundPortfolioCompaniesResponse getFundPortfolioCompanies(java.util.List<String> ids) throws ApiException {
    return getFundPortfolioCompaniesWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.
   * Provides a list of **FactSet entity identifiers** for the portfolio companies in which a specified fund has invested. This endpoint is key for analyzing a fund&#39;s holdings and exposure to different companies in the private market.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return ApiResponse&lt;FundPortfolioCompaniesResponse&gt;
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
  public ApiResponse<FundPortfolioCompaniesResponse> getFundPortfolioCompaniesWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundPortfolioCompanies");
    }
    
    // create path and map variables
    String localVarPath = "/funds/portfolio-companies";

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
        
        FundPortfolioCompaniesResponse
      
    > apiResponse = apiClient.invokeAPI("FundsApi.getFundPortfolioCompanies", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundPortfolioCompaniesResponseTypeMap, false);

    return apiResponse;

  }
}
