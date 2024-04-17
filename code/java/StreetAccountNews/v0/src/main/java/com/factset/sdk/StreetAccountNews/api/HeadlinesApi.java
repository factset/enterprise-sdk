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
import com.factset.sdk.StreetAccountNews.models.SaHeadlinesRequest;
import com.factset.sdk.StreetAccountNews.models.SaHeadlinesRequestByView;
import com.factset.sdk.StreetAccountNews.models.SearchResponse;

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
    getStreetAccountHeadlinesResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountHeadlinesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountHeadlinesByViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountHeadlinesByViewResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
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
   * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
   * @param saHeadlinesRequest Filter Body which needs to be sent with request (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse getStreetAccountHeadlines(SaHeadlinesRequest saHeadlinesRequest) throws ApiException {
    return getStreetAccountHeadlinesWithHttpInfo(saHeadlinesRequest).getData();
  }

  /**
   * Retrieve StreetAccount headlines for given filters
   * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
   * @param saHeadlinesRequest Filter Body which needs to be sent with request (optional)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getStreetAccountHeadlinesWithHttpInfo(SaHeadlinesRequest saHeadlinesRequest) throws ApiException {
    Object localVarPostBody = saHeadlinesRequest;
    
    // create path and map variables
    String localVarPath = "/streetaccount/headlines";

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
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getStreetAccountHeadlines", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountHeadlinesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve StreetAccount headlines for given view
   * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
   * @param id view id of the view to return headlines for (required)
   * @param saHeadlinesRequestByView View body which needs to be sent with request (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse getStreetAccountHeadlinesByView(String id, SaHeadlinesRequestByView saHeadlinesRequestByView) throws ApiException {
    return getStreetAccountHeadlinesByViewWithHttpInfo(id, saHeadlinesRequestByView).getData();
  }

  /**
   * Retrieve StreetAccount headlines for given view
   * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
   * @param id view id of the view to return headlines for (required)
   * @param saHeadlinesRequestByView View body which needs to be sent with request (optional)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getStreetAccountHeadlinesByViewWithHttpInfo(String id, SaHeadlinesRequestByView saHeadlinesRequestByView) throws ApiException {
    Object localVarPostBody = saHeadlinesRequestByView;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStreetAccountHeadlinesByView");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/views/{id}/headlines"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    > apiResponse = apiClient.invokeAPI("HeadlinesApi.getStreetAccountHeadlinesByView", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountHeadlinesByViewResponseTypeMap, false);

    return apiResponse;

  }
}
