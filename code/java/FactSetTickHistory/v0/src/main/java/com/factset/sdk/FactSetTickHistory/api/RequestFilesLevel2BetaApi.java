package com.factset.sdk.FactSetTickHistory.api;

import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiResponse;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTickHistory.models.Level2RequestFilesResponse;
import java.time.LocalDate;
import com.factset.sdk.FactSetTickHistory.models.Status;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestFilesLevel2BetaApi {
  private ApiClient apiClient;

  public RequestFilesLevel2BetaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RequestFilesLevel2BetaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getrequestIdLevel2ResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getrequestIdLevel2ResponseTypeMap.put(200, new GenericType<Level2RequestFilesResponse>(){});
    getrequestIdLevel2ResponseTypeMap.put(400, new GenericType<Status>(){});
    getrequestIdLevel2ResponseTypeMap.put(401, new GenericType<Status>(){});
    getrequestIdLevel2ResponseTypeMap.put(403, new GenericType<Status>(){});
    getrequestIdLevel2ResponseTypeMap.put(429, new GenericType<Status>(){});
    getrequestIdLevel2ResponseTypeMap.put(500, new GenericType<Status>(){});
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
   * Returns the requestId and status
   * Returns the requestId and status.
   * @param ticker The requested list of one or more Market tickers. (required)
   * @param startDate The date to which data is required. (required)
   * @param endDate The date to which data is required. (required)
   * @param mic This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; (required)
   * @param responseFileType Specifies the fileType (optional, default to parquet)
   * @return Level2RequestFilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successs </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public Level2RequestFilesResponse getrequestIdLevel2(java.util.List<String> ticker, LocalDate startDate, LocalDate endDate, String mic, String responseFileType) throws ApiException {
    return getrequestIdLevel2WithHttpInfo(ticker, startDate, endDate, mic, responseFileType).getData();
  }

  /**
   * Returns the requestId and status
   * Returns the requestId and status.
   * @param ticker The requested list of one or more Market tickers. (required)
   * @param startDate The date to which data is required. (required)
   * @param endDate The date to which data is required. (required)
   * @param mic This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; (required)
   * @param responseFileType Specifies the fileType (optional, default to parquet)
   * @return ApiResponse&lt;Level2RequestFilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successs </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Level2RequestFilesResponse> getrequestIdLevel2WithHttpInfo(java.util.List<String> ticker, LocalDate startDate, LocalDate endDate, String mic, String responseFileType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ticker' is set
    if (ticker == null) {
      throw new ApiException(400, "Missing the required parameter 'ticker' when calling getrequestIdLevel2");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getrequestIdLevel2");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getrequestIdLevel2");
    }
    
    // verify the required parameter 'mic' is set
    if (mic == null) {
      throw new ApiException(400, "Missing the required parameter 'mic' when calling getrequestIdLevel2");
    }
    
    // create path and map variables
    String localVarPath = "/level2/request-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mic", mic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "responseFileType", responseFileType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Level2RequestFilesResponse
      
    > apiResponse = apiClient.invokeAPI("RequestFilesLevel2BetaApi.getrequestIdLevel2", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getrequestIdLevel2ResponseTypeMap, false);

    return apiResponse;

  }
}
