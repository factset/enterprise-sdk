package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.api;

import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiException;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiClient;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiResponse;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.BondSensitivityRequest;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.BondSensitivityResponse;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SensitivityApi {
  private ApiClient apiClient;

  public SensitivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SensitivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getBondSensitivityResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBondSensitivityResponseTypeMap.put(200, new GenericType<BondSensitivityResponse>(){});
    getBondSensitivityResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBondSensitivityResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBondSensitivityResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBondSensitivityResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBondSensitivityResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getBondSensitivityForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBondSensitivityForListResponseTypeMap.put(200, new GenericType<BondSensitivityResponse>(){});
    getBondSensitivityForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBondSensitivityForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBondSensitivityForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBondSensitivityForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBondSensitivityForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get the bond sensitivity data for a list of securities
   * Get the sensitivity information like convexity, effective convexity, effective duration, Macaulay duration and modified duration provided by Markit for the specified date range and frequency. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D; 2000  per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @return BondSensitivityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Sensitivity items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BondSensitivityResponse getBondSensitivity(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    return getBondSensitivityWithHttpInfo(ids, startDate, endDate, frequency, calendar).getData();
  }

  /**
   * Get the bond sensitivity data for a list of securities
   * Get the sensitivity information like convexity, effective convexity, effective duration, Macaulay duration and modified duration provided by Markit for the specified date range and frequency. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D; 2000  per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @return ApiResponse&lt;BondSensitivityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Sensitivity items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BondSensitivityResponse> getBondSensitivityWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getBondSensitivity");
    }
    
    // create path and map variables
    String localVarPath = "/markit-bond-prices-and-analytics/v1/sensitivity";

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
        
        BondSensitivityResponse
      
    > apiResponse = apiClient.invokeAPI("SensitivityApi.getBondSensitivity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBondSensitivityResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Request the bond sensitivity data for a list of securities
   * Get the sensitivity information like convexity, effective convexity, effective duration, Macaulay duration and modified duration provided by Markit for the specified date range and frequency. 
   * @param bondSensitivityRequest Request object for requesting sensitivity data (required)
   * @return BondSensitivityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Prices data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BondSensitivityResponse getBondSensitivityForList(BondSensitivityRequest bondSensitivityRequest) throws ApiException {
    return getBondSensitivityForListWithHttpInfo(bondSensitivityRequest).getData();
  }

  /**
   * Request the bond sensitivity data for a list of securities
   * Get the sensitivity information like convexity, effective convexity, effective duration, Macaulay duration and modified duration provided by Markit for the specified date range and frequency. 
   * @param bondSensitivityRequest Request object for requesting sensitivity data (required)
   * @return ApiResponse&lt;BondSensitivityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bond Prices data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BondSensitivityResponse> getBondSensitivityForListWithHttpInfo(BondSensitivityRequest bondSensitivityRequest) throws ApiException {
    Object localVarPostBody = bondSensitivityRequest;
    
    // verify the required parameter 'bondSensitivityRequest' is set
    if (bondSensitivityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bondSensitivityRequest' when calling getBondSensitivityForList");
    }
    
    // create path and map variables
    String localVarPath = "/markit-bond-prices-and-analytics/v1/sensitivity";

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
        
        BondSensitivityResponse
      
    > apiResponse = apiClient.invokeAPI("SensitivityApi.getBondSensitivityForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBondSensitivityForListResponseTypeMap, false);

    return apiResponse;

  }
}
