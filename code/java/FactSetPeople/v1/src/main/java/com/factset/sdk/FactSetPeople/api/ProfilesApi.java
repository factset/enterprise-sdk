package com.factset.sdk.FactSetPeople.api;

import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiResponse;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPeople.models.ErrorResponse;
import com.factset.sdk.FactSetPeople.models.PeopleProfilesRequest;
import com.factset.sdk.FactSetPeople.models.PeopleProfilesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProfilesApi {
  private ApiClient apiClient;

  public ProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProfilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getPeopleProfilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleProfilesResponseTypeMap.put(200, new GenericType<PeopleProfilesResponse>(){});
    getPeopleProfilesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleProfilesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleProfilesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleProfilesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleProfilesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleProfilesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleProfilesForListResponseTypeMap.put(200, new GenericType<PeopleProfilesResponse>(){});
    getPeopleProfilesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleProfilesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleProfilesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleProfilesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleProfilesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Return information about the person with the specified entity ID.
   * Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
   * @param ids List of FactSet Person Entity identifier. (required)
   * @return PeopleProfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Profile Ojects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleProfilesResponse getPeopleProfiles(java.util.List<String> ids) throws ApiException {
    return getPeopleProfilesWithHttpInfo(ids).getData();
  }

  /**
   * Return information about the person with the specified entity ID.
   * Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
   * @param ids List of FactSet Person Entity identifier. (required)
   * @return ApiResponse&lt;PeopleProfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Profile Ojects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleProfilesResponse> getPeopleProfilesWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getPeopleProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/profiles";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeopleProfilesResponse
      
    > apiResponse = apiClient.invokeAPI("ProfilesApi.getPeopleProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleProfilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns profile information for a large list of people.
   * 
   * @param peopleProfilesRequest  (required)
   * @return PeopleProfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of People Profile Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleProfilesResponse getPeopleProfilesForList(PeopleProfilesRequest peopleProfilesRequest) throws ApiException {
    return getPeopleProfilesForListWithHttpInfo(peopleProfilesRequest).getData();
  }

  /**
   * Returns profile information for a large list of people.
   * 
   * @param peopleProfilesRequest  (required)
   * @return ApiResponse&lt;PeopleProfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of People Profile Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleProfilesResponse> getPeopleProfilesForListWithHttpInfo(PeopleProfilesRequest peopleProfilesRequest) throws ApiException {
    Object localVarPostBody = peopleProfilesRequest;
    
    // verify the required parameter 'peopleProfilesRequest' is set
    if (peopleProfilesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'peopleProfilesRequest' when calling getPeopleProfilesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/profiles";

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
        
        PeopleProfilesResponse
      
    > apiResponse = apiClient.invokeAPI("ProfilesApi.getPeopleProfilesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleProfilesForListResponseTypeMap, false);

    return apiResponse;

  }
}
