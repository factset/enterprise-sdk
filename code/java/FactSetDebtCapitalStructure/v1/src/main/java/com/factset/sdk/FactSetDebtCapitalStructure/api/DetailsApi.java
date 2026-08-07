package com.factset.sdk.FactSetDebtCapitalStructure.api;

import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetDebtCapitalStructure.models.DetailsRequest;
import com.factset.sdk.FactSetDebtCapitalStructure.models.DetailsResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.DetailsSummaryResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.ErrorResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.InterimDetailsRequest;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DetailsApi {
  private ApiClient apiClient;

  public DetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DetailsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDetailsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDetailsListResponseTypeMap.put(200, new GenericType<DetailsResponse>(){});
    getDetailsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDetailsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDetailsSummaryResponseTypeMap.put(200, new GenericType<DetailsSummaryResponse>(){});
    getDetailsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDetailsSummaryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDetailsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDetailsSummaryResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDetailsSummaryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDetailsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getInterimDetailsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInterimDetailsListResponseTypeMap.put(200, new GenericType<DetailsResponse>(){});
    getInterimDetailsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns debt instruments for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 
   * @param detailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return DetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsResponse getDetailsList(DetailsRequest detailsRequest) throws ApiException {
    return getDetailsListWithHttpInfo(detailsRequest).getData();
  }

  /**
   * Returns debt instruments for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 
   * @param detailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return ApiResponse&lt;DetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsResponse> getDetailsListWithHttpInfo(DetailsRequest detailsRequest) throws ApiException {
    Object localVarPostBody = detailsRequest;
    
    // verify the required parameter 'detailsRequest' is set
    if (detailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detailsRequest' when calling getDetailsList");
    }
    
    // create path and map variables
    String localVarPath = "/details";

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
        
        DetailsResponse
      
    > apiResponse = apiClient.invokeAPI("DetailsApi.getDetailsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDetailsListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns debt instrument totals details for specified list of companies.
   * Gets totals for instruments of varying types such as Revolving Credit, Term Loans,  ST Debt Total, Notes/Bonds, and Other.  
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.   (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual Original,   * **QTR**  &#x3D; Quarterly  (required)
   * @param startDate The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional, default to LOCAL)
   * @return DetailsSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Details summary object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsSummaryResponse getDetailsSummary(java.util.List<String> ids, String periodicity, LocalDate startDate, String currency) throws ApiException {
    return getDetailsSummaryWithHttpInfo(ids, periodicity, startDate, currency).getData();
  }

  /**
   * Returns debt instrument totals details for specified list of companies.
   * Gets totals for instruments of varying types such as Revolving Credit, Term Loans,  ST Debt Total, Notes/Bonds, and Other.  
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.   (required)
   * @param periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual Original,   * **QTR**  &#x3D; Quarterly  (required)
   * @param startDate The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional, default to LOCAL)
   * @return ApiResponse&lt;DetailsSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Details summary object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsSummaryResponse> getDetailsSummaryWithHttpInfo(java.util.List<String> ids, String periodicity, LocalDate startDate, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getDetailsSummary");
    }
    
    // verify the required parameter 'periodicity' is set
    if (periodicity == null) {
      throw new ApiException(400, "Missing the required parameter 'periodicity' when calling getDetailsSummary");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getDetailsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/details-summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
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
        
        DetailsSummaryResponse
      
    > apiResponse = apiClient.invokeAPI("DetailsApi.getDetailsSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDetailsSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns most recently available debt instrument data for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 
   * @param interimDetailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return DetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of interim details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsResponse getInterimDetailsList(InterimDetailsRequest interimDetailsRequest) throws ApiException {
    return getInterimDetailsListWithHttpInfo(interimDetailsRequest).getData();
  }

  /**
   * Returns most recently available debt instrument data for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 
   * @param interimDetailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return ApiResponse&lt;DetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of interim details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsResponse> getInterimDetailsListWithHttpInfo(InterimDetailsRequest interimDetailsRequest) throws ApiException {
    Object localVarPostBody = interimDetailsRequest;
    
    // verify the required parameter 'interimDetailsRequest' is set
    if (interimDetailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'interimDetailsRequest' when calling getInterimDetailsList");
    }
    
    // create path and map variables
    String localVarPath = "/details-interim";

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
        
        DetailsResponse
      
    > apiResponse = apiClient.invokeAPI("DetailsApi.getInterimDetailsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInterimDetailsListResponseTypeMap, false);

    return apiResponse;

  }
}
