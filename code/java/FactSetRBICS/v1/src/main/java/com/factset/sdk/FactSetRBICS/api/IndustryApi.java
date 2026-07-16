package com.factset.sdk.FactSetRBICS.api;

import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiResponse;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetRBICS.models.ErrorsResponse;
import com.factset.sdk.FactSetRBICS.models.IndustryFocusResponse;
import com.factset.sdk.FactSetRBICS.models.IndustryRequest;
import com.factset.sdk.FactSetRBICS.models.IndustryRevenueRequest;
import com.factset.sdk.FactSetRBICS.models.IndustryRevenueResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IndustryApi {
  private ApiClient apiClient;

  public IndustryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IndustryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getRbicsIndustryFocusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsIndustryFocusResponseTypeMap.put(200, new GenericType<IndustryFocusResponse>(){});
    getRbicsIndustryFocusResponseTypeMap.put(400, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusResponseTypeMap.put(401, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusResponseTypeMap.put(403, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusResponseTypeMap.put(415, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusResponseTypeMap.put(500, new GenericType<ErrorsResponse>(){});
  }

  private static final Map<Integer, GenericType> getRbicsIndustryFocusForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsIndustryFocusForListResponseTypeMap.put(200, new GenericType<IndustryFocusResponse>(){});
    getRbicsIndustryFocusForListResponseTypeMap.put(400, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusForListResponseTypeMap.put(401, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusForListResponseTypeMap.put(403, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusForListResponseTypeMap.put(415, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryFocusForListResponseTypeMap.put(500, new GenericType<ErrorsResponse>(){});
  }

  private static final Map<Integer, GenericType> getRbicsIndustryRevenueResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsIndustryRevenueResponseTypeMap.put(200, new GenericType<IndustryRevenueResponse>(){});
    getRbicsIndustryRevenueResponseTypeMap.put(400, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueResponseTypeMap.put(401, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueResponseTypeMap.put(403, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueResponseTypeMap.put(415, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueResponseTypeMap.put(500, new GenericType<ErrorsResponse>(){});
  }

  private static final Map<Integer, GenericType> getRbicsIndustryRevenueForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsIndustryRevenueForListResponseTypeMap.put(200, new GenericType<IndustryRevenueResponse>(){});
    getRbicsIndustryRevenueForListResponseTypeMap.put(400, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueForListResponseTypeMap.put(401, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueForListResponseTypeMap.put(403, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueForListResponseTypeMap.put(415, new GenericType<ErrorsResponse>(){});
    getRbicsIndustryRevenueForListResponseTypeMap.put(500, new GenericType<ErrorsResponse>(){});
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
   * Get the list of companies with a specific RBICS Focus classification.
   * Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.   A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.   Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 
   * @param rbicsIds A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  (required)
   * @param startDate Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @param endDate Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @return IndustryFocusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies with a specific RBICS Focus classification. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndustryFocusResponse getRbicsIndustryFocus(java.util.List<String> rbicsIds, LocalDate startDate, LocalDate endDate) throws ApiException {
    return getRbicsIndustryFocusWithHttpInfo(rbicsIds, startDate, endDate).getData();
  }

  /**
   * Get the list of companies with a specific RBICS Focus classification.
   * Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.   A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.   Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 
   * @param rbicsIds A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  (required)
   * @param startDate Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @param endDate Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @return ApiResponse&lt;IndustryFocusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies with a specific RBICS Focus classification. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndustryFocusResponse> getRbicsIndustryFocusWithHttpInfo(java.util.List<String> rbicsIds, LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'rbicsIds' is set
    if (rbicsIds == null) {
      throw new ApiException(400, "Missing the required parameter 'rbicsIds' when calling getRbicsIndustryFocus");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/industry/focus";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "rbicsIds", rbicsIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IndustryFocusResponse
      
    > apiResponse = apiClient.invokeAPI("IndustryApi.getRbicsIndustryFocus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsIndustryFocusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the list of companies with a specific Industry Focus classification.
   * Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.  A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.  Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 
   * @param industryRequest Request Body to request a list of Industry Focus objects. (required)
   * @return IndustryFocusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies with a specific RBICS Focus classification. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndustryFocusResponse getRbicsIndustryFocusForList(IndustryRequest industryRequest) throws ApiException {
    return getRbicsIndustryFocusForListWithHttpInfo(industryRequest).getData();
  }

  /**
   * Get the list of companies with a specific Industry Focus classification.
   * Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.  A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.  Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 
   * @param industryRequest Request Body to request a list of Industry Focus objects. (required)
   * @return ApiResponse&lt;IndustryFocusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies with a specific RBICS Focus classification. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndustryFocusResponse> getRbicsIndustryFocusForListWithHttpInfo(IndustryRequest industryRequest) throws ApiException {
    Object localVarPostBody = industryRequest;
    
    // verify the required parameter 'industryRequest' is set
    if (industryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'industryRequest' when calling getRbicsIndustryFocusForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/industry/focus";

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
        
        IndustryFocusResponse
      
    > apiResponse = apiClient.invokeAPI("IndustryApi.getRbicsIndustryFocusForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsIndustryFocusForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
   * Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. 
   * @param rbicsIds List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  (required)
   * @param startDate Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @param endDate Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @return IndustryRevenueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndustryRevenueResponse getRbicsIndustryRevenue(java.util.List<String> rbicsIds, LocalDate startDate, LocalDate endDate) throws ApiException {
    return getRbicsIndustryRevenueWithHttpInfo(rbicsIds, startDate, endDate).getData();
  }

  /**
   * Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
   * Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. 
   * @param rbicsIds List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  (required)
   * @param startDate Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @param endDate Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  (optional)
   * @return ApiResponse&lt;IndustryRevenueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndustryRevenueResponse> getRbicsIndustryRevenueWithHttpInfo(java.util.List<String> rbicsIds, LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'rbicsIds' is set
    if (rbicsIds == null) {
      throw new ApiException(400, "Missing the required parameter 'rbicsIds' when calling getRbicsIndustryRevenue");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/industry/revenue";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "rbicsIds", rbicsIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IndustryRevenueResponse
      
    > apiResponse = apiClient.invokeAPI("IndustryApi.getRbicsIndustryRevenue", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsIndustryRevenueResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
   * Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. Use the POST method for large lists of &#x60;rbicsIds&#x60;. 
   * @param industryRevenueRequest Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry. (required)
   * @return IndustryRevenueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndustryRevenueResponse getRbicsIndustryRevenueForList(IndustryRevenueRequest industryRevenueRequest) throws ApiException {
    return getRbicsIndustryRevenueForListWithHttpInfo(industryRevenueRequest).getData();
  }

  /**
   * Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
   * Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. Use the POST method for large lists of &#x60;rbicsIds&#x60;. 
   * @param industryRevenueRequest Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry. (required)
   * @return ApiResponse&lt;IndustryRevenueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndustryRevenueResponse> getRbicsIndustryRevenueForListWithHttpInfo(IndustryRevenueRequest industryRevenueRequest) throws ApiException {
    Object localVarPostBody = industryRevenueRequest;
    
    // verify the required parameter 'industryRevenueRequest' is set
    if (industryRevenueRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'industryRevenueRequest' when calling getRbicsIndustryRevenueForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/industry/revenue";

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
        
        IndustryRevenueResponse
      
    > apiResponse = apiClient.invokeAPI("IndustryApi.getRbicsIndustryRevenueForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsIndustryRevenueForListResponseTypeMap, false);

    return apiResponse;

  }
}
