package com.factset.sdk.EventsandTranscripts.api;

import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiResponse;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.EventsandTranscripts.models.CategoriesResponse;
import com.factset.sdk.EventsandTranscripts.models.Error;
import com.factset.sdk.EventsandTranscripts.models.TimeZonesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetaApi {
  private ApiClient apiClient;

  public MetaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTimezoneResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimezoneResponseTypeMap.put(200, new GenericType<TimeZonesResponse>(){});
    getTimezoneResponseTypeMap.put(400, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(401, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(403, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getcategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getcategoriesResponseTypeMap.put(200, new GenericType<CategoriesResponse>(){});
    getcategoriesResponseTypeMap.put(400, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(401, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(403, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the time zones.
   * Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.
   * @return TimeZonesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of all available time zones. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TimeZonesResponse getTimezone() throws ApiException {
    return getTimezoneWithHttpInfo().getData();
  }

  /**
   * Returns the time zones.
   * Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.
   * @return ApiResponse&lt;TimeZonesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of all available time zones. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TimeZonesResponse> getTimezoneWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/meta/time-zones";

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
        
        TimeZonesResponse
      
    > apiResponse = apiClient.invokeAPI("MetaApi.getTimezone", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimezoneResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;which are defined as country, industry, and subject codes. The data is returned as a list.
   * @return CategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> list of all available categories. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CategoriesResponse getcategories() throws ApiException {
    return getcategoriesWithHttpInfo().getData();
  }

  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;which are defined as country, industry, and subject codes. The data is returned as a list.
   * @return ApiResponse&lt;CategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> list of all available categories. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CategoriesResponse> getcategoriesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/meta/categories";

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
        
        CategoriesResponse
      
    > apiResponse = apiClient.invokeAPI("MetaApi.getcategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getcategoriesResponseTypeMap, false);

    return apiResponse;

  }
}
