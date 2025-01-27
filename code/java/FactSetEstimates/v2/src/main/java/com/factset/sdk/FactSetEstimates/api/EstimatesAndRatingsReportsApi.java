package com.factset.sdk.FactSetEstimates.api;

import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiResponse;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEstimates.models.AnalystRatingResponse;
import com.factset.sdk.FactSetEstimates.models.ErrorResponse;
import com.factset.sdk.FactSetEstimates.models.EstimateResponse;
import com.factset.sdk.FactSetEstimates.models.EstimateTypesResponse;
import com.factset.sdk.FactSetEstimates.models.SurpriseHistoryResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EstimatesAndRatingsReportsApi {
  private ApiClient apiClient;

  public EstimatesAndRatingsReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EstimatesAndRatingsReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAnalystRatingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAnalystRatingsResponseTypeMap.put(200, new GenericType<AnalystRatingResponse>(){});
    getAnalystRatingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getAnalystRatingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getAnalystRatingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getAnalystRatingsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getAnalystRatingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getAnalystRatingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEstimateTypesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEstimateTypesResponseTypeMap.put(200, new GenericType<EstimateTypesResponse>(){});
    getEstimateTypesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEstimateTypesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEstimateTypesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEstimateTypesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEstimateTypesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEstimateTypesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEstimatesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEstimatesResponseTypeMap.put(200, new GenericType<EstimateResponse>(){});
    getEstimatesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEstimatesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEstimatesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEstimatesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEstimatesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEstimatesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSurpriseHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSurpriseHistoryResponseTypeMap.put(200, new GenericType<SurpriseHistoryResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSurpriseHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieves the historical monthly view of analyst ratings for a given identifier.
   * Returns historical monthly view of analyst ratings for given identifier upto a period of 12 months. 
   * @param id The requested security identifier. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.  (required)
   * @return AnalystRatingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Analyst-ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AnalystRatingResponse getAnalystRatings(String id) throws ApiException {
    return getAnalystRatingsWithHttpInfo(id).getData();
  }

  /**
   * Retrieves the historical monthly view of analyst ratings for a given identifier.
   * Returns historical monthly view of analyst ratings for given identifier upto a period of 12 months. 
   * @param id The requested security identifier. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.  (required)
   * @return ApiResponse&lt;AnalystRatingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Analyst-ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalystRatingResponse> getAnalystRatingsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAnalystRatings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/company-reports/analyst-ratings";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        AnalystRatingResponse
      
    > apiResponse = apiClient.invokeAPI("EstimatesAndRatingsReportsApi.getAnalystRatings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAnalystRatingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of valid estimate types.
   * This endpoint retrieves a list of valid estimate types that can be used in the /company-reports/forecast and /company-reports/surprise-history end points. 
   * @return EstimateTypesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate type data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EstimateTypesResponse getEstimateTypes() throws ApiException {
    return getEstimateTypesWithHttpInfo().getData();
  }

  /**
   * Returns a list of valid estimate types.
   * This endpoint retrieves a list of valid estimate types that can be used in the /company-reports/forecast and /company-reports/surprise-history end points. 
   * @return ApiResponse&lt;EstimateTypesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate type data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EstimateTypesResponse> getEstimateTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/company-reports/estimate-types";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EstimateTypesResponse
      
    > apiResponse = apiClient.invokeAPI("EstimatesAndRatingsReportsApi.getEstimateTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEstimateTypesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns forecasted estimates.
   * This endpoint returns up to 4 years of forecasted consensus estimates made by analysts for various financial metrics such as EPS, Sales, and more.  **Note :**   Due to variations in methodology, with the workstation using intra-day prices and our API using the previous day&#39;s closing prices, there may be some minor differences in the values of FactSet Estimates Valuation Items. 
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param estimateType The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. (required)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional, default to ANN)
   * @return EstimateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EstimateResponse getEstimates(String id, String estimateType, String periodicity) throws ApiException {
    return getEstimatesWithHttpInfo(id, estimateType, periodicity).getData();
  }

  /**
   * Returns forecasted estimates.
   * This endpoint returns up to 4 years of forecasted consensus estimates made by analysts for various financial metrics such as EPS, Sales, and more.  **Note :**   Due to variations in methodology, with the workstation using intra-day prices and our API using the previous day&#39;s closing prices, there may be some minor differences in the values of FactSet Estimates Valuation Items. 
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param estimateType The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. (required)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional, default to ANN)
   * @return ApiResponse&lt;EstimateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EstimateResponse> getEstimatesWithHttpInfo(String id, String estimateType, String periodicity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getEstimates");
    }
    
    // verify the required parameter 'estimateType' is set
    if (estimateType == null) {
      throw new ApiException(400, "Missing the required parameter 'estimateType' when calling getEstimates");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/company-reports/forecast";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "estimateType", estimateType));
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
        
        EstimateResponse
      
    > apiResponse = apiClient.invokeAPI("EstimatesAndRatingsReportsApi.getEstimates", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEstimatesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Surprise History
   * Returns surprise history for the given security
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param estimateType The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. (required)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional, default to ANN)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return SurpriseHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SurpriseHistoryResponse getSurpriseHistory(String id, String estimateType, String periodicity, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getSurpriseHistoryWithHttpInfo(id, estimateType, periodicity, paginationLimit, paginationOffset).getData();
  }

  /**
   * Surprise History
   * Returns surprise history for the given security
   * @param id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. (required)
   * @param estimateType The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. (required)
   * @param periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional, default to ANN)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;SurpriseHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SurpriseHistoryResponse> getSurpriseHistoryWithHttpInfo(String id, String estimateType, String periodicity, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSurpriseHistory");
    }
    
    // verify the required parameter 'estimateType' is set
    if (estimateType == null) {
      throw new ApiException(400, "Missing the required parameter 'estimateType' when calling getSurpriseHistory");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/company-reports/surprise-history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "estimateType", estimateType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodicity", periodicity));
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
        
        SurpriseHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("EstimatesAndRatingsReportsApi.getSurpriseHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSurpriseHistoryResponseTypeMap, false);

    return apiResponse;

  }
}
