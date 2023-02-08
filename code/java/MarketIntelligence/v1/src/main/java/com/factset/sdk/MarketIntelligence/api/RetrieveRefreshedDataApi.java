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

import com.factset.sdk.MarketIntelligence.models.ReportDataHeader;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetrieveRefreshedDataApi {
  private ApiClient apiClient;

  public RetrieveRefreshedDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RetrieveRefreshedDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDataPollIdResultGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataPollIdResultGetResponseTypeMap.put(200, new GenericType<ReportDataHeader>(){});
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
   * Retrieve data for desired report.
   * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
   * @param pollId example: 65ba6dd63fb366464646426d0b (required)
   * @return ReportDataHeader
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Report data retrieved. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public ReportDataHeader getDataPollIdResultGet(String pollId) throws ApiException {
    return getDataPollIdResultGetWithHttpInfo(pollId).getData();
  }

  /**
   * Retrieve data for desired report.
   * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
   * @param pollId example: 65ba6dd63fb366464646426d0b (required)
   * @return ApiResponse&lt;ReportDataHeader&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Report data retrieved. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportDataHeader> getDataPollIdResultGetWithHttpInfo(String pollId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling getDataPollIdResultGet");
    }
    
    // create path and map variables
    String localVarPath = "/get-data/{poll_id}/result"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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
        
        ReportDataHeader
      
    > apiResponse = apiClient.invokeAPI("RetrieveRefreshedDataApi.getDataPollIdResultGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataPollIdResultGetResponseTypeMap, false);

    return apiResponse;

  }
}
