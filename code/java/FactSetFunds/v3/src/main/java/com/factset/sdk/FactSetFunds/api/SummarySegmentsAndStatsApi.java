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

import com.factset.sdk.FactSetFunds.models.AumRequest;
import com.factset.sdk.FactSetFunds.models.AumResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.FlowsRequest;
import com.factset.sdk.FactSetFunds.models.FlowsResponse;
import com.factset.sdk.FactSetFunds.models.Frequency;
import com.factset.sdk.FactSetFunds.models.FrequencyAum;
import com.factset.sdk.FactSetFunds.models.Lang;
import java.time.LocalDate;
import com.factset.sdk.FactSetFunds.models.NavDataType;
import com.factset.sdk.FactSetFunds.models.SegmentsAndStructureRequest;
import com.factset.sdk.FactSetFunds.models.SegmentsAndStructureResponse;
import com.factset.sdk.FactSetFunds.models.StructureType;
import com.factset.sdk.FactSetFunds.models.SummariesRequest;
import com.factset.sdk.FactSetFunds.models.SummariesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SummarySegmentsAndStatsApi {
  private ApiClient apiClient;

  public SummarySegmentsAndStatsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SummarySegmentsAndStatsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFundsAumResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsAumResponseTypeMap.put(200, new GenericType<AumResponse>(){});
    getFundsAumResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsAumResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsAumForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsAumForListResponseTypeMap.put(200, new GenericType<AumResponse>(){});
    getFundsAumForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsAumForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsFlowsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsFlowsResponseTypeMap.put(200, new GenericType<FlowsResponse>(){});
    getFundsFlowsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsFlowsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsFlowsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsFlowsForListResponseTypeMap.put(200, new GenericType<FlowsResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsFlowsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsSummaryResponseTypeMap.put(200, new GenericType<SummariesResponse>(){});
    getFundsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundsSummaryForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsSummaryForListResponseTypeMap.put(200, new GenericType<SummariesResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSegmentsAndStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSegmentsAndStructureResponseTypeMap.put(200, new GenericType<SegmentsAndStructureResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSegmentsAndStructureForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSegmentsAndStructureForListResponseTypeMap.put(200, new GenericType<SegmentsAndStructureResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getSegmentsAndStructureForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get Fund AUM for a requested date range and list of IDs
   * Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly (optional, default to M)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dataType The Data Type of the NAV expressed as Raw or Rolled values. (optional, default to ROLL)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return AumResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The AUM response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AumResponse getFundsAum(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, FrequencyAum frequency, String currency, NavDataType dataType, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsAumWithHttpInfo(ids, startDate, endDate, frequency, currency, dataType, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund AUM for a requested date range and list of IDs
   * Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly (optional, default to M)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param dataType The Data Type of the NAV expressed as Raw or Rolled values. (optional, default to ROLL)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;AumResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The AUM response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AumResponse> getFundsAumWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, FrequencyAum frequency, String currency, NavDataType dataType, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsAum");
    }
    
    // create path and map variables
    String localVarPath = "/aum";

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
        
        AumResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsAum", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsAumResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund AUM for a requested date range and large list of IDs
   * Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;
   * @param aumRequest The AUM request body, allowing the user to specify a list of IDs. (required)
   * @return AumResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The AUM response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AumResponse getFundsAumForList(AumRequest aumRequest) throws ApiException {
    return getFundsAumForListWithHttpInfo(aumRequest).getData();
  }

  /**
   * Get Fund AUM for a requested date range and large list of IDs
   * Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;
   * @param aumRequest The AUM request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;AumResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The AUM response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AumResponse> getFundsAumForListWithHttpInfo(AumRequest aumRequest) throws ApiException {
    Object localVarPostBody = aumRequest;
    
    // verify the required parameter 'aumRequest' is set
    if (aumRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'aumRequest' when calling getFundsAumForList");
    }
    
    // create path and map variables
    String localVarPath = "/aum";

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
        
        AumResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsAumForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsAumForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Flows for a requested date range and list of IDs
   * Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 &#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return FlowsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Flows response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FlowsResponse getFundsFlows(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFundsFlowsWithHttpInfo(ids, startDate, endDate, frequency, currency, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get Fund Flows for a requested date range and list of IDs
   * Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 &#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
   * @param frequency Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  (optional, default to D)
   * @param currency The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional, default to USD)
   * @param paginationLimit The maximum number of records to return. The default is 20. (optional, default to 20)
   * @param paginationOffset The number of records to skip before the first record to return. The default is 0. (optional, default to 0)
   * @return ApiResponse&lt;FlowsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Flows response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FlowsResponse> getFundsFlowsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Frequency frequency, String currency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsFlows");
    }
    
    // create path and map variables
    String localVarPath = "/flows";

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
        
        FlowsResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsFlows", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsFlowsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Flows for a requested date range and large list of IDs
   * Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1&#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 
   * @param flowsRequest The Fund Flows request body, allowing the user to specify a list of IDs. (required)
   * @return FlowsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Flows response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FlowsResponse getFundsFlowsForList(FlowsRequest flowsRequest) throws ApiException {
    return getFundsFlowsForListWithHttpInfo(flowsRequest).getData();
  }

  /**
   * Get Fund Flows for a requested date range and large list of IDs
   * Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1&#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 
   * @param flowsRequest The Fund Flows request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;FlowsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Flows response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FlowsResponse> getFundsFlowsForListWithHttpInfo(FlowsRequest flowsRequest) throws ApiException {
    Object localVarPostBody = flowsRequest;
    
    // verify the required parameter 'flowsRequest' is set
    if (flowsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'flowsRequest' when calling getFundsFlowsForList");
    }
    
    // create path and map variables
    String localVarPath = "/flows";

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
        
        FlowsResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsFlowsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsFlowsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic reference summary data for a Fund.
   * Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param lang Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \&quot;FR\&quot; is passed. (optional, default to EN)
   * @return SummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SummariesResponse getFundsSummary(java.util.List<String> ids, Lang lang) throws ApiException {
    return getFundsSummaryWithHttpInfo(ids, lang).getData();
  }

  /**
   * Get basic reference summary data for a Fund.
   * Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param lang Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \&quot;FR\&quot; is passed. (optional, default to EN)
   * @return ApiResponse&lt;SummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummariesResponse> getFundsSummaryWithHttpInfo(java.util.List<String> ids, Lang lang) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lang", lang));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SummariesResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic reference data for a large list of Fund IDs.
   * Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  
   * @param summariesRequest The Funds Summary request body, allowing the user to specify a list of IDs. (required)
   * @return SummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Summary response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SummariesResponse getFundsSummaryForList(SummariesRequest summariesRequest) throws ApiException {
    return getFundsSummaryForListWithHttpInfo(summariesRequest).getData();
  }

  /**
   * Get basic reference data for a large list of Fund IDs.
   * Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  
   * @param summariesRequest The Funds Summary request body, allowing the user to specify a list of IDs. (required)
   * @return ApiResponse&lt;SummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Summary response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummariesResponse> getFundsSummaryForListWithHttpInfo(SummariesRequest summariesRequest) throws ApiException {
    Object localVarPostBody = summariesRequest;
    
    // verify the required parameter 'summariesRequest' is set
    if (summariesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'summariesRequest' when calling getFundsSummaryForList");
    }
    
    // create path and map variables
    String localVarPath = "/summary";

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
        
        SummariesResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getFundsSummaryForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsSummaryForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Classification, Similar Funds, Segments, and Fund Structure
   * Returns fund structure information (classification, similar funds, segments, or fund structure) based on the &#x60;structureType&#x60; parameter. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param structureType Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund&#39;s Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information  (optional, default to CLASSIFICATION)
   * @return SegmentsAndStructureResponse
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
  public SegmentsAndStructureResponse getSegmentsAndStructure(java.util.List<String> ids, StructureType structureType) throws ApiException {
    return getSegmentsAndStructureWithHttpInfo(ids, structureType).getData();
  }

  /**
   * Get Fund Classification, Similar Funds, Segments, and Fund Structure
   * Returns fund structure information (classification, similar funds, segments, or fund structure) based on the &#x60;structureType&#x60; parameter. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param structureType Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund&#39;s Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information  (optional, default to CLASSIFICATION)
   * @return ApiResponse&lt;SegmentsAndStructureResponse&gt;
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
  public ApiResponse<SegmentsAndStructureResponse> getSegmentsAndStructureWithHttpInfo(java.util.List<String> ids, StructureType structureType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSegmentsAndStructure");
    }
    
    // create path and map variables
    String localVarPath = "/segments-and-structure";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structureType", structureType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SegmentsAndStructureResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getSegmentsAndStructure", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSegmentsAndStructureResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Fund Classification, Similar Funds, Segments, and Fund Structure.
   * Returns fund structure information (classification, similar funds, segments, or fund structure) for a large list of fund IDs based on the &#x60;structureType&#x60; parameter.
   * @param segmentsAndStructureRequest  (required)
   * @return SegmentsAndStructureResponse
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
  public SegmentsAndStructureResponse getSegmentsAndStructureForList(SegmentsAndStructureRequest segmentsAndStructureRequest) throws ApiException {
    return getSegmentsAndStructureForListWithHttpInfo(segmentsAndStructureRequest).getData();
  }

  /**
   * Get Fund Classification, Similar Funds, Segments, and Fund Structure.
   * Returns fund structure information (classification, similar funds, segments, or fund structure) for a large list of fund IDs based on the &#x60;structureType&#x60; parameter.
   * @param segmentsAndStructureRequest  (required)
   * @return ApiResponse&lt;SegmentsAndStructureResponse&gt;
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
  public ApiResponse<SegmentsAndStructureResponse> getSegmentsAndStructureForListWithHttpInfo(SegmentsAndStructureRequest segmentsAndStructureRequest) throws ApiException {
    Object localVarPostBody = segmentsAndStructureRequest;
    
    // verify the required parameter 'segmentsAndStructureRequest' is set
    if (segmentsAndStructureRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'segmentsAndStructureRequest' when calling getSegmentsAndStructureForList");
    }
    
    // create path and map variables
    String localVarPath = "/segments-and-structure";

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
        
        SegmentsAndStructureResponse
      
    > apiResponse = apiClient.invokeAPI("SummarySegmentsAndStatsApi.getSegmentsAndStructureForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSegmentsAndStructureForListResponseTypeMap, false);

    return apiResponse;

  }
}
