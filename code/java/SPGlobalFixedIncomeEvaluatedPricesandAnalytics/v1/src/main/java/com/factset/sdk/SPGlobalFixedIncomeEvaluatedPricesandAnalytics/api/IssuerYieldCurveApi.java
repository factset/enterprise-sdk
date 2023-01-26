package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.api;

import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiException;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiClient;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiResponse;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.BondIssuerYieldCurveRequest;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.BondIssuerYieldCurveResponse;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IssuerYieldCurveApi {
  private ApiClient apiClient;

  public IssuerYieldCurveApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssuerYieldCurveApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getBondIssuerYieldCurveResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBondIssuerYieldCurveResponseTypeMap.put(200, new GenericType<BondIssuerYieldCurveResponse>(){});
    getBondIssuerYieldCurveResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getBondIssuerYieldCurveForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBondIssuerYieldCurveForListResponseTypeMap.put(200, new GenericType<BondIssuerYieldCurveResponse>(){});
    getBondIssuerYieldCurveForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBondIssuerYieldCurveForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get yield curve data for given date range and list of securities
   * Get yield curve data points and dates for 3M, 6M, 1Y, 2Y, 3Y, 4Y, 5Y, 6Y, 7Y, 8Y, 9Y, 10Y, 15Y, 20Y, 25Y, 30Y and 40Y provided by Markit for the specified date range and frequency. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D; 2000  per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @return BondIssuerYieldCurveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Issuer Yield Curve items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BondIssuerYieldCurveResponse getBondIssuerYieldCurve(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    return getBondIssuerYieldCurveWithHttpInfo(ids, startDate, endDate, frequency, calendar).getData();
  }

  /**
   * Get yield curve data for given date range and list of securities
   * Get yield curve data points and dates for 3M, 6M, 1Y, 2Y, 3Y, 4Y, 5Y, 6Y, 7Y, 8Y, 9Y, 10Y, 15Y, 20Y, 25Y, 30Y and 40Y provided by Markit for the specified date range and frequency. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D; 2000  per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @return ApiResponse&lt;BondIssuerYieldCurveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Issuer Yield Curve items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BondIssuerYieldCurveResponse> getBondIssuerYieldCurveWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getBondIssuerYieldCurve");
    }
    
    // create path and map variables
    String localVarPath = "/markit-bond-prices-and-analytics/v1/issuer-yield-curve";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calendar", calendar));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BondIssuerYieldCurveResponse
      
    > apiResponse = apiClient.invokeAPI("IssuerYieldCurveApi.getBondIssuerYieldCurve", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBondIssuerYieldCurveResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Request yield curve data for given date range and list of securities
   * Get yield curve data points and dates for 3M, 6M, 1Y, 2Y, 3Y, 4Y, 5Y, 6Y, 7Y, 8Y, 9Y, 10Y, 15Y, 20Y, 25Y, 30Y and 40Y provided by Markit for the specified date range and frequency. 
   * @param bondIssuerYieldCurveRequest Request object for requesting issuer yield curve data. (required)
   * @return BondIssuerYieldCurveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Issuer Yield Curve data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BondIssuerYieldCurveResponse getBondIssuerYieldCurveForList(BondIssuerYieldCurveRequest bondIssuerYieldCurveRequest) throws ApiException {
    return getBondIssuerYieldCurveForListWithHttpInfo(bondIssuerYieldCurveRequest).getData();
  }

  /**
   * Request yield curve data for given date range and list of securities
   * Get yield curve data points and dates for 3M, 6M, 1Y, 2Y, 3Y, 4Y, 5Y, 6Y, 7Y, 8Y, 9Y, 10Y, 15Y, 20Y, 25Y, 30Y and 40Y provided by Markit for the specified date range and frequency. 
   * @param bondIssuerYieldCurveRequest Request object for requesting issuer yield curve data. (required)
   * @return ApiResponse&lt;BondIssuerYieldCurveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Issuer Yield Curve data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BondIssuerYieldCurveResponse> getBondIssuerYieldCurveForListWithHttpInfo(BondIssuerYieldCurveRequest bondIssuerYieldCurveRequest) throws ApiException {
    Object localVarPostBody = bondIssuerYieldCurveRequest;
    
    // verify the required parameter 'bondIssuerYieldCurveRequest' is set
    if (bondIssuerYieldCurveRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bondIssuerYieldCurveRequest' when calling getBondIssuerYieldCurveForList");
    }
    
    // create path and map variables
    String localVarPath = "/markit-bond-prices-and-analytics/v1/issuer-yield-curve";

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
        
        BondIssuerYieldCurveResponse
      
    > apiResponse = apiClient.invokeAPI("IssuerYieldCurveApi.getBondIssuerYieldCurveForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBondIssuerYieldCurveForListResponseTypeMap, false);

    return apiResponse;

  }
}
