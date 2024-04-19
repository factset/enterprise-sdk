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
import com.factset.sdk.StreetAccountNews.models.FilterCategoriesResponse;
import com.factset.sdk.StreetAccountNews.models.FilterRegionsResponse;
import com.factset.sdk.StreetAccountNews.models.FilterResponse;
import com.factset.sdk.StreetAccountNews.models.FilterSectorsResponse;
import com.factset.sdk.StreetAccountNews.models.FilterTopicResponse;
import com.factset.sdk.StreetAccountNews.models.FilterWatchlistsResponse;

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

  private static final Map<Integer, GenericType> getStreetAccountFiltersCategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersCategoriesResponseTypeMap.put(200, new GenericType<FilterCategoriesResponse>(){});
    getStreetAccountFiltersCategoriesResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersCategoriesResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersCategoriesResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountFiltersRegionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersRegionsResponseTypeMap.put(200, new GenericType<FilterRegionsResponse>(){});
    getStreetAccountFiltersRegionsResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersRegionsResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersRegionsResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountFiltersSectorsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersSectorsResponseTypeMap.put(200, new GenericType<FilterSectorsResponse>(){});
    getStreetAccountFiltersSectorsResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersSectorsResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersSectorsResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountFiltersTopicsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersTopicsResponseTypeMap.put(200, new GenericType<FilterTopicResponse>(){});
    getStreetAccountFiltersTopicsResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersTopicsResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersTopicsResponseTypeMap.put(404, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountFiltersWatchlistsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountFiltersWatchlistsResponseTypeMap.put(200, new GenericType<FilterWatchlistsResponse>(){});
    getStreetAccountFiltersWatchlistsResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountFiltersWatchlistsResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountFiltersWatchlistsResponseTypeMap.put(404, new GenericType<Error>(){});
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
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns all filters. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterResponse getStreetAccountFilters(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filters
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns all filters. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterResponse> getStreetAccountFiltersWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFilters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all StreetAccount filter categories
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount categories </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterCategoriesResponse getStreetAccountFiltersCategories(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersCategoriesWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filter categories
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount categories </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterCategoriesResponse> getStreetAccountFiltersCategoriesWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFiltersCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersCategoriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all StreetAccount filter regions
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterRegionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount regions. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterRegionsResponse getStreetAccountFiltersRegions(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersRegionsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filter regions
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterRegionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount regions. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterRegionsResponse> getStreetAccountFiltersRegionsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFiltersRegions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersRegionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all StreetAccount filter sectors
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterSectorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount sectors. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterSectorsResponse getStreetAccountFiltersSectors(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersSectorsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filter sectors
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterSectorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount sectors. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterSectorsResponse> getStreetAccountFiltersSectorsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/filters/sectors";

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
        
        FilterSectorsResponse
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFiltersSectors", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersSectorsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all StreetAccount filter topics
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterTopicResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount topics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterTopicResponse getStreetAccountFiltersTopics(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersTopicsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filter topics
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterTopicResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount topics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterTopicResponse> getStreetAccountFiltersTopicsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFiltersTopics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersTopicsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all StreetAccount filter watchlists
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return FilterWatchlistsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount watchlists. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public FilterWatchlistsResponse getStreetAccountFiltersWatchlists(java.util.Set<String> attributes) throws ApiException {
    return getStreetAccountFiltersWatchlistsWithHttpInfo(attributes).getData();
  }

  /**
   * Retrieve all StreetAccount filter watchlists
   * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
   * @param attributes Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional)
   * @return ApiResponse&lt;FilterWatchlistsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns StreetAccount watchlists. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for invalid parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FilterWatchlistsResponse> getStreetAccountFiltersWatchlistsWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("FiltersApi.getStreetAccountFiltersWatchlists", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountFiltersWatchlistsResponseTypeMap, false);

    return apiResponse;

  }
}
