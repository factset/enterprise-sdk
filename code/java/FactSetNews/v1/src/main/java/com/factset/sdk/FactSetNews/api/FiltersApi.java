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
import com.factset.sdk.FactSetNews.models.FilterCategoriesResponse;
import com.factset.sdk.FactSetNews.models.FilterCountriesResponse;
import com.factset.sdk.FactSetNews.models.FilterRegionsResponse;
import com.factset.sdk.FactSetNews.models.FilterResponse;
import com.factset.sdk.FactSetNews.models.FilterSourcesResponse;
import com.factset.sdk.FactSetNews.models.FilterTopicResponse;
import com.factset.sdk.FactSetNews.models.FilterWatchlistsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FiltersApi {
  private ApiClient apiClient;

  public FiltersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FiltersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFiltersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFiltersResponseTypeMap.put(200, new GenericType<FilterResponse>(){});
    getFiltersResponseTypeMap.put(400, new GenericType<Error>(){});
    getFiltersResponseTypeMap.put(401, new GenericType<Error>(){});
    getFiltersResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersCategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersCategoriesResponseTypeMap.put(200, new GenericType<FilterCategoriesResponse>(){});
    getNewsFiltersCategoriesResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersCategoriesResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersCategoriesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersCountriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersCountriesResponseTypeMap.put(200, new GenericType<FilterCountriesResponse>(){});
    getNewsFiltersCountriesResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersCountriesResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersCountriesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersRegionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersRegionsResponseTypeMap.put(200, new GenericType<FilterRegionsResponse>(){});
    getNewsFiltersRegionsResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersRegionsResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersRegionsResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersSourcesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersSourcesResponseTypeMap.put(200, new GenericType<FilterSourcesResponse>(){});
    getNewsFiltersSourcesResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersSourcesResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersSourcesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersTopicsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersTopicsResponseTypeMap.put(200, new GenericType<FilterTopicResponse>(){});
    getNewsFiltersTopicsResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersTopicsResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersTopicsResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getNewsFiltersWatchlistsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsFiltersWatchlistsResponseTypeMap.put(200, new GenericType<FilterWatchlistsResponse>(){});
    getNewsFiltersWatchlistsResponseTypeMap.put(400, new GenericType<Error>(){});
    getNewsFiltersWatchlistsResponseTypeMap.put(401, new GenericType<Error>(){});
    getNewsFiltersWatchlistsResponseTypeMap.put(404, new GenericType<Error>(){});
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
   * Retrieve all FactSet News filters
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterResponse
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
  public FilterResponse getFilters(java.util.Set<String> attributes) throws ApiException {
    return getFiltersWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all FactSet News filters
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterResponse&gt;
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
  public ApiResponse<FilterResponse> getFiltersWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getFilters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFiltersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter categories
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns news categories </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterCategoriesResponse getNewsFiltersCategories(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersCategoriesWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter categories
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns news categories </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterCategoriesResponse> getNewsFiltersCategoriesWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/categories";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterCategoriesResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersCategoriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter countries
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter countries. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterCountriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News countries. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterCountriesResponse getNewsFiltersCountries(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersCountriesWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter countries
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter countries. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterCountriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News countries. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterCountriesResponse> getNewsFiltersCountriesWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/countries";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterCountriesResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersCountries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersCountriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter regions
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterRegionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News regions. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterRegionsResponse getNewsFiltersRegions(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersRegionsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter regions
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterRegionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News regions. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterRegionsResponse> getNewsFiltersRegionsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/regions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterRegionsResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersRegions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersRegionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter sources
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter sources. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterSourcesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News Sources. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterSourcesResponse getNewsFiltersSources(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersSourcesWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter sources
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter sources. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterSourcesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News Sources. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterSourcesResponse> getNewsFiltersSourcesWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/sources";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterSourcesResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersSourcesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter topics
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterTopicResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News topics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterTopicResponse getNewsFiltersTopics(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersTopicsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter topics
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterTopicResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News topics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterTopicResponse> getNewsFiltersTopicsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/topics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterTopicResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersTopics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersTopicsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all News filter watchlists
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterWatchlistsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News watchlists. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterWatchlistsResponse getNewsFiltersWatchlists(java.util.Set<String> attributes) throws ApiException {
    return getNewsFiltersWatchlistsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all News filter watchlists
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the &#x60;/headlines&#x60; and &#x60;/views/create&#x60; endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterWatchlistsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns News watchlists. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterWatchlistsResponse> getNewsFiltersWatchlistsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/watchlists";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FilterWatchlistsResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getNewsFiltersWatchlists", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsFiltersWatchlistsResponseTypeMap, false);

    return apiResponse;

  }
}
