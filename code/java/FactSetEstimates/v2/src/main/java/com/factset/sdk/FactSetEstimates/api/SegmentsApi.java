package com.factset.sdk.FactSetEstimates.api;

import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiResponse;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEstimates.models.ErrorResponse;
import com.factset.sdk.FactSetEstimates.models.SegmentsRequest;
import com.factset.sdk.FactSetEstimates.models.SegmentsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentsApi {
  private ApiClient apiClient;

  public SegmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SegmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSegmentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSegmentsResponseTypeMap.put(200, new GenericType<SegmentsResponse>(){});
    getSegmentsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSegmentsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSegmentsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSegmentsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSegmentsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSegmentsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSegmentsForListResponseTypeMap.put(200, new GenericType<SegmentsResponse>(){});
    getSegmentsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSegmentsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSegmentsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSegmentsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSegmentsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieves product &amp; geographic segment estimates for a requested list of ids and fiscal periods
   * Returns FactSet Estimates Consensus Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  (required)
   * @param segmentType Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  (required)
   * @param metrics Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param relativeFiscalStart Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). (optional)
   * @param relativeFiscalEnd Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). (optional)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     (optional, default to ANN)
   * @param frequency Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   (optional, default to D)
   * @param currency Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return SegmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segment Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SegmentsResponse getSegments(java.util.List<String> ids, String segmentType, java.util.List<String> metrics, String startDate, String endDate, Integer relativeFiscalStart, Integer relativeFiscalEnd, String periodicity, String frequency, String currency) throws ApiException {
    return getSegmentsWithHttpInfo(ids, segmentType, metrics, startDate, endDate, relativeFiscalStart, relativeFiscalEnd, periodicity, frequency, currency).getData();
  }

  /**
   * Retrieves product &amp; geographic segment estimates for a requested list of ids and fiscal periods
   * Returns FactSet Estimates Consensus Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  (required)
   * @param segmentType Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  (required)
   * @param metrics Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param relativeFiscalStart Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). (optional)
   * @param relativeFiscalEnd Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). (optional)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     (optional, default to ANN)
   * @param frequency Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   (optional, default to D)
   * @param currency Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return ApiResponse&lt;SegmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segment Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SegmentsResponse> getSegmentsWithHttpInfo(java.util.List<String> ids, String segmentType, java.util.List<String> metrics, String startDate, String endDate, Integer relativeFiscalStart, Integer relativeFiscalEnd, String periodicity, String frequency, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSegments");
    }
    
    // verify the required parameter 'segmentType' is set
    if (segmentType == null) {
      throw new ApiException(400, "Missing the required parameter 'segmentType' when calling getSegments");
    }
    
    // verify the required parameter 'metrics' is set
    if (metrics == null) {
      throw new ApiException(400, "Missing the required parameter 'metrics' when calling getSegments");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/segments";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "segmentType", segmentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativeFiscalStart", relativeFiscalStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativeFiscalEnd", relativeFiscalEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SegmentsResponse
      
    > apiResponse = apiClient.invokeAPI("SegmentsApi.getSegments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSegmentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves product segment estimates for a requested list of ids and fiscal periods
   * Returns FactSet Estimates Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  
   * @param segmentsRequest Request object for Product Segments estimates. (required)
   * @return SegmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segments Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SegmentsResponse getSegmentsForList(SegmentsRequest segmentsRequest) throws ApiException {
    return getSegmentsForListWithHttpInfo(segmentsRequest).getData();
  }

  /**
   * Retrieves product segment estimates for a requested list of ids and fiscal periods
   * Returns FactSet Estimates Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  
   * @param segmentsRequest Request object for Product Segments estimates. (required)
   * @return ApiResponse&lt;SegmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segments Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SegmentsResponse> getSegmentsForListWithHttpInfo(SegmentsRequest segmentsRequest) throws ApiException {
    Object localVarPostBody = segmentsRequest;
    
    // verify the required parameter 'segmentsRequest' is set
    if (segmentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'segmentsRequest' when calling getSegmentsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/segments";

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
        
        SegmentsResponse
      
    > apiResponse = apiClient.invokeAPI("SegmentsApi.getSegmentsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSegmentsForListResponseTypeMap, false);

    return apiResponse;

  }
}
