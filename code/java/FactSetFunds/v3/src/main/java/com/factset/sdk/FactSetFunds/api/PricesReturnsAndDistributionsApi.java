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

import com.factset.sdk.FactSetFunds.models.DistributionType;
import com.factset.sdk.FactSetFunds.models.DistributionsRequest;
import com.factset.sdk.FactSetFunds.models.DistributionsResponse;
import com.factset.sdk.FactSetFunds.models.DividendAdjust;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.Frequency;
import com.factset.sdk.FactSetFunds.models.FundsPricesRequest;
import com.factset.sdk.FactSetFunds.models.FundsPricesResponse;
import com.factset.sdk.FactSetFunds.models.FundsReturnsRequest;
import com.factset.sdk.FactSetFunds.models.FundsReturnsResponse;
import com.factset.sdk.FactSetFunds.models.FundsReturnsSnapshotRequest;
import com.factset.sdk.FactSetFunds.models.FundsReturnsSnapshotResponse;
import java.time.LocalDate;
import com.factset.sdk.FactSetFunds.models.NavDataType;
import com.factset.sdk.FactSetFunds.models.ReturnsRangeRequest;
import com.factset.sdk.FactSetFunds.models.ReturnsRangeResponse;
import com.factset.sdk.FactSetFunds.models.SplitAdjust;
import com.factset.sdk.FactSetFunds.models.YieldsRequest;
import com.factset.sdk.FactSetFunds.models.YieldsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PricesReturnsAndDistributionsApi {
  private ApiClient apiClient;

  public PricesReturnsAndDistributionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesReturnsAndDistributionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFundsDistributionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsDistributionsResponseTypeMap.put(200, new GenericType<DistributionsResponse>(){});
    getFundsDistributionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsDistributionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsDistributionsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsDistributionsForListResponseTypeMap.put(200, new GenericType<DistributionsResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsDistributionsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsPricesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsPricesResponseTypeMap.put(200, new GenericType<FundsPricesResponse>(){});
    getFundsPricesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsPricesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsPricesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsPricesForListResponseTypeMap.put(200, new GenericType<FundsPricesResponse>(){});
    getFundsPricesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsPricesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsResponseTypeMap.put(200, new GenericType<FundsReturnsResponse>(){});
    getFundsReturnsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsForListResponseTypeMap.put(200, new GenericType<FundsReturnsResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsRangeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsRangeResponseTypeMap.put(200, new GenericType<ReturnsRangeResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsRangeForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsRangeForListResponseTypeMap.put(200, new GenericType<ReturnsRangeResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsRangeForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsSnapshotResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsSnapshotResponseTypeMap.put(200, new GenericType<FundsReturnsSnapshotResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsReturnsSnapshotForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsReturnsSnapshotForListResponseTypeMap.put(200, new GenericType<FundsReturnsSnapshotResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsReturnsSnapshotForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsYieldResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsYieldResponseTypeMap.put(200, new GenericType<YieldsResponse>(){});
    getFundsYieldResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsYieldResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsYieldForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsYieldForListResponseTypeMap.put(200, new GenericType<YieldsResponse>(){});
    getFundsYieldForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsYieldForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get Fund Distributions (Current or Historical)
   * Retrieves either current or historical fund distributions based on the &#x60;distributionType&#x60; parameter.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param distributionType Selects whether to return current or historical distributions. (optional, default to CURRENT)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param splitAdjust Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  (optional, default to SPLIT)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return DistributionsResponse
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
  public DistributionsResponse getFundsDistributions(java.util.List<String> ids, DistributionType distributionType, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, SplitAdjust splitAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsDistributionsWithHttpInfo(ids, distributionType, startDate, endDate, frequency, currency, splitAdjust, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund Distributions (Current or Historical)
   * Retrieves either current or historical fund distributions based on the &#x60;distributionType&#x60; parameter.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param distributionType Selects whether to return current or historical distributions. (optional, default to CURRENT)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param splitAdjust Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  (optional, default to SPLIT)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;DistributionsResponse&gt;
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
  public ApiResponse<DistributionsResponse> getFundsDistributionsWithHttpInfo(java.util.List<String> ids, DistributionType distributionType, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, SplitAdjust splitAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsDistributions");
    }
    
    // create path and map variables
    String localVarPath = "/distributions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "distributionType", distributionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "splitAdjust", splitAdjust));
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
        
        DistributionsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsDistributions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsDistributionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Distributions (Current or Historical) for a list
   * Retrieves either current or historical fund distributions for a list of funds based on the &#x60;distributionType&#x60; parameter.
   * @param distributionsRequest Distributions request body (required)
   * @return DistributionsResponse
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
  public DistributionsResponse getFundsDistributionsForList(DistributionsRequest distributionsRequest) throws ApiException {
    return getFundsDistributionsForListWithHttpInfo(distributionsRequest).getData();
  }

  /**
   * Get Fund Distributions (Current or Historical) for a list
   * Retrieves either current or historical fund distributions for a list of funds based on the &#x60;distributionType&#x60; parameter.
   * @param distributionsRequest Distributions request body (required)
   * @return ApiResponse&lt;DistributionsResponse&gt;
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
  public ApiResponse<DistributionsResponse> getFundsDistributionsForListWithHttpInfo(DistributionsRequest distributionsRequest) throws ApiException {
    Object localVarPostBody = distributionsRequest;
    
    // verify the required parameter 'distributionsRequest' is set
    if (distributionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'distributionsRequest' when calling getFundsDistributionsForList");
    }
    
    // create path and map variables
    String localVarPath = "/distributions";

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
        
        DistributionsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsDistributionsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsDistributionsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Prices (NAV) for a requested time-series
   * Get Fund Prices (NAV) for a requested date range and list of IDs.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dataType The Data Type of the NAV expressed as Raw or Rolled values. (optional, default to ROLL)
   * @param splitAdjust Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  (optional, default to SPLIT)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return FundsPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Prices response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsPricesResponse getFundsPrices(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, NavDataType dataType, SplitAdjust splitAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsPricesWithHttpInfo(ids, startDate, endDate, frequency, currency, dataType, splitAdjust, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund Prices (NAV) for a requested time-series
   * Get Fund Prices (NAV) for a requested date range and list of IDs.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dataType The Data Type of the NAV expressed as Raw or Rolled values. (optional, default to ROLL)
   * @param splitAdjust Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  (optional, default to SPLIT)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;FundsPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Prices response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsPricesResponse> getFundsPricesWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, NavDataType dataType, SplitAdjust splitAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsPrices");
    }
    
    // create path and map variables
    String localVarPath = "/prices";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataType", dataType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "splitAdjust", splitAdjust));
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
        
        FundsPricesResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsPrices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsPricesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Prices (NAV) for a requested date range and large list of IDs.
   * Fetch fund prices (NAV) as of a requested date range and a large list of IDs.  
   * @param fundsPricesRequest The Prices request body, allowing the user to specify a list of IDs and date ranges. (required)
   * @return FundsPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Prices response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsPricesResponse getFundsPricesForList(FundsPricesRequest fundsPricesRequest) throws ApiException {
    return getFundsPricesForListWithHttpInfo(fundsPricesRequest).getData();
  }

  /**
   * Get Fund Prices (NAV) for a requested date range and large list of IDs.
   * Fetch fund prices (NAV) as of a requested date range and a large list of IDs.  
   * @param fundsPricesRequest The Prices request body, allowing the user to specify a list of IDs and date ranges. (required)
   * @return ApiResponse&lt;FundsPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Prices response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsPricesResponse> getFundsPricesForListWithHttpInfo(FundsPricesRequest fundsPricesRequest) throws ApiException {
    Object localVarPostBody = fundsPricesRequest;
    
    // verify the required parameter 'fundsPricesRequest' is set
    if (fundsPricesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundsPricesRequest' when calling getFundsPricesForList");
    }
    
    // create path and map variables
    String localVarPath = "/prices";

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
        
        FundsPricesResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsPricesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsPricesForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns for a requested time-series
   * Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the &#x60;dividendAdjust&#x60; parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFirstDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt;
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return FundsReturnsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsReturnsResponse getFundsReturns(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, DividendAdjust dividendAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsReturnsWithHttpInfo(ids, startDate, endDate, frequency, currency, dividendAdjust, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund Returns for a requested time-series
   * Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the &#x60;dividendAdjust&#x60; parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFirstDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt;
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;FundsReturnsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsReturnsResponse> getFundsReturnsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, DividendAdjust dividendAdjust, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsReturns");
    }
    
    // create path and map variables
    String localVarPath = "/returns";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dividendAdjust", dividendAdjust));
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
        
        FundsReturnsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns for a requested time-series and large list of IDs.
   * Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the &#x60;dividendAdjust&#x60; parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFirstDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt;
   * @param fundsReturnsRequest The Returns request body, allowing the user to specify a list of IDs. (required)
   * @return FundsReturnsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsReturnsResponse getFundsReturnsForList(FundsReturnsRequest fundsReturnsRequest) throws ApiException {
    return getFundsReturnsForListWithHttpInfo(fundsReturnsRequest).getData();
  }

  /**
   * Get Fund Returns for a requested time-series and large list of IDs.
   * Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the &#x60;dividendAdjust&#x60; parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFirstDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt;
   * @param fundsReturnsRequest The Returns request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;FundsReturnsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsReturnsResponse> getFundsReturnsForListWithHttpInfo(FundsReturnsRequest fundsReturnsRequest) throws ApiException {
    Object localVarPostBody = fundsReturnsRequest;
    
    // verify the required parameter 'fundsReturnsRequest' is set
    if (fundsReturnsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundsReturnsRequest' when calling getFundsReturnsForList");
    }
    
    // create path and map variables
    String localVarPath = "/returns";

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
        
        FundsReturnsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturnsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns for a user-defined date range
   * Get Fund Returns between a specified &#x60;startDate&#x60; and &#x60;endDate&#x60;. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the &#x60;dividendAdjust&#x60; parameter.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @return ReturnsRangeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Range response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ReturnsRangeResponse getFundsReturnsRange(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, DividendAdjust dividendAdjust) throws ApiException {
    return getFundsReturnsRangeWithHttpInfo(ids, startDate, endDate, dividendAdjust).getData();
  }

  /**
   * Get Fund Returns for a user-defined date range
   * Get Fund Returns between a specified &#x60;startDate&#x60; and &#x60;endDate&#x60;. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the &#x60;dividendAdjust&#x60; parameter.
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @return ApiResponse&lt;ReturnsRangeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Range response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReturnsRangeResponse> getFundsReturnsRangeWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, DividendAdjust dividendAdjust) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsReturnsRange");
    }
    
    // create path and map variables
    String localVarPath = "/returns/range";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dividendAdjust", dividendAdjust));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ReturnsRangeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturnsRange", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsRangeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date for large list of IDs.
   * Get Fund Returns between a specified &#x60;startDate&#x60; and &#x60;endDate&#x60;. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the &#x60;dividendAdjust&#x60; parameter.
   * @param returnsRangeRequest The Returns Range request body, allowing the user to specify a list of IDs. (required)
   * @return ReturnsRangeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Range response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ReturnsRangeResponse getFundsReturnsRangeForList(ReturnsRangeRequest returnsRangeRequest) throws ApiException {
    return getFundsReturnsRangeForListWithHttpInfo(returnsRangeRequest).getData();
  }

  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date for large list of IDs.
   * Get Fund Returns between a specified &#x60;startDate&#x60; and &#x60;endDate&#x60;. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the &#x60;dividendAdjust&#x60; parameter.
   * @param returnsRangeRequest The Returns Range request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;ReturnsRangeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Range response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReturnsRangeResponse> getFundsReturnsRangeForListWithHttpInfo(ReturnsRangeRequest returnsRangeRequest) throws ApiException {
    Object localVarPostBody = returnsRangeRequest;
    
    // verify the required parameter 'returnsRangeRequest' is set
    if (returnsRangeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'returnsRangeRequest' when calling getFundsReturnsRangeForList");
    }
    
    // create path and map variables
    String localVarPath = "/returns/range";

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
        
        ReturnsRangeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturnsRangeForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsRangeForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date.
   * Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the &#x60;dividendAdjust&#x60; parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized * tenYear * tenYearAnnualized 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param date The date for snapshot data in YYYY-MM-DD format. (optional)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @return FundsReturnsSnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Snapshot response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsReturnsSnapshotResponse getFundsReturnsSnapshot(java.util.List<String> ids, LocalDate date, DividendAdjust dividendAdjust) throws ApiException {
    return getFundsReturnsSnapshotWithHttpInfo(ids, date, dividendAdjust).getData();
  }

  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date.
   * Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the &#x60;dividendAdjust&#x60; parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized * tenYear * tenYearAnnualized 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param date The date for snapshot data in YYYY-MM-DD format. (optional)
   * @param dividendAdjust Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  (optional, default to DIV)
   * @return ApiResponse&lt;FundsReturnsSnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Snapshot response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsReturnsSnapshotResponse> getFundsReturnsSnapshotWithHttpInfo(java.util.List<String> ids, LocalDate date, DividendAdjust dividendAdjust) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsReturnsSnapshot");
    }
    
    // create path and map variables
    String localVarPath = "/returns/snapshot";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dividendAdjust", dividendAdjust));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FundsReturnsSnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturnsSnapshot", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsSnapshotResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date.
   * Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the &#x60;dividendAdjust&#x60; parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized  * tenYear * tenYearAnnualized 
   * @param fundsReturnsSnapshotRequest The Returns Snapshot request body, allowing the user to specify a list of IDs. (required)
   * @return FundsReturnsSnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Snapshot response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundsReturnsSnapshotResponse getFundsReturnsSnapshotForList(FundsReturnsSnapshotRequest fundsReturnsSnapshotRequest) throws ApiException {
    return getFundsReturnsSnapshotForListWithHttpInfo(fundsReturnsSnapshotRequest).getData();
  }

  /**
   * Get Fund Returns over pre-defined time horizons as of a specific date.
   * Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the &#x60;dividendAdjust&#x60; parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized  * tenYear * tenYearAnnualized 
   * @param fundsReturnsSnapshotRequest The Returns Snapshot request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;FundsReturnsSnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Returns Snapshot response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundsReturnsSnapshotResponse> getFundsReturnsSnapshotForListWithHttpInfo(FundsReturnsSnapshotRequest fundsReturnsSnapshotRequest) throws ApiException {
    Object localVarPostBody = fundsReturnsSnapshotRequest;
    
    // verify the required parameter 'fundsReturnsSnapshotRequest' is set
    if (fundsReturnsSnapshotRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundsReturnsSnapshotRequest' when calling getFundsReturnsSnapshotForList");
    }
    
    // create path and map variables
    String localVarPath = "/returns/snapshot";

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
        
        FundsReturnsSnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsReturnsSnapshotForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsReturnsSnapshotForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Yield for a user-defined date range for large list of IDs.
   * Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return YieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Yields response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public YieldsResponse getFundsYield(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsYieldWithHttpInfo(ids, startDate, endDate, frequency, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund Yield for a user-defined date range for large list of IDs.
   * Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;YieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Yields response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<YieldsResponse> getFundsYieldWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsYield");
    }
    
    // create path and map variables
    String localVarPath = "/yields";

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
        
        YieldsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsYield", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsYieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Yield for a user-defined date range for large list of IDs.
   * Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 
   * @param yieldsRequest The Yields request body, allowing the user to specify a list of IDs and date. (required)
   * @return YieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Yields response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public YieldsResponse getFundsYieldForList(YieldsRequest yieldsRequest) throws ApiException {
    return getFundsYieldForListWithHttpInfo(yieldsRequest).getData();
  }

  /**
   * Get Fund Yield for a user-defined date range for large list of IDs.
   * Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 
   * @param yieldsRequest The Yields request body, allowing the user to specify a list of IDs and date. (required)
   * @return ApiResponse&lt;YieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Yields response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<YieldsResponse> getFundsYieldForListWithHttpInfo(YieldsRequest yieldsRequest) throws ApiException {
    Object localVarPostBody = yieldsRequest;
    
    // verify the required parameter 'yieldsRequest' is set
    if (yieldsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'yieldsRequest' when calling getFundsYieldForList");
    }
    
    // create path and map variables
    String localVarPath = "/yields";

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
        
        YieldsResponse
      
    > apiResponse = apiClient.invokeAPI("PricesReturnsAndDistributionsApi.getFundsYieldForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsYieldForListResponseTypeMap, false);

    return apiResponse;

  }
}
