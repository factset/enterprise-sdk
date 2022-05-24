package com.factset.sdk.MarketIntelligence.api;

import com.factset.sdk.MarketIntelligence.ApiException;
import com.factset.sdk.MarketIntelligence.ApiClient;
import com.factset.sdk.MarketIntelligence.ApiResponse;
import com.factset.sdk.MarketIntelligence.Configuration;
import com.factset.sdk.MarketIntelligence.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.MarketIntelligence.models.GetReportInfo;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetrieveReportListApi {
  private ApiClient apiClient;

  public RetrieveReportListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RetrieveReportListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getReportsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getReportsGetResponseTypeMap.put(200, new GenericType<GetReportInfo>(){});
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
   * Retrieve a list of previously created reports and associated report metadata.
   * Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.
   * @return GetReportInfo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response, Previously created report list fetched. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials  or authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public GetReportInfo getReportsGet() throws ApiException {
    return getReportsGetWithHttpInfo().getData();
  }

  /**
   * Retrieve a list of previously created reports and associated report metadata.
   * Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.
   * @return ApiResponse&lt;GetReportInfo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response, Previously created report list fetched. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials  or authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetReportInfo> getReportsGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/get-reports";

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
        
        GetReportInfo
      
    > apiResponse = apiClient.invokeAPI("RetrieveReportListApi.getReportsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getReportsGetResponseTypeMap, false);

    return apiResponse;

  }
}
