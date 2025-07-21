package com.factset.sdk.FactSetPrivateCompany.api;

import com.factset.sdk.FactSetPrivateCompany.ApiException;
import com.factset.sdk.FactSetPrivateCompany.ApiClient;
import com.factset.sdk.FactSetPrivateCompany.ApiResponse;
import com.factset.sdk.FactSetPrivateCompany.Configuration;
import com.factset.sdk.FactSetPrivateCompany.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrivateCompany.models.ErrorResponse;
import com.factset.sdk.FactSetPrivateCompany.models.FinancialStatementsResponse;
import com.factset.sdk.FactSetPrivateCompany.models.ProfileResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyReportsApi {
  private ApiClient apiClient;

  public CompanyReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFinancialsReportResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialsReportResponseTypeMap.put(200, new GenericType<FinancialStatementsResponse>(){});
    getFinancialsReportResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialsReportResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialsReportResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialsReportResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getProfileReportResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProfileReportResponseTypeMap.put(200, new GenericType<ProfileResponse>(){});
    getProfileReportResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getProfileReportResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getProfileReportResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getProfileReportResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Private Company Financial Data
   * Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt;&lt;br/&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation. 
   * @param ids The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  (required)
   * @param statementType The type of financial statement being requested (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param numberAnnualPeriods The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       (optional, default to 4)
   * @return FinancialStatementsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Financial data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialStatementsResponse getFinancialsReport(java.util.List<String> ids, String statementType, String currency, Integer numberAnnualPeriods) throws ApiException {
    return getFinancialsReportWithHttpInfo(ids, statementType, currency, numberAnnualPeriods).getData();
  }

  /**
   * Returns Private Company Financial Data
   * Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt;&lt;br/&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation. 
   * @param ids The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  (required)
   * @param statementType The type of financial statement being requested (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  (optional, default to LOCAL)
   * @param numberAnnualPeriods The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       (optional, default to 4)
   * @return ApiResponse&lt;FinancialStatementsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Financial data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialStatementsResponse> getFinancialsReportWithHttpInfo(java.util.List<String> ids, String statementType, String currency, Integer numberAnnualPeriods) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFinancialsReport");
    }
    
    // verify the required parameter 'statementType' is set
    if (statementType == null) {
      throw new ApiException(400, "Missing the required parameter 'statementType' when calling getFinancialsReport");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/financial-statement";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statementType", statementType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numberAnnualPeriods", numberAnnualPeriods));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FinancialStatementsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getFinancialsReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialsReportResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns Private Company Non-Periodic Data
   * Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt; 
   * @param ids The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Non-periodic data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ProfileResponse getProfileReport(java.util.List<String> ids) throws ApiException {
    return getProfileReportWithHttpInfo(ids).getData();
  }

  /**
   * Returns Private Company Non-Periodic Data
   * Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt; 
   * @param ids The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  (required)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Non-periodic data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> getProfileReportWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getProfileReport");
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
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getProfileReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProfileReportResponseTypeMap, false);

    return apiResponse;

  }
}
