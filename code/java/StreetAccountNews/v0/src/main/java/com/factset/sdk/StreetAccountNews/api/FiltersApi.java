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
import com.factset.sdk.StreetAccountNews.models.FilterResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FiltersApi {
  private ApiClient apiClient;

  public FiltersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FiltersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getStreetAccountFiltersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersResponseTypeMap.put(200, new GenericType<FilterResponse>(){});
    getStreetAccountFiltersResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersResponseTypeMap.put(404, new GenericType<Error>(){});
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
   * Retrieve all StreetAccount filters
   * Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
   * @param structured Pass structured to generate a structured view of the available filters. (optional)
   * @param flattened Pass flattened to generate a structured view of the available filters. (optional)
   * @return FilterResponse
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
  public FilterResponse getStreetAccountFilters(Boolean structured, Boolean flattened) throws ApiException {
    return getStreetAccountFiltersWithHttpInfo(structured, flattened).getData();
  }

  /**
   * Retrieve all StreetAccount filters
   * Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
   * @param structured Pass structured to generate a structured view of the available filters. (optional)
   * @param flattened Pass flattened to generate a structured view of the available filters. (optional)
   * @return ApiResponse&lt;FilterResponse&gt;
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
  public ApiResponse<FilterResponse> getStreetAccountFiltersWithHttpInfo(Boolean structured, Boolean flattened) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/streetaccount/filters";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structured", structured));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flattened", flattened));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFilters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersResponseTypeMap, false);

    return apiResponse;

  }
}
