package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;
import com.factset.sdk.FactSetFundamentals.models.FundamentalsRequest;
import com.factset.sdk.FactSetFundamentals.models.FundamentalsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactSetFundamentalsApi {
  private ApiClient apiClient;

  public FactSetFundamentalsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetFundamentalsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getFdsFundamentalsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsFundamentalsResponseTypeMap.put(200, new GenericType<FundamentalsResponse>(){});
    getFdsFundamentalsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFdsFundamentalsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsFundamentalsForListResponseTypeMap.put(200, new GenericType<FundamentalsResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param metrics Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. &lt;p&gt;*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*&lt;/p&gt; &lt;p&gt;***metrics limit** &#x3D;  1600 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM**  &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** &#x3D; Year-to-date.  (optional, default to QTR)
   * @param fiscalPeriodStart Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
   * @param fiscalPeriodEnd Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param restated Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data  (optional, default to RP)
   * @return FundamentalsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundamentalsResponse getFdsFundamentals(java.util.List<String> ids, java.util.List<String> metrics, String periodicity, String fiscalPeriodStart, String fiscalPeriodEnd, String currency, String restated) throws ApiException {
    return getFdsFundamentalsWithHttpInfo(ids, metrics, periodicity, fiscalPeriodStart, fiscalPeriodEnd, currency, restated).getData();
  }

  /**
   * Returns the Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param metrics Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. &lt;p&gt;*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*&lt;/p&gt; &lt;p&gt;***metrics limit** &#x3D;  1600 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM**  &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** &#x3D; Year-to-date.  (optional, default to QTR)
   * @param fiscalPeriodStart Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
   * @param fiscalPeriodEnd Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param restated Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data  (optional, default to RP)
   * @return ApiResponse&lt;FundamentalsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundamentalsResponse> getFdsFundamentalsWithHttpInfo(java.util.List<String> ids, java.util.List<String> metrics, String periodicity, String fiscalPeriodStart, String fiscalPeriodEnd, String currency, String restated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFdsFundamentals");
    }
    
    // verify the required parameter 'metrics' is set
    if (metrics == null) {
      throw new ApiException(400, "Missing the required parameter 'metrics' when calling getFdsFundamentals");
    }
    
    // create path and map variables
    String localVarPath = "/factset-fundamentals/v1/fundamentals";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fiscalPeriodStart", fiscalPeriodStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fiscalPeriodEnd", fiscalPeriodEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "restated", restated));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FundamentalsResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetFundamentalsApi.getFdsFundamentals", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsFundamentalsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items.   
   * @param fundamentalsRequest Request object for requesting fundamentals data (required)
   * @return FundamentalsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundamentalsResponse getFdsFundamentalsForList(FundamentalsRequest fundamentalsRequest) throws ApiException {
    return getFdsFundamentalsForListWithHttpInfo(fundamentalsRequest).getData();
  }

  /**
   * Returns the Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items.   
   * @param fundamentalsRequest Request object for requesting fundamentals data (required)
   * @return ApiResponse&lt;FundamentalsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundamentalsResponse> getFdsFundamentalsForListWithHttpInfo(FundamentalsRequest fundamentalsRequest) throws ApiException {
    Object localVarPostBody = fundamentalsRequest;
    
    // verify the required parameter 'fundamentalsRequest' is set
    if (fundamentalsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundamentalsRequest' when calling getFdsFundamentalsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-fundamentals/v1/fundamentals";

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
        
        FundamentalsResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetFundamentalsApi.getFdsFundamentalsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsFundamentalsForListResponseTypeMap, false);

    return apiResponse;

  }
}
