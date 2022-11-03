package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleMatchRequest;
import com.factset.sdk.FactSetConcordance.models.PeopleMatchesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleMatchApi {
  private ApiClient apiClient;

  public PeopleMatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PeopleMatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getPeopleMatchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleMatchResponseTypeMap.put(200, new GenericType<PeopleMatchesResponse>(){});
    getPeopleMatchResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleMatchResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleMatchResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleMatchResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleMatchResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleMatchForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleMatchForListResponseTypeMap.put(200, new GenericType<PeopleMatchesResponse>(){});
    getPeopleMatchForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleMatchForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleMatchForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleMatchForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleMatchForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
   * Finds the best people candidates matching the given name. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to 25 names. Otherwise, use the \&quot;People Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 
   * @param entity Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. (required)
   * @param personName Name of Person to match. (optional)
   * @param salutation Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param firstName First name of person. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param middleName Middle name of person.This parameter should not be provided when the person name is provided as the input. (optional)
   * @param lastName Last name of person. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param suffix Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. (optional)
   * @return PeopleMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing People Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleMatchesResponse getPeopleMatch(String entity, String personName, String salutation, String firstName, String middleName, String lastName, String suffix) throws ApiException {
    return getPeopleMatchWithHttpInfo(entity, personName, salutation, firstName, middleName, lastName, suffix).getData();
  }

  /**
   * Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
   * Finds the best people candidates matching the given name. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to 25 names. Otherwise, use the \&quot;People Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 
   * @param entity Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. (required)
   * @param personName Name of Person to match. (optional)
   * @param salutation Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param firstName First name of person. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param middleName Middle name of person.This parameter should not be provided when the person name is provided as the input. (optional)
   * @param lastName Last name of person. This parameter should not be provided when the person name is provided as the input. (optional)
   * @param suffix Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. (optional)
   * @return ApiResponse&lt;PeopleMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing People Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleMatchesResponse> getPeopleMatchWithHttpInfo(String entity, String personName, String salutation, String firstName, String middleName, String lastName, String suffix) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entity' is set
    if (entity == null) {
      throw new ApiException(400, "Missing the required parameter 'entity' when calling getPeopleMatch");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-match";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "personName", personName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "salutation", salutation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstName", firstName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "middleName", middleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastName", lastName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "suffix", suffix));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity", entity));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeopleMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMatchApi.getPeopleMatch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleMatchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Find potential people matches given a person&#39;s name.
   * Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. 
   * @param peopleMatchRequest A request to People match. (required)
   * @return PeopleMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing People Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleMatchesResponse getPeopleMatchForList(PeopleMatchRequest peopleMatchRequest) throws ApiException {
    return getPeopleMatchForListWithHttpInfo(peopleMatchRequest).getData();
  }

  /**
   * Find potential people matches given a person&#39;s name.
   * Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. 
   * @param peopleMatchRequest A request to People match. (required)
   * @return ApiResponse&lt;PeopleMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing People Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleMatchesResponse> getPeopleMatchForListWithHttpInfo(PeopleMatchRequest peopleMatchRequest) throws ApiException {
    Object localVarPostBody = peopleMatchRequest;
    
    // verify the required parameter 'peopleMatchRequest' is set
    if (peopleMatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'peopleMatchRequest' when calling getPeopleMatchForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-match";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeopleMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMatchApi.getPeopleMatchForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleMatchForListResponseTypeMap, false);

    return apiResponse;

  }
}
