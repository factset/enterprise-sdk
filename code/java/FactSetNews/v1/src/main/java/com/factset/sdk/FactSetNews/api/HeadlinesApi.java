package com.factset.sdk.FactSetNews.api;

import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiResponse;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetNews.models.Error;
import com.factset.sdk.FactSetNews.models.HeadlinesRequest;
import com.factset.sdk.FactSetNews.models.HeadlinesRequestByView;
import com.factset.sdk.FactSetNews.models.SearchResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HeadlinesApi {
  private ApiClient apiClient;

  public HeadlinesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HeadlinesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFactSetNewsHeadlinesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactSetNewsHeadlinesResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    getFactSetNewsHeadlinesResponseTypeMap.put(400, new GenericType<Error>(){});
    getFactSetNewsHeadlinesResponseTypeMap.put(401, new GenericType<Error>(){});
    getFactSetNewsHeadlinesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getFactSetNewsHeadlinesByViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactSetNewsHeadlinesByViewResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    getFactSetNewsHeadlinesByViewResponseTypeMap.put(400, new GenericType<Error>(){});
    getFactSetNewsHeadlinesByViewResponseTypeMap.put(401, new GenericType<Error>(){});
    getFactSetNewsHeadlinesByViewResponseTypeMap.put(404, new GenericType<Error>(){});
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
   * Retrieve FactSet News headlines for the given filters
   * This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to &#x60;/filters&#x60; endpoint to obtain the values.
   * @param headlinesRequest Filter Body which needs to be sent with request. (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public SearchResponse getFactSetNewsHeadlines(HeadlinesRequest headlinesRequest) throws ApiException {
    return getFactSetNewsHeadlinesWithHttpInfo(headlinesRequest).getData();
  }

  /**
   * Retrieve FactSet News headlines for the given filters
   * This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to &#x60;/filters&#x60; endpoint to obtain the values.
   * @param headlinesRequest Filter Body which needs to be sent with request. (optional)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getFactSetNewsHeadlinesWithHttpInfo(HeadlinesRequest headlinesRequest) throws ApiException {
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
        
        SearchResponse
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getFactSetNewsHeadlines", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactSetNewsHeadlinesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve FactSet News headlines for given view
   * This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the &#39;Create Views&#39; endpoint.
   * @param headlinesRequestByView View body which needs to be sent with request. (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public SearchResponse getFactSetNewsHeadlinesByView(HeadlinesRequestByView headlinesRequestByView) throws ApiException {
    return getFactSetNewsHeadlinesByViewWithHttpInfo(headlinesRequestByView).getData();
  }

  /**
   * Retrieve FactSet News headlines for given view
   * This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the &#39;Create Views&#39; endpoint.
   * @param headlinesRequestByView View body which needs to be sent with request. (optional)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getFactSetNewsHeadlinesByViewWithHttpInfo(HeadlinesRequestByView headlinesRequestByView) throws ApiException {
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
        
        SearchResponse
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getFactSetNewsHeadlinesByView", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactSetNewsHeadlinesByViewResponseTypeMap, false);

    return apiResponse;

  }
}
