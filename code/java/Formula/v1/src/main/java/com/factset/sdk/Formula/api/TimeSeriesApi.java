package com.factset.sdk.Formula.api;

import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiResponse;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Formula.models.BatchStatusResponse;
import com.factset.sdk.Formula.models.ErrorDetail;
import com.factset.sdk.Formula.models.TimeSeriesRequest;
import com.factset.sdk.Formula.models.TimeSeriesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TimeSeriesApi {
  private ApiClient apiClient;

  public TimeSeriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TimeSeriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTimeSeriesDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimeSeriesDataResponseTypeMap.put(200, new GenericType<TimeSeriesResponse>(){});
    getTimeSeriesDataResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getTimeSeriesDataResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(413, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(429, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }

  private static final Map<Integer, GenericType> getTimeSeriesDataForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimeSeriesDataForListResponseTypeMap.put(200, new GenericType<TimeSeriesResponse>(){});
    getTimeSeriesDataForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getTimeSeriesDataForListResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(413, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(429, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }

  
 /**
   * Wrapper to support GET /time-series returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code TimeSeriesResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetTimeSeriesDataResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     TimeSeriesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetTimeSeriesDataResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTimeSeriesDataResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public TimeSeriesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (TimeSeriesResponse) this.response;
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
      GetTimeSeriesDataResponseWrapper other = (GetTimeSeriesDataResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTimeSeriesDataResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /time-series returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code TimeSeriesResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetTimeSeriesDataForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     TimeSeriesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetTimeSeriesDataForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTimeSeriesDataForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public TimeSeriesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (TimeSeriesResponse) this.response;
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
      GetTimeSeriesDataForListResponseWrapper other = (GetTimeSeriesDataForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTimeSeriesDataForListResponseWrapper {\n"
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
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param formulas List of FQL formulas (required)
   * @param ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the &#x60;symbolType&#x60; parameter to submit other supported third-party identifier types.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param symbolType Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  (optional, default to DEFAULT)
   * @param universe Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param universeType Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter.  (optional, default to EQUITY)
   * @param calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. (optional)
   * @param fsymId Specify **Y** for the &#x60;fsymId&#x60; parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the &#x60;requestId&#x60;, in addition to the **requestId** field, in each response object. The default value for the &#x60;fsymId&#x60; parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (optional, default to N)
   * @param displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  (optional)
   * @param flatten Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output.  (optional, default to N)
   * @param dates Specify **N** for the &#x60;dates&#x60; parameter to suppress the **dates** of the response. The default value for the &#x60;dates&#x60; parameter is **Y**. Setting the parameter to **Y** will only return dates if the formula has a date value associated with it.  In the non-flattened response model, setting dates to **N** will remove the \&quot;dates\&quot; array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \&quot;dates\&quot; attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment.  (optional, default to Y)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request,  supporting a long-running request up to **30 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  (optional, default to N)
   * @return GetTimeSeriesDataResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetTimeSeriesDataResponseWrapper getTimeSeriesData(java.util.List<String> formulas, java.util.List<String> ids, String symbolType, String universe, String universeType, String calendar, String fsymId, java.util.List<String> displayName, String flatten, String dates, String batch) throws ApiException {
    return getTimeSeriesDataWithHttpInfo(formulas, ids, symbolType, universe, universeType, calendar, fsymId, displayName, flatten, dates, batch).getData();
  }

  /**
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param formulas List of FQL formulas (required)
   * @param ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the &#x60;symbolType&#x60; parameter to submit other supported third-party identifier types.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param symbolType Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  (optional, default to DEFAULT)
   * @param universe Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param universeType Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter.  (optional, default to EQUITY)
   * @param calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. (optional)
   * @param fsymId Specify **Y** for the &#x60;fsymId&#x60; parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the &#x60;requestId&#x60;, in addition to the **requestId** field, in each response object. The default value for the &#x60;fsymId&#x60; parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (optional, default to N)
   * @param displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  (optional)
   * @param flatten Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output.  (optional, default to N)
   * @param dates Specify **N** for the &#x60;dates&#x60; parameter to suppress the **dates** of the response. The default value for the &#x60;dates&#x60; parameter is **Y**. Setting the parameter to **Y** will only return dates if the formula has a date value associated with it.  In the non-flattened response model, setting dates to **N** will remove the \&quot;dates\&quot; array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \&quot;dates\&quot; attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment.  (optional, default to Y)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request,  supporting a long-running request up to **30 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  (optional, default to N)
   * @return ApiResponse&lt;GetTimeSeriesDataResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetTimeSeriesDataResponseWrapper> getTimeSeriesDataWithHttpInfo(java.util.List<String> formulas, java.util.List<String> ids, String symbolType, String universe, String universeType, String calendar, String fsymId, java.util.List<String> displayName, String flatten, String dates, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'formulas' is set
    if (formulas == null) {
      throw new ApiException(400, "Missing the required parameter 'formulas' when calling getTimeSeriesData");
    }
    
    // create path and map variables
    String localVarPath = "/time-series";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbolType", symbolType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universe", universe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeType", universeType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "formulas", formulas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calendar", calendar));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fsymId", fsymId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flatten", flatten));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dates", dates));
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
        
      
    > apiResponse = apiClient.invokeAPI("TimeSeriesApi.getTimeSeriesData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimeSeriesDataResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTimeSeriesDataResponseWrapper responseWrapper = new GetTimeSeriesDataResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTimeSeriesDataResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param timeSeriesRequest  (required)
   * @return GetTimeSeriesDataForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetTimeSeriesDataForListResponseWrapper getTimeSeriesDataForList(TimeSeriesRequest timeSeriesRequest) throws ApiException {
    return getTimeSeriesDataForListWithHttpInfo(timeSeriesRequest).getData();
  }

  /**
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param timeSeriesRequest  (required)
   * @return ApiResponse&lt;GetTimeSeriesDataForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetTimeSeriesDataForListResponseWrapper> getTimeSeriesDataForListWithHttpInfo(TimeSeriesRequest timeSeriesRequest) throws ApiException {
    Object localVarPostBody = timeSeriesRequest;
    
    // verify the required parameter 'timeSeriesRequest' is set
    if (timeSeriesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'timeSeriesRequest' when calling getTimeSeriesDataForList");
    }
    
    // create path and map variables
    String localVarPath = "/time-series";

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
        
      
    > apiResponse = apiClient.invokeAPI("TimeSeriesApi.getTimeSeriesDataForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimeSeriesDataForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTimeSeriesDataForListResponseWrapper responseWrapper = new GetTimeSeriesDataForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTimeSeriesDataForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
