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

import com.factset.sdk.MarketIntelligence.models.FetchReportPollID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetrieveRefreshedReportApi {
  private ApiClient apiClient;

  public RetrieveRefreshedReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RetrieveRefreshedReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDataReportIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataReportIdGetResponseTypeMap.put(200, new GenericType<FetchReportPollID>(){});
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
   * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.
   * @param reportId example: 65ba6dd63fb366464646426d0b (required)
   * @return FetchReportPollID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. If the report requested has been refreshed within an hour, the report data will be returned. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Your report is being processed. Please Check again after sometime. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or authentication failure </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Unrecognized report_id </td><td>  -  </td></tr>
     </table>
   */
  public FetchReportPollID getDataReportIdGet(String reportId) throws ApiException {
    return getDataReportIdGetWithHttpInfo(reportId).getData();
  }

  /**
   * Retrieve data for desired report.
   * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.
   * @param reportId example: 65ba6dd63fb366464646426d0b (required)
   * @return ApiResponse&lt;FetchReportPollID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. If the report requested has been refreshed within an hour, the report data will be returned. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Your report is being processed. Please Check again after sometime. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unknown Error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or authentication failure </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Unrecognized report_id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FetchReportPollID> getDataReportIdGetWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getDataReportIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/get-data/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

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
        
        FetchReportPollID
      
    > apiResponse = apiClient.invokeAPI("RetrieveRefreshedReportApi.getDataReportIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataReportIdGetResponseTypeMap, false);

    return apiResponse;

  }
}
