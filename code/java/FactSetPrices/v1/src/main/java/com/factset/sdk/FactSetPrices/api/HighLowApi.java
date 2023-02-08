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

import com.factset.sdk.FactSetPrices.models.ErrorResponse;
import com.factset.sdk.FactSetPrices.models.HighLowRequest;
import com.factset.sdk.FactSetPrices.models.HighLowResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HighLowApi {
  private ApiClient apiClient;

  public HighLowApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HighLowApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getHighLowResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getHighLowResponseTypeMap.put(200, new GenericType<HighLowResponse>(){});
    getHighLowResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getHighLowResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getHighLowResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getHighLowResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getHighLowResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getHighLowForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getHighLowForListResponseTypeMap.put(200, new GenericType<HighLowResponse>(){});
    getHighLowForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getHighLowForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getHighLowForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getHighLowForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getHighLowForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Gets the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
   * For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param date The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param period The period of measure for the security&#39;s high and low pricing. This does not change display &#x60;frequency&#x60; but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** &#x3D; Year-to-Date   * **Y** &#x3D;  Actual Annual, based on the start date.  (optional, default to 52W)
   * @param priceType Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured.  (optional, default to CLOSE)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param adjust Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  (optional, default to SPLIT)
   * @return HighLowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of price high and price low values. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public HighLowResponse getHighLow(java.util.List<String> ids, String date, String period, String priceType, String calendar, String currency, String adjust) throws ApiException {
    return getHighLowWithHttpInfo(ids, date, period, priceType, calendar, currency, adjust).getData();
  }

  /**
   * Gets the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
   * For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param date The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param period The period of measure for the security&#39;s high and low pricing. This does not change display &#x60;frequency&#x60; but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** &#x3D; Year-to-Date   * **Y** &#x3D;  Actual Annual, based on the start date.  (optional, default to 52W)
   * @param priceType Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured.  (optional, default to CLOSE)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. (optional, default to FIVEDAY)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param adjust Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  (optional, default to SPLIT)
   * @return ApiResponse&lt;HighLowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of price high and price low values. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HighLowResponse> getHighLowWithHttpInfo(java.util.List<String> ids, String date, String period, String priceType, String calendar, String currency, String adjust) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getHighLow");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/high-low";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priceType", priceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calendar", calendar));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjust", adjust));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        HighLowResponse
      
    > apiResponse = apiClient.invokeAPI("HighLowApi.getHighLow", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getHighLowResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Requests the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
   * For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 
   * @param highLowRequest Request object for high low prices. (required)
   * @return HighLowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of company price high and price low values. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public HighLowResponse getHighLowForList(HighLowRequest highLowRequest) throws ApiException {
    return getHighLowForListWithHttpInfo(highLowRequest).getData();
  }

  /**
   * Requests the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
   * For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 
   * @param highLowRequest Request object for high low prices. (required)
   * @return ApiResponse&lt;HighLowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of company price high and price low values. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HighLowResponse> getHighLowForListWithHttpInfo(HighLowRequest highLowRequest) throws ApiException {
    Object localVarPostBody = highLowRequest;
    
    // verify the required parameter 'highLowRequest' is set
    if (highLowRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'highLowRequest' when calling getHighLowForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/high-low";

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
        
        HighLowResponse
      
    > apiResponse = apiClient.invokeAPI("HighLowApi.getHighLowForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getHighLowForListResponseTypeMap, false);

    return apiResponse;

  }
}
