package com.factset.sdk.Formula.api;

import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiResponse;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Formula.models.BatchStatusResponse;
import com.factset.sdk.Formula.models.CrossSectionalRequest;
import com.factset.sdk.Formula.models.CrossSectionalResponse;
import com.factset.sdk.Formula.models.ErrorDetail;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrossSectionalApi {
  private ApiClient apiClient;

  public CrossSectionalApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CrossSectionalApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getCrossSectionalDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCrossSectionalDataResponseTypeMap.put(200, new GenericType<CrossSectionalResponse>(){});
    getCrossSectionalDataResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getCrossSectionalDataResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(429, new GenericType<Object>(){});
    getCrossSectionalDataResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }
  private static final Map<Integer, GenericType> getCrossSectionalDataForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCrossSectionalDataForListResponseTypeMap.put(200, new GenericType<CrossSectionalResponse>(){});
    getCrossSectionalDataForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getCrossSectionalDataForListResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(429, new GenericType<Object>(){});
    getCrossSectionalDataForListResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }

   
 /**
   * Wrapper to support GET /v1/cross-sectional returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code CrossSectionalResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetCrossSectionalDataResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     CrossSectionalResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetCrossSectionalDataResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetCrossSectionalDataResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public CrossSectionalResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (CrossSectionalResponse) this.response;
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
      GetCrossSectionalDataResponseWrapper other = (GetCrossSectionalDataResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetCrossSectionalDataResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /v1/cross-sectional returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code CrossSectionalResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetCrossSectionalDataForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     CrossSectionalResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetCrossSectionalDataForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetCrossSectionalDataForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public CrossSectionalResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (CrossSectionalResponse) this.response;
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
      GetCrossSectionalDataForListResponseWrapper other = (GetCrossSectionalDataForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetCrossSectionalDataForListResponseWrapper {\n"
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
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param formulas List of Screening formulas (required)
   * @param ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the &#x60;symbolType&#x60; parameter to submit other supported third-party identifier types.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param symbolType Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  (optional, default to DEFAULT)
   * @param universe Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param universeType Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  (optional, default to EQUITY)
   * @param backTestDate Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  (optional)
   * @param calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. (optional)
   * @param fsymId Specify **Y** for &#x60;fsymId&#x60; to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for &#x60;fsymId&#x60; is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (optional, default to N)
   * @param displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  (optional)
   * @param flatten Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  (optional, default to N)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request,  supporting a long-running request up to **20 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  Individual users are limited to running 5 Batch Requests in a 5 minute period and are allowed 5 concurrent Batch Requests. Production users are limited to running 10 Batch Requests in a 5 minute period and are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  (optional, default to N)
   * @return GetCrossSectionalDataResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 20 minutes to process for the time-series endpoint and 10 minutes to process for the cross-sectional endpoint. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetCrossSectionalDataResponseWrapper getCrossSectionalData(java.util.List<String> formulas, java.util.List<String> ids, String symbolType, String universe, String universeType, String backTestDate, String calendar, String fsymId, java.util.List<String> displayName, String flatten, String batch) throws ApiException {
    return getCrossSectionalDataWithHttpInfo(formulas, ids, symbolType, universe, universeType, backTestDate, calendar, fsymId, displayName, flatten, batch).getData();
  }

  /**
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param formulas List of Screening formulas (required)
   * @param ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the &#x60;symbolType&#x60; parameter to submit other supported third-party identifier types.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param symbolType Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  (optional, default to DEFAULT)
   * @param universe Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  (optional)
   * @param universeType Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  (optional, default to EQUITY)
   * @param backTestDate Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  (optional)
   * @param calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. (optional)
   * @param fsymId Specify **Y** for &#x60;fsymId&#x60; to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for &#x60;fsymId&#x60; is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (optional, default to N)
   * @param displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  (optional)
   * @param flatten Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  (optional, default to N)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request,  supporting a long-running request up to **20 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  Individual users are limited to running 5 Batch Requests in a 5 minute period and are allowed 5 concurrent Batch Requests. Production users are limited to running 10 Batch Requests in a 5 minute period and are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  (optional, default to N)
   * @return ApiResponse&lt;GetCrossSectionalDataResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 20 minutes to process for the time-series endpoint and 10 minutes to process for the cross-sectional endpoint. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetCrossSectionalDataResponseWrapper> getCrossSectionalDataWithHttpInfo(java.util.List<String> formulas, java.util.List<String> ids, String symbolType, String universe, String universeType, String backTestDate, String calendar, String fsymId, java.util.List<String> displayName, String flatten, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'formulas' is set
    if (formulas == null) {
      throw new ApiException(400, "Missing the required parameter 'formulas' when calling getCrossSectionalData");
    }
    
    // create path and map variables
    String localVarPath = "/v1/cross-sectional";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "backTestDate", backTestDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calendar", calendar));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fsymId", fsymId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flatten", flatten));
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
        
      
    > apiResponse = apiClient.invokeAPI("CrossSectionalApi.getCrossSectionalData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCrossSectionalDataResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetCrossSectionalDataResponseWrapper responseWrapper = new GetCrossSectionalDataResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetCrossSectionalDataResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param crossSectionalRequest  (required)
   * @return GetCrossSectionalDataForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 20 minutes to process for the time-series endpoint and 10 minutes to process for the cross-sectional endpoint. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetCrossSectionalDataForListResponseWrapper getCrossSectionalDataForList(CrossSectionalRequest crossSectionalRequest) throws ApiException {
    return getCrossSectionalDataForListWithHttpInfo(crossSectionalRequest).getData();
  }

  /**
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param crossSectionalRequest  (required)
   * @return ApiResponse&lt;GetCrossSectionalDataForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 20 minutes to process for the time-series endpoint and 10 minutes to process for the cross-sectional endpoint. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetCrossSectionalDataForListResponseWrapper> getCrossSectionalDataForListWithHttpInfo(CrossSectionalRequest crossSectionalRequest) throws ApiException {
    Object localVarPostBody = crossSectionalRequest;
    
    // verify the required parameter 'crossSectionalRequest' is set
    if (crossSectionalRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'crossSectionalRequest' when calling getCrossSectionalDataForList");
    }
    
    // create path and map variables
    String localVarPath = "/v1/cross-sectional";

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
        
      
    > apiResponse = apiClient.invokeAPI("CrossSectionalApi.getCrossSectionalDataForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCrossSectionalDataForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetCrossSectionalDataForListResponseWrapper responseWrapper = new GetCrossSectionalDataForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetCrossSectionalDataForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
