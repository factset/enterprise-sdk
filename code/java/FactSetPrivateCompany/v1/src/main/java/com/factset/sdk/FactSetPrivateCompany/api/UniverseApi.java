package com.factset.sdk.FactSetPrivateCompany.api;

import com.factset.sdk.FactSetPrivateCompany.ApiException;
import com.factset.sdk.FactSetPrivateCompany.ApiClient;
import com.factset.sdk.FactSetPrivateCompany.ApiResponse;
import com.factset.sdk.FactSetPrivateCompany.Configuration;
import com.factset.sdk.FactSetPrivateCompany.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrivateCompany.models.EntityMatchRequest;
import com.factset.sdk.FactSetPrivateCompany.models.EntityMatchesResponse;
import com.factset.sdk.FactSetPrivateCompany.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UniverseApi {
  private ApiClient apiClient;

  public UniverseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UniverseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getUniverseResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUniverseResponseTypeMap.put(200, new GenericType<EntityMatchesResponse>(){});
    getUniverseResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUniverseResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUniverseResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUniverseResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUniverseResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUniverseForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUniverseForListResponseTypeMap.put(200, new GenericType<EntityMatchesResponse>(){});
    getUniverseForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Entity Candidates and Matches for a single name and attributes.
   * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  The &#x60;matchFlag&#x60; indicates whether the &#x60;entityId&#x60; is a FactSet match based on the input name and country. When &#x60;true&#x60;, the FactSet &#x60;entityId&#x60; was confidently matched to the input name and country. When &#x60;false&#x60;, the FactSet &#x60;entityId&#x60; could not be confidently matched to the input name and country.  **Max of 1 Name permitted in a single GET request.** Use the POST method to fetch up to 25 names. 
   * @param name Name of Entity to match.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  (required)
   * @param country ISO2 country code corresponding to the entity name is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @return EntityMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityMatchesResponse getUniverse(String name, String country) throws ApiException {
    return getUniverseWithHttpInfo(name, country).getData();
  }

  /**
   * Returns Entity Candidates and Matches for a single name and attributes.
   * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  The &#x60;matchFlag&#x60; indicates whether the &#x60;entityId&#x60; is a FactSet match based on the input name and country. When &#x60;true&#x60;, the FactSet &#x60;entityId&#x60; was confidently matched to the input name and country. When &#x60;false&#x60;, the FactSet &#x60;entityId&#x60; could not be confidently matched to the input name and country.  **Max of 1 Name permitted in a single GET request.** Use the POST method to fetch up to 25 names. 
   * @param name Name of Entity to match.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  (required)
   * @param country ISO2 country code corresponding to the entity name is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @return ApiResponse&lt;EntityMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityMatchesResponse> getUniverseWithHttpInfo(String name, String country) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getUniverse");
    }
    
    // create path and map variables
    String localVarPath = "/universe";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("UniverseApi.getUniverse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUniverseResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns Entity Candidates and Matches for a requested list of up to 25 names and attributes.
   * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
   * @param entityMatchRequest A request to match an Entity. (required)
   * @return EntityMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityMatchesResponse getUniverseForList(EntityMatchRequest entityMatchRequest) throws ApiException {
    return getUniverseForListWithHttpInfo(entityMatchRequest).getData();
  }

  /**
   * Returns Entity Candidates and Matches for a requested list of up to 25 names and attributes.
   * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
   * @param entityMatchRequest A request to match an Entity. (required)
   * @return ApiResponse&lt;EntityMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityMatchesResponse> getUniverseForListWithHttpInfo(EntityMatchRequest entityMatchRequest) throws ApiException {
    Object localVarPostBody = entityMatchRequest;
    
    // verify the required parameter 'entityMatchRequest' is set
    if (entityMatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityMatchRequest' when calling getUniverseForList");
    }
    
    // create path and map variables
    String localVarPath = "/universe";

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
        
        EntityMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("UniverseApi.getUniverseForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUniverseForListResponseTypeMap, false);

    return apiResponse;

  }
}
