package com.factset.sdk.InvestmentResearch.api;

import com.factset.sdk.InvestmentResearch.ApiException;
import com.factset.sdk.InvestmentResearch.ApiClient;
import com.factset.sdk.InvestmentResearch.ApiResponse;
import com.factset.sdk.InvestmentResearch.Configuration;
import com.factset.sdk.InvestmentResearch.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.InvestmentResearch.models.CountRequest;
import com.factset.sdk.InvestmentResearch.models.CountResponse;
import com.factset.sdk.InvestmentResearch.models.ErrorResponse;
import com.factset.sdk.InvestmentResearch.models.InvestmentResearchResponse;
import com.factset.sdk.InvestmentResearch.models.SearchRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResearchApi {
  private ApiClient apiClient;

  public ResearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCountResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCountResponseTypeMap.put(200, new GenericType<CountResponse>(){});
    getCountResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getInvestmentResearchDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInvestmentResearchDataResponseTypeMap.put(200, new GenericType<InvestmentResearchResponse>(){});
    getInvestmentResearchDataResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getInvestmentResearchDataResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getInvestmentResearchDataResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getInvestmentResearchDataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the count of documents for specified source.
   * Returns the count of documents along with other response fields.
   * @param countRequest  (required)
   * @return CountResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CountResponse getCount(CountRequest countRequest) throws ApiException {
    return getCountWithHttpInfo(countRequest).getData();
  }

  /**
   * Returns the count of documents for specified source.
   * Returns the count of documents along with other response fields.
   * @param countRequest  (required)
   * @return ApiResponse&lt;CountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CountResponse> getCountWithHttpInfo(CountRequest countRequest) throws ApiException {
    Object localVarPostBody = countRequest;
    
    // verify the required parameter 'countRequest' is set
    if (countRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'countRequest' when calling getCount");
    }
    
    // create path and map variables
    String localVarPath = "/count";

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
        
        CountResponse
      
    > apiResponse = apiClient.invokeAPI("ResearchApi.getCount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCountResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve investment research documents and related metadata within FactSet coverage.
   * The /search endpoint returns the details about research documents, including headline, source, contributors, analyst information, categories, document links, relevant IDs and publication date.
   * @param searchRequest  (required)
   * @return InvestmentResearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of downloadable URLs consisting of investment research documents with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public InvestmentResearchResponse getInvestmentResearchData(SearchRequest searchRequest) throws ApiException {
    return getInvestmentResearchDataWithHttpInfo(searchRequest).getData();
  }

  /**
   * Retrieve investment research documents and related metadata within FactSet coverage.
   * The /search endpoint returns the details about research documents, including headline, source, contributors, analyst information, categories, document links, relevant IDs and publication date.
   * @param searchRequest  (required)
   * @return ApiResponse&lt;InvestmentResearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of downloadable URLs consisting of investment research documents with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InvestmentResearchResponse> getInvestmentResearchDataWithHttpInfo(SearchRequest searchRequest) throws ApiException {
    Object localVarPostBody = searchRequest;
    
    // verify the required parameter 'searchRequest' is set
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling getInvestmentResearchData");
    }
    
    // create path and map variables
    String localVarPath = "/search";

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
        
        InvestmentResearchResponse
      
    > apiResponse = apiClient.invokeAPI("ResearchApi.getInvestmentResearchData", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInvestmentResearchDataResponseTypeMap, false);

    return apiResponse;

  }
}
