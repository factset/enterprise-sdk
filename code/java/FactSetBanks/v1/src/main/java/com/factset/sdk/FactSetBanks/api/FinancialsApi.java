package com.factset.sdk.FactSetBanks.api;

import com.factset.sdk.FactSetBanks.ApiException;
import com.factset.sdk.FactSetBanks.ApiClient;
import com.factset.sdk.FactSetBanks.ApiResponse;
import com.factset.sdk.FactSetBanks.Configuration;
import com.factset.sdk.FactSetBanks.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetBanks.models.ErrorResponse;
import com.factset.sdk.FactSetBanks.models.FinancialsRequest;
import com.factset.sdk.FactSetBanks.models.FinancialsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FinancialsApi {
  private ApiClient apiClient;

  public FinancialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FinancialsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFinancialsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialsResponseTypeMap.put(200, new GenericType<FinancialsResponse>(){});
    getFinancialsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns bank financial statement data
   * Returns regulatory financial statements for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — US banks, thrifts, and depository institutions (FFIEC/FDIC/Federal Reserve sources). Covers 11,000+ bank holding companies (forms FR Y-9C/SP/LP/15) and 10,000+ banking institutions (FFIEC 031/041/051/101/102), with history back to 1991 for BHCs and 2002 for institutions. Includes demographics (charter class, specialization, established and deposit-insurance dates) and 3,000+ metrics covering profitability, capital adequacy (Basel III), loan/deposit composition, asset quality, yields, and funding costs. Also includes industry aggregates for 800+ US banking institutions with annual, quarterly, LTM, and YTD data since 2010. * **CANADA** — Canadian banks regulated by OSFI. 148+ institutions; 800+ data items; history since 2017. Balance sheet data is updated monthly; supplementary reports (Capital Components, Credit Losses, Derivative Contracts, Foreign Bank Branch, Income Statement) are updated quarterly. * **AUSTRALIA** — Australian banks regulated by APRA. 100+ institutions, interim-period balance sheet data; LTM history since 2002; 30+ data items. * **CREDIT_UNION** — US credit unions regulated by NCUA. 5,800+ credit unions, quarterly data since 2017; 2,400+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;US&#x60;, &#x60;CANADA&#x60;, &#x60;AUSTRALIA&#x60;, &#x60;CREDIT_UNION&#x60;, &#x60;INDUSTRY&#x60; 
   * @param financialsRequest  (required)
   * @return FinancialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with financial statement data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialsResponse getFinancials(FinancialsRequest financialsRequest) throws ApiException {
    return getFinancialsWithHttpInfo(financialsRequest).getData();
  }

  /**
   * Returns bank financial statement data
   * Returns regulatory financial statements for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — US banks, thrifts, and depository institutions (FFIEC/FDIC/Federal Reserve sources). Covers 11,000+ bank holding companies (forms FR Y-9C/SP/LP/15) and 10,000+ banking institutions (FFIEC 031/041/051/101/102), with history back to 1991 for BHCs and 2002 for institutions. Includes demographics (charter class, specialization, established and deposit-insurance dates) and 3,000+ metrics covering profitability, capital adequacy (Basel III), loan/deposit composition, asset quality, yields, and funding costs. Also includes industry aggregates for 800+ US banking institutions with annual, quarterly, LTM, and YTD data since 2010. * **CANADA** — Canadian banks regulated by OSFI. 148+ institutions; 800+ data items; history since 2017. Balance sheet data is updated monthly; supplementary reports (Capital Components, Credit Losses, Derivative Contracts, Foreign Bank Branch, Income Statement) are updated quarterly. * **AUSTRALIA** — Australian banks regulated by APRA. 100+ institutions, interim-period balance sheet data; LTM history since 2002; 30+ data items. * **CREDIT_UNION** — US credit unions regulated by NCUA. 5,800+ credit unions, quarterly data since 2017; 2,400+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;US&#x60;, &#x60;CANADA&#x60;, &#x60;AUSTRALIA&#x60;, &#x60;CREDIT_UNION&#x60;, &#x60;INDUSTRY&#x60; 
   * @param financialsRequest  (required)
   * @return ApiResponse&lt;FinancialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with financial statement data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialsResponse> getFinancialsWithHttpInfo(FinancialsRequest financialsRequest) throws ApiException {
    Object localVarPostBody = financialsRequest;
    
    // verify the required parameter 'financialsRequest' is set
    if (financialsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'financialsRequest' when calling getFinancials");
    }
    
    // create path and map variables
    String localVarPath = "/financials";

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
        
        FinancialsResponse
      
    > apiResponse = apiClient.invokeAPI("FinancialsApi.getFinancials", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialsResponseTypeMap, false);

    return apiResponse;

  }
}
