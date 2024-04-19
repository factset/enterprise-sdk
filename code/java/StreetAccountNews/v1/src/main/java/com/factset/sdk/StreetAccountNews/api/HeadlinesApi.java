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

import com.factset.sdk.StreetAccountNews.models.Error;
import com.factset.sdk.StreetAccountNews.models.HeadlinesRequest;
import com.factset.sdk.StreetAccountNews.models.HeadlinesRequestByView;
import com.factset.sdk.StreetAccountNews.models.HeadlinesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HeadlinesApi {
  private ApiClient apiClient;

  public HeadlinesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HeadlinesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getStreetAccountHeadlinesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountHeadlinesResponseTypeMap.put(200, new GenericType<HeadlinesResponse>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountHeadlinesByViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountHeadlinesByViewResponseTypeMap.put(200, new GenericType<HeadlinesResponse>(){});
    getStreetAccountHeadlinesByViewResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountHeadlinesByViewResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountHeadlinesByViewResponseTypeMap.put(404, new GenericType<Error>(){});
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
   * Retrieve StreetAccount headlines for given filters
   * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.
   * @param headlinesRequest /filters endpoint contains the filters associated with the optional parameters in the request body. (optional)
   * @return HeadlinesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the headlines and associated story information for given filters. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public HeadlinesResponse getStreetAccountHeadlines(HeadlinesRequest headlinesRequest) throws ApiException {
    return getStreetAccountHeadlinesWithHttpInfo(headlinesRequest).getData();
  }

  /**
   * Retrieve StreetAccount headlines for given filters
   * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.
   * @param headlinesRequest /filters endpoint contains the filters associated with the optional parameters in the request body. (optional)
   * @return ApiResponse&lt;HeadlinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the headlines and associated story information for given filters. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<HeadlinesResponse> getStreetAccountHeadlinesWithHttpInfo(HeadlinesRequest headlinesRequest) throws ApiException {
    Object localVarPostBody = headlinesRequest;
    
    // create path and map variables
    String localVarPath = "/headlines";

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
        
        HeadlinesResponse
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getStreetAccountHeadlines", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountHeadlinesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve StreetAccount headlines for given view
   * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
   * @param headlinesRequestByView View body which needs to be sent with request (optional)
   * @return HeadlinesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the headlines and associated story information for given view. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public HeadlinesResponse getStreetAccountHeadlinesByView(HeadlinesRequestByView headlinesRequestByView) throws ApiException {
    return getStreetAccountHeadlinesByViewWithHttpInfo(headlinesRequestByView).getData();
  }

  /**
   * Retrieve StreetAccount headlines for given view
   * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
   * @param headlinesRequestByView View body which needs to be sent with request (optional)
   * @return ApiResponse&lt;HeadlinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the headlines and associated story information for given view. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<HeadlinesResponse> getStreetAccountHeadlinesByViewWithHttpInfo(HeadlinesRequestByView headlinesRequestByView) throws ApiException {
    Object localVarPostBody = headlinesRequestByView;
    
    // create path and map variables
    String localVarPath = "/headlines/view";

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
        
        HeadlinesResponse
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getStreetAccountHeadlinesByView", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountHeadlinesByViewResponseTypeMap, false);

    return apiResponse;

  }
}
