package com.factset.sdk.FactSetPeople.api;

import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiResponse;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPeople.models.ErrorResponse;
import com.factset.sdk.FactSetPeople.models.PeopleJobsRequest;
import com.factset.sdk.FactSetPeople.models.PeopleJobsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class JobHistoryApi {
  private ApiClient apiClient;

  public JobHistoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobHistoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getPeopleJobsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleJobsResponseTypeMap.put(200, new GenericType<PeopleJobsResponse>(){});
    getPeopleJobsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleJobsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleJobsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleJobsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleJobsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPeopleJobsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleJobsForListResponseTypeMap.put(200, new GenericType<PeopleJobsResponse>(){});
    getPeopleJobsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleJobsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleJobsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleJobsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleJobsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the Job history of the person.
   * Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 
   * @param ids List of FactSet Person Entity identifier. (required)
   * @param status Select only Jobs with a certain status primary, active, or inactive. (optional, default to ALL)
   * @param level Select the level of detail only main Jobs or include other Jobs at a company. (optional, default to DETAIL)
   * @param type Select only Jobs of a certain type board member or employee. (optional, default to ALL)
   * @return PeopleJobsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Job objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleJobsResponse getPeopleJobs(java.util.List<String> ids, String status, String level, String type) throws ApiException {
    return getPeopleJobsWithHttpInfo(ids, status, level, type).getData();
  }

  /**
   * Returns the Job history of the person.
   * Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 
   * @param ids List of FactSet Person Entity identifier. (required)
   * @param status Select only Jobs with a certain status primary, active, or inactive. (optional, default to ALL)
   * @param level Select the level of detail only main Jobs or include other Jobs at a company. (optional, default to DETAIL)
   * @param type Select only Jobs of a certain type board member or employee. (optional, default to ALL)
   * @return ApiResponse&lt;PeopleJobsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Job objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleJobsResponse> getPeopleJobsWithHttpInfo(java.util.List<String> ids, String status, String level, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getPeopleJobs");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/jobs";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeopleJobsResponse
      
    > apiResponse = apiClient.invokeAPI("JobHistoryApi.getPeopleJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleJobsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the Job history for the large list of people.
   * Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 
   * @param peopleJobsRequest  (required)
   * @return PeopleJobsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Job objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleJobsResponse getPeopleJobsForList(PeopleJobsRequest peopleJobsRequest) throws ApiException {
    return getPeopleJobsForListWithHttpInfo(peopleJobsRequest).getData();
  }

  /**
   * Returns the Job history for the large list of people.
   * Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 
   * @param peopleJobsRequest  (required)
   * @return ApiResponse&lt;PeopleJobsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Job objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleJobsResponse> getPeopleJobsForListWithHttpInfo(PeopleJobsRequest peopleJobsRequest) throws ApiException {
    Object localVarPostBody = peopleJobsRequest;
    
    // verify the required parameter 'peopleJobsRequest' is set
    if (peopleJobsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'peopleJobsRequest' when calling getPeopleJobsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/jobs";

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
        
        PeopleJobsResponse
      
    > apiResponse = apiClient.invokeAPI("JobHistoryApi.getPeopleJobsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleJobsForListResponseTypeMap, false);

    return apiResponse;

  }
}
