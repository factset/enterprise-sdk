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

import com.factset.sdk.EventsandTranscripts.models.CompanyEventRequest;
import com.factset.sdk.EventsandTranscripts.models.CompanyEventResponse;
import com.factset.sdk.EventsandTranscripts.models.Error;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalendarEventsApi {
  private ApiClient apiClient;

  public CalendarEventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CalendarEventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCompanyEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyEventResponseTypeMap.put(200, new GenericType<CompanyEventResponse>(){});
    getCompanyEventResponseTypeMap.put(400, new GenericType<Error>(){});
    getCompanyEventResponseTypeMap.put(401, new GenericType<Error>(){});
    getCompanyEventResponseTypeMap.put(404, new GenericType<Error>(){});
    getCompanyEventResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Retrieve Company Event data
   * This endpoint returns all company events with filters from the request.
   * @param companyEventRequest Company Event request body (required)
   * @return CompanyEventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The company events based on provided filters from the request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CompanyEventResponse getCompanyEvent(CompanyEventRequest companyEventRequest) throws ApiException {
    return getCompanyEventWithHttpInfo(companyEventRequest).getData();
  }

  /**
   * Retrieve Company Event data
   * This endpoint returns all company events with filters from the request.
   * @param companyEventRequest Company Event request body (required)
   * @return ApiResponse&lt;CompanyEventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The company events based on provided filters from the request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyEventResponse> getCompanyEventWithHttpInfo(CompanyEventRequest companyEventRequest) throws ApiException {
    Object localVarPostBody = companyEventRequest;
    
    // verify the required parameter 'companyEventRequest' is set
    if (companyEventRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyEventRequest' when calling getCompanyEvent");
    }
    
    // create path and map variables
    String localVarPath = "/calendar/events";

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
        
        CompanyEventResponse
      
    > apiResponse = apiClient.invokeAPI("CalendarEventsApi.getCompanyEvent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyEventResponseTypeMap, false);

    return apiResponse;

  }
}
