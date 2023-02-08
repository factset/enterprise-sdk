package com.factset.sdk.FactSetPrices.api;

import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiResponse;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrices.models.BatchStatusResponse;
import com.factset.sdk.FactSetPrices.models.ErrorResponse;
import com.factset.sdk.FactSetPrices.models.PricesFixedIncomeRequest;
import com.factset.sdk.FactSetPrices.models.PricesFixedIncomeResponse;
import com.factset.sdk.FactSetPrices.models.PricesRequest;
import com.factset.sdk.FactSetPrices.models.PricesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricesApi {
  private ApiClient apiClient;

  public PricesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFixedSecurityPricesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFixedSecurityPricesResponseTypeMap.put(200, new GenericType<PricesFixedIncomeResponse>(){});
    getFixedSecurityPricesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFixedSecurityPricesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFixedSecurityPricesForListResponseTypeMap.put(200, new GenericType<PricesFixedIncomeResponse>(){});
    getFixedSecurityPricesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFixedSecurityPricesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSecurityPricesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecurityPricesResponseTypeMap.put(200, new GenericType<PricesResponse>(){});
    getSecurityPricesResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getSecurityPricesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSecurityPricesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSecurityPricesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSecurityPricesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSecurityPricesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSecurityPricesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecurityPricesForListResponseTypeMap.put(200, new GenericType<PricesResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSecurityPricesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support GET /factset-prices/v1/prices returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code PricesResponse }<br>Array of security prices open, high, low, close, and volume.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetSecurityPricesResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     PricesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetSecurityPricesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetSecurityPricesResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public PricesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (PricesResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetSecurityPricesResponseWrapper other = (GetSecurityPricesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetSecurityPricesResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /factset-prices/v1/prices returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code PricesResponse }<br>Array of security prices</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetSecurityPricesForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     PricesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetSecurityPricesForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetSecurityPricesForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public PricesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (PricesResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetSecurityPricesForListResponseWrapper other = (GetSecurityPricesForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetSecurityPricesForListResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Gets pricing for a list of Fixed Income securities
   * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
   * @param ids The requested list of Fixed Income security identifiers. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  (optional, default to D)
   * @return PricesFixedIncomeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Fixed Income Security prices objects for date range requested </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PricesFixedIncomeResponse getFixedSecurityPrices(java.util.List<String> ids, String startDate, String endDate, String frequency) throws ApiException {
    return getFixedSecurityPricesWithHttpInfo(ids, startDate, endDate, frequency).getData();
  }

  /**
   * Gets pricing for a list of Fixed Income securities
   * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
   * @param ids The requested list of Fixed Income security identifiers. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  (optional, default to D)
   * @return ApiResponse&lt;PricesFixedIncomeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Fixed Income Security prices objects for date range requested </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PricesFixedIncomeResponse> getFixedSecurityPricesWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFixedSecurityPrices");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/fixed-income";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PricesFixedIncomeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getFixedSecurityPrices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFixedSecurityPricesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Requests pricing for a list of Fixed Income securities for date range requested
   * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
   * @param pricesFixedIncomeRequest Request object for Fixed Income &#x60;Security&#x60; prices. (required)
   * @return PricesFixedIncomeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Fixed Income Security prices objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PricesFixedIncomeResponse getFixedSecurityPricesForList(PricesFixedIncomeRequest pricesFixedIncomeRequest) throws ApiException {
    return getFixedSecurityPricesForListWithHttpInfo(pricesFixedIncomeRequest).getData();
  }

  /**
   * Requests pricing for a list of Fixed Income securities for date range requested
   * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
   * @param pricesFixedIncomeRequest Request object for Fixed Income &#x60;Security&#x60; prices. (required)
   * @return ApiResponse&lt;PricesFixedIncomeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Fixed Income Security prices objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PricesFixedIncomeResponse> getFixedSecurityPricesForListWithHttpInfo(PricesFixedIncomeRequest pricesFixedIncomeRequest) throws ApiException {
    Object localVarPostBody = pricesFixedIncomeRequest;
    
    // verify the required parameter 'pricesFixedIncomeRequest' is set
    if (pricesFixedIncomeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pricesFixedIncomeRequest' when calling getFixedSecurityPricesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/fixed-income";

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
        
        PricesFixedIncomeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getFixedSecurityPricesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFixedSecurityPricesForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets end-of-day Open, High, Low, Close for a list of securities.
   * Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  2000 per non-batch request / 5000 per batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param adjust Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  (optional, default to SPLIT)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  **Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \&quot;Report Issue\&quot; above and our support teams can assist.**  Once a batch request is submitted, use &#x60;batch/v1/status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;batch/v1/result&#x60;.  When using Batch, &#x60;ids&#x60; limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return GetSecurityPricesResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices open, high, low, close, and volume. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetSecurityPricesResponseWrapper getSecurityPrices(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar, String currency, String adjust, String batch) throws ApiException {
    return getSecurityPricesWithHttpInfo(ids, startDate, endDate, frequency, calendar, currency, adjust, batch).getData();
  }

  /**
   * Gets end-of-day Open, High, Low, Close for a list of securities.
   * Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  2000 per non-batch request / 5000 per batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param adjust Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  (optional, default to SPLIT)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  **Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \&quot;Report Issue\&quot; above and our support teams can assist.**  Once a batch request is submitted, use &#x60;batch/v1/status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;batch/v1/result&#x60;.  When using Batch, &#x60;ids&#x60; limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return ApiResponse&lt;GetSecurityPricesResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices open, high, low, close, and volume. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSecurityPricesResponseWrapper> getSecurityPricesWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar, String currency, String adjust, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSecurityPrices");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/prices";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjust", adjust));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getSecurityPrices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecurityPricesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetSecurityPricesResponseWrapper responseWrapper = new GetSecurityPricesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetSecurityPricesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Requests end-of-day Open, High, Low, Close for a large list of securities.
   *  Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
   * @param pricesRequest Request object for &#x60;Security&#x60; prices. (required)
   * @return GetSecurityPricesForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetSecurityPricesForListResponseWrapper getSecurityPricesForList(PricesRequest pricesRequest) throws ApiException {
    return getSecurityPricesForListWithHttpInfo(pricesRequest).getData();
  }

  /**
   * Requests end-of-day Open, High, Low, Close for a large list of securities.
   *  Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
   * @param pricesRequest Request object for &#x60;Security&#x60; prices. (required)
   * @return ApiResponse&lt;GetSecurityPricesForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSecurityPricesForListResponseWrapper> getSecurityPricesForListWithHttpInfo(PricesRequest pricesRequest) throws ApiException {
    Object localVarPostBody = pricesRequest;
    
    // verify the required parameter 'pricesRequest' is set
    if (pricesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pricesRequest' when calling getSecurityPricesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/prices";

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getSecurityPricesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecurityPricesForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetSecurityPricesForListResponseWrapper responseWrapper = new GetSecurityPricesForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetSecurityPricesForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
