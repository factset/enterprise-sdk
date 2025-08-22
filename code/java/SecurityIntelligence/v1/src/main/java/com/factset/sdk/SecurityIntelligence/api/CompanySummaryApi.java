package com.factset.sdk.SecurityIntelligence.api;

import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiResponse;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.SecurityIntelligence.models.CustomValidationError;
import com.factset.sdk.SecurityIntelligence.models.DebtSummaryResponse;
import com.factset.sdk.SecurityIntelligence.models.EventsSummaryResponse;
import com.factset.sdk.SecurityIntelligence.models.FinancialHighlightsResponse;
import com.factset.sdk.SecurityIntelligence.models.MnaSummaryResponse;
import com.factset.sdk.SecurityIntelligence.models.OwnershipInsightsResponse;
import com.factset.sdk.SecurityIntelligence.models.ServerError;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanySummaryApi {
  private ApiClient apiClient;

  public CompanySummaryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanySummaryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCompanyDebtSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyDebtSummaryResponseTypeMap.put(200, new GenericType<DebtSummaryResponse>(){});
    getCompanyDebtSummaryResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getCompanyDebtSummaryResponseTypeMap.put(500, new GenericType<ServerError>(){});
  }

  private static final Map<Integer, GenericType> getCompanyEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyEventsResponseTypeMap.put(200, new GenericType<EventsSummaryResponse>(){});
    getCompanyEventsResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getCompanyEventsResponseTypeMap.put(500, new GenericType<ServerError>(){});
  }

  private static final Map<Integer, GenericType> getCompanyFinancialHighlightsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyFinancialHighlightsResponseTypeMap.put(200, new GenericType<FinancialHighlightsResponse>(){});
    getCompanyFinancialHighlightsResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getCompanyFinancialHighlightsResponseTypeMap.put(500, new GenericType<ServerError>(){});
  }

  private static final Map<Integer, GenericType> getCompanyMNASummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyMNASummaryResponseTypeMap.put(200, new GenericType<MnaSummaryResponse>(){});
    getCompanyMNASummaryResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getCompanyMNASummaryResponseTypeMap.put(500, new GenericType<ServerError>(){});
  }

  private static final Map<Integer, GenericType> getCompanyOwnershipInsightsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyOwnershipInsightsResponseTypeMap.put(200, new GenericType<OwnershipInsightsResponse>(){});
    getCompanyOwnershipInsightsResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getCompanyOwnershipInsightsResponseTypeMap.put(500, new GenericType<ServerError>(){});
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
   * Get Company Debt Summary
   * Presents the company&#39;s Debt Capital Structure maturity data, analysis of Total Debt, and information on debt obligations due in the near term.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return DebtSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public DebtSummaryResponse getCompanyDebtSummary(String identifier) throws ApiException {
    return getCompanyDebtSummaryWithHttpInfo(identifier).getData();
  }

  /**
   * Get Company Debt Summary
   * Presents the company&#39;s Debt Capital Structure maturity data, analysis of Total Debt, and information on debt obligations due in the near term.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return ApiResponse&lt;DebtSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DebtSummaryResponse> getCompanyDebtSummaryWithHttpInfo(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getCompanyDebtSummary");
    }
    
    // create path and map variables
    String localVarPath = "/company/debt";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DebtSummaryResponse
      
    > apiResponse = apiClient.invokeAPI("CompanySummaryApi.getCompanyDebtSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyDebtSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Company Events
   * Returns a summary of company events including Dividends, Earnings Releases and Stock Splits spanning 7 days in the past and 60 days into the future.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return EventsSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsSummaryResponse getCompanyEvents(String identifier) throws ApiException {
    return getCompanyEventsWithHttpInfo(identifier).getData();
  }

  /**
   * Get Company Events
   * Returns a summary of company events including Dividends, Earnings Releases and Stock Splits spanning 7 days in the past and 60 days into the future.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return ApiResponse&lt;EventsSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsSummaryResponse> getCompanyEventsWithHttpInfo(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getCompanyEvents");
    }
    
    // create path and map variables
    String localVarPath = "/company/events";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventsSummaryResponse
      
    > apiResponse = apiClient.invokeAPI("CompanySummaryApi.getCompanyEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Company Financial Highlights
   * Provides comprehensive financial data including Income Statement, Cash Flow Statement, and Balance Sheet for the past 1.5 years.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return FinancialHighlightsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public FinancialHighlightsResponse getCompanyFinancialHighlights(String identifier) throws ApiException {
    return getCompanyFinancialHighlightsWithHttpInfo(identifier).getData();
  }

  /**
   * Get Company Financial Highlights
   * Provides comprehensive financial data including Income Statement, Cash Flow Statement, and Balance Sheet for the past 1.5 years.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return ApiResponse&lt;FinancialHighlightsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialHighlightsResponse> getCompanyFinancialHighlightsWithHttpInfo(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getCompanyFinancialHighlights");
    }
    
    // create path and map variables
    String localVarPath = "/company/financials";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FinancialHighlightsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanySummaryApi.getCompanyFinancialHighlights", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyFinancialHighlightsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Company M&amp;A Summary
   * Reports on Mergers and Acquisitions activity related to the company within the last 3 months.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return MnaSummaryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public MnaSummaryResponse getCompanyMNASummary(String identifier) throws ApiException {
    return getCompanyMNASummaryWithHttpInfo(identifier).getData();
  }

  /**
   * Get Company M&amp;A Summary
   * Reports on Mergers and Acquisitions activity related to the company within the last 3 months.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return ApiResponse&lt;MnaSummaryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MnaSummaryResponse> getCompanyMNASummaryWithHttpInfo(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getCompanyMNASummary");
    }
    
    // create path and map variables
    String localVarPath = "/company/mna";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        MnaSummaryResponse
      
    > apiResponse = apiClient.invokeAPI("CompanySummaryApi.getCompanyMNASummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyMNASummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Company Ownership Insights
   * Provides information on any activists targeting the company, and highlights the largest ownership position changes over the last 6 months.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return OwnershipInsightsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public OwnershipInsightsResponse getCompanyOwnershipInsights(String identifier) throws ApiException {
    return getCompanyOwnershipInsightsWithHttpInfo(identifier).getData();
  }

  /**
   * Get Company Ownership Insights
   * Provides information on any activists targeting the company, and highlights the largest ownership position changes over the last 6 months.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @return ApiResponse&lt;OwnershipInsightsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with company data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OwnershipInsightsResponse> getCompanyOwnershipInsightsWithHttpInfo(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getCompanyOwnershipInsights");
    }
    
    // create path and map variables
    String localVarPath = "/company/ownership";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        OwnershipInsightsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanySummaryApi.getCompanyOwnershipInsights", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyOwnershipInsightsResponseTypeMap, false);

    return apiResponse;

  }
}
