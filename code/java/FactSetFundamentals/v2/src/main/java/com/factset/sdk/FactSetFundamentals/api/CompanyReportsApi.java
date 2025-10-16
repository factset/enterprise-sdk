package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.CompanyFundamentalsResponse;
import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;
import com.factset.sdk.FactSetFundamentals.models.FinancialResponse;
import com.factset.sdk.FactSetFundamentals.models.ProfileResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyReportsApi {
  private ApiClient apiClient;

  public CompanyReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFdsProfilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsProfilesResponseTypeMap.put(200, new GenericType<ProfileResponse>(){});
    getFdsProfilesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsProfilesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsProfilesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsProfilesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFinancialsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialsResponseTypeMap.put(200, new GenericType<FinancialResponse>(){});
    getFinancialsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFundamentalsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundamentalsResponseTypeMap.put(200, new GenericType<CompanyFundamentalsResponse>(){});
    getFundamentalsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundamentalsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundamentalsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundamentalsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns company profile information for a specified list of identifiers.
   * Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Profile data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ProfileResponse getFdsProfiles(java.util.List<String> ids) throws ApiException {
    return getFdsProfilesWithHttpInfo(ids).getData();
  }

  /**
   * Returns company profile information for a specified list of identifiers.
   * Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; (required)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Profile data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> getFdsProfilesWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFdsProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/profile";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProfileResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getFdsProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsProfilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns company financial data.
   * Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.&lt;br&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
   * @param statementType The type of financial statement being requested. (required)
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  &#x3D; Last Twelve Months,   * **YTD** &#x3D; Year-to-date.   &lt;br&gt;  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.&lt;br&gt;  (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param updateType Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data (optional, default to RP)
   * @param limit The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. (optional, default to 4)
   * @return FinancialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Financial data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialResponse getFinancials(String statementType, String id, String periodicity, String currency, String updateType, Integer limit) throws ApiException {
    return getFinancialsWithHttpInfo(statementType, id, periodicity, currency, updateType, limit).getData();
  }

  /**
   * Returns company financial data.
   * Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.&lt;br&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
   * @param statementType The type of financial statement being requested. (required)
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  &#x3D; Last Twelve Months,   * **YTD** &#x3D; Year-to-date.   &lt;br&gt;  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.&lt;br&gt;  (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param updateType Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data (optional, default to RP)
   * @param limit The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. (optional, default to 4)
   * @return ApiResponse&lt;FinancialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Financial data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialResponse> getFinancialsWithHttpInfo(String statementType, String id, String periodicity, String currency, String updateType, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'statementType' is set
    if (statementType == null) {
      throw new ApiException(400, "Missing the required parameter 'statementType' when calling getFinancials");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFinancials");
    }
    
    // verify the required parameter 'periodicity' is set
    if (periodicity == null) {
      throw new ApiException(400, "Missing the required parameter 'periodicity' when calling getFinancials");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/financial-statement";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statementType", statementType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateType", updateType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FinancialResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getFinancials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns company fundamentals for a given list of identifiers.
   * Returns detailed insights on specified publicly traded company&#39;s various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.&lt;br&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param periodicity Periodicity or frequency of the fiscal periods. If omitted, will return the latest available data irrespective of the periodicity.   * **ANN**  &#x3D; Annual - Original,   * **QTR**  &#x3D; Quarterly - Original   * **SEMI** &#x3D; Semi-Annual  (optional)
   * @return CompanyFundamentalsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamentals data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyFundamentalsResponse getFundamentals(java.util.List<String> ids, String currency, String periodicity) throws ApiException {
    return getFundamentalsWithHttpInfo(ids, currency, periodicity).getData();
  }

  /**
   * Returns company fundamentals for a given list of identifiers.
   * Returns detailed insights on specified publicly traded company&#39;s various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.&lt;br&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param periodicity Periodicity or frequency of the fiscal periods. If omitted, will return the latest available data irrespective of the periodicity.   * **ANN**  &#x3D; Annual - Original,   * **QTR**  &#x3D; Quarterly - Original   * **SEMI** &#x3D; Semi-Annual  (optional)
   * @return ApiResponse&lt;CompanyFundamentalsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamentals data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyFundamentalsResponse> getFundamentalsWithHttpInfo(java.util.List<String> ids, String currency, String periodicity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundamentals");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/fundamentals";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CompanyFundamentalsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getFundamentals", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundamentalsResponseTypeMap, false);

    return apiResponse;

  }
}
