package com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.api;

import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiException;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiClient;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiResponse;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.Configuration;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.models.DFSnapshotResponse;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SnapshotApi {
  private ApiClient apiClient;

  public SnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDFSnapshotResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDFSnapshotResponseTypeMap.put(200, new GenericType<DFSnapshotResponse>(){});
    getDFSnapshotResponseTypeMap.put(402, new GenericType<ErrorResponse>(){});
    getDFSnapshotResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postDFSnapshotResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postDFSnapshotResponseTypeMap.put(200, new GenericType<DFSnapshotResponse>(){});
    postDFSnapshotResponseTypeMap.put(402, new GenericType<ErrorResponse>(){});
    postDFSnapshotResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
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
   * Request a snapshot of exchange data for a list of symbols.
   *  &#x60;ids&#x60; and &#x60;oc&#x60; are required parameters, but only one can be used based on request. Use &#x60;ids&#x60; for regular snapshot requests, and &#x60;oc&#x60; for requesting an option chain.   **Try it Out** feature is available using a pre-recorded sandbox environment. Follow Try it Out inscrutions on each parameter to develop a request and view a sample server response.  &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 
   * @param ids Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; (optional)
   * @param oc Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; (optional)
   * @param fields All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
   * @param sf Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to XML)
   * @param serv The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; (optional)
   * @return DFSnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public DFSnapshotResponse getDFSnapshot(String ids, String oc, String fields, String sf, String format, String serv, String reqId) throws ApiException {
    return getDFSnapshotWithHttpInfo(ids, oc, fields, sf, format, serv, reqId).getData();
  }

  /**
   * Request a snapshot of exchange data for a list of symbols.
   *  &#x60;ids&#x60; and &#x60;oc&#x60; are required parameters, but only one can be used based on request. Use &#x60;ids&#x60; for regular snapshot requests, and &#x60;oc&#x60; for requesting an option chain.   **Try it Out** feature is available using a pre-recorded sandbox environment. Follow Try it Out inscrutions on each parameter to develop a request and view a sample server response.  &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 
   * @param ids Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; (optional)
   * @param oc Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; (optional)
   * @param fields All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
   * @param sf Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to XML)
   * @param serv The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; (optional)
   * @return ApiResponse&lt;DFSnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DFSnapshotResponse> getDFSnapshotWithHttpInfo(String ids, String oc, String fields, String sf, String format, String serv, String reqId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/DFSnapshot";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oc", oc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sf", sf));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "serv", serv));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "req_id", reqId));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DFSnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("SnapshotApi.getDFSnapshot", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDFSnapshotResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Snap exchange data. Use if URL lengh of 2,048 is exceeded.
   * Request Snapshot exchange data. Use POST when your URL length exceeds 2,048 characters.
   * @param ids Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; (optional)
   * @param oc Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; (optional)
   * @param fields All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
   * @param sf Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to XML)
   * @param serv The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; (optional)
   * @return DFSnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public DFSnapshotResponse postDFSnapshot(String ids, String oc, String fields, String sf, String format, String serv, String reqId) throws ApiException {
    return postDFSnapshotWithHttpInfo(ids, oc, fields, sf, format, serv, reqId).getData();
  }

  /**
   * Snap exchange data. Use if URL lengh of 2,048 is exceeded.
   * Request Snapshot exchange data. Use POST when your URL length exceeds 2,048 characters.
   * @param ids Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; (optional)
   * @param oc Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; (optional)
   * @param fields All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
   * @param sf Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to XML)
   * @param serv The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; (optional)
   * @return ApiResponse&lt;DFSnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DFSnapshotResponse> postDFSnapshotWithHttpInfo(String ids, String oc, String fields, String sf, String format, String serv, String reqId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/DFSnapshot";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oc", oc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sf", sf));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "serv", serv));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "req_id", reqId));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DFSnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("SnapshotApi.postDFSnapshot", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postDFSnapshotResponseTypeMap, false);

    return apiResponse;

  }
}
