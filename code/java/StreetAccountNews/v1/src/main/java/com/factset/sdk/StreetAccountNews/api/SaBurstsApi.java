package com.factset.sdk.StreetAccountNews.api;

import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiResponse;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StreetAccountNews.models.BurstFileResponse;
import com.factset.sdk.StreetAccountNews.models.Error;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SaBurstsApi {
  private ApiClient apiClient;

  public SaBurstsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SaBurstsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLatestBurstFileResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLatestBurstFileResponseTypeMap.put(200, new GenericType<BurstFileResponse>(){});
    getLatestBurstFileResponseTypeMap.put(401, new GenericType<Error>(){});
    getLatestBurstFileResponseTypeMap.put(404, new GenericType<Error>(){});
    getLatestBurstFileResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Retrieve the latest burst file metadata and download URL
   * Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the &#x60;downloadUrl&#x60; in the response to download the file.  **Response fields**  - **&#x60;burstDateTime&#x60;** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).  - **&#x60;downloadUrl&#x60;** — Opaque URL to download the burst file. Issue   a &#x60;GET&#x60; request to this URL to receive an HTTP 302 redirect to the file.   The URL contains a short-lived token unique to this burst and   is valid for **5 minutes**. 
   * @return BurstFileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Latest burst file metadata. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No burst file available. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public BurstFileResponse getLatestBurstFile() throws ApiException {
    return getLatestBurstFileWithHttpInfo().getData();
  }

  /**
   * Retrieve the latest burst file metadata and download URL
   * Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the &#x60;downloadUrl&#x60; in the response to download the file.  **Response fields**  - **&#x60;burstDateTime&#x60;** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).  - **&#x60;downloadUrl&#x60;** — Opaque URL to download the burst file. Issue   a &#x60;GET&#x60; request to this URL to receive an HTTP 302 redirect to the file.   The URL contains a short-lived token unique to this burst and   is valid for **5 minutes**. 
   * @return ApiResponse&lt;BurstFileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Latest burst file metadata. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No burst file available. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BurstFileResponse> getLatestBurstFileWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sa-bursts/latest-file";

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
        
        BurstFileResponse
      
    > apiResponse = apiClient.invokeAPI("SaBurstsApi.getLatestBurstFile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLatestBurstFileResponseTypeMap, false);

    return apiResponse;

  }
}
