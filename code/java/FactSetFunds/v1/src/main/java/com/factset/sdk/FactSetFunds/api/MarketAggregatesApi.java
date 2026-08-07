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

import com.factset.sdk.FactSetFunds.models.BatchStatusResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.MarketAggregatesRequest;
import com.factset.sdk.FactSetFunds.models.MarketAggregatesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MarketAggregatesApi {
  private ApiClient apiClient;

  public MarketAggregatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketAggregatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getMarketAggregatesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMarketAggregatesResponseTypeMap.put(200, new GenericType<MarketAggregatesResponse>(){});
    getMarketAggregatesResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getMarketAggregatesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getMarketAggregatesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getMarketAggregatesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getMarketAggregatesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getMarketAggregatesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getMarketAggregatesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMarketAggregatesForListResponseTypeMap.put(200, new GenericType<MarketAggregatesResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getMarketAggregatesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support GET /factset-funds/v1/aggregates/market returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code MarketAggregatesResponse }<br>The Market Aggregates response object.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetMarketAggregatesResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     MarketAggregatesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetMarketAggregatesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetMarketAggregatesResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public MarketAggregatesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (MarketAggregatesResponse) this.response;
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
      GetMarketAggregatesResponseWrapper other = (GetMarketAggregatesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetMarketAggregatesResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /factset-funds/v1/aggregates/market returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code MarketAggregatesResponse }<br>The Market Aggregates response object.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetMarketAggregatesForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     MarketAggregatesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetMarketAggregatesForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetMarketAggregatesForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public MarketAggregatesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (MarketAggregatesResponse) this.response;
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
      GetMarketAggregatesForListResponseWrapper other = (GetMarketAggregatesForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetMarketAggregatesForListResponseWrapper {\n"
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
   * Get market aggregates for a requested time series.
   * Retrieves FactSet market aggregate data for the funds and date range specified. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)   - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 1500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method.  (required)
   * @param startDate The &#x60;start date&#x60; requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     (optional, default to M)
   * @param currency Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.     (optional, default to N)
   * @return GetMarketAggregatesResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Market Aggregates response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetMarketAggregatesResponseWrapper getMarketAggregates(java.util.List<String> ids, String startDate, String endDate, String frequency, String currency, String batch) throws ApiException {
    return getMarketAggregatesWithHttpInfo(ids, startDate, endDate, frequency, currency, batch).getData();
  }

  /**
   * Get market aggregates for a requested time series.
   * Retrieves FactSet market aggregate data for the funds and date range specified. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)   - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 1500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method.  (required)
   * @param startDate The &#x60;start date&#x60; requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     (optional, default to M)
   * @param currency Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.     (optional, default to N)
   * @return ApiResponse&lt;GetMarketAggregatesResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Market Aggregates response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMarketAggregatesResponseWrapper> getMarketAggregatesWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency, String currency, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getMarketAggregates");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/aggregates/market";

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
        
      
    > apiResponse = apiClient.invokeAPI("MarketAggregatesApi.getMarketAggregates", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMarketAggregatesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetMarketAggregatesResponseWrapper responseWrapper = new GetMarketAggregatesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetMarketAggregatesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Get market aggregates for a requested time series.
   * Retrieves FactSet market aggregate data for the funds and date range specified. 
   * @param marketAggregatesRequest The Market Aggregates request body, allowing the user to specify a list of ids and date range. (required)
   * @return GetMarketAggregatesForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Market Aggregates response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetMarketAggregatesForListResponseWrapper getMarketAggregatesForList(MarketAggregatesRequest marketAggregatesRequest) throws ApiException {
    return getMarketAggregatesForListWithHttpInfo(marketAggregatesRequest).getData();
  }

  /**
   * Get market aggregates for a requested time series.
   * Retrieves FactSet market aggregate data for the funds and date range specified. 
   * @param marketAggregatesRequest The Market Aggregates request body, allowing the user to specify a list of ids and date range. (required)
   * @return ApiResponse&lt;GetMarketAggregatesForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Market Aggregates response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMarketAggregatesForListResponseWrapper> getMarketAggregatesForListWithHttpInfo(MarketAggregatesRequest marketAggregatesRequest) throws ApiException {
    Object localVarPostBody = marketAggregatesRequest;
    
    // verify the required parameter 'marketAggregatesRequest' is set
    if (marketAggregatesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'marketAggregatesRequest' when calling getMarketAggregatesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/aggregates/market";

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
        
      
    > apiResponse = apiClient.invokeAPI("MarketAggregatesApi.getMarketAggregatesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMarketAggregatesForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetMarketAggregatesForListResponseWrapper responseWrapper = new GetMarketAggregatesForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetMarketAggregatesForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
