package com.factset.sdk.FactSetTermsandConditions.api;

import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiResponse;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTermsandConditions.models.ErrorResponse;
import com.factset.sdk.FactSetTermsandConditions.models.LeadUnderwritersResponse;
import com.factset.sdk.FactSetTermsandConditions.models.TermsAndConditionsScalarRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnderwritersApi {
  private ApiClient apiClient;

  public UnderwritersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UnderwritersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLeadUnderwritersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLeadUnderwritersResponseTypeMap.put(200, new GenericType<LeadUnderwritersResponse>(){});
    getLeadUnderwritersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getLeadUnderwritersForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLeadUnderwritersForListResponseTypeMap.put(200, new GenericType<LeadUnderwritersResponse>(){});
    getLeadUnderwritersForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getLeadUnderwritersForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Return Lead Underwriters for a Fixed Income security.
   * Returns Lead Underwriters for the Fixed Income security. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return LeadUnderwritersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Lead Underwriters Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LeadUnderwritersResponse getLeadUnderwriters(java.util.List<String> ids) throws ApiException {
    return getLeadUnderwritersWithHttpInfo(ids).getData();
  }

  /**
   * Return Lead Underwriters for a Fixed Income security.
   * Returns Lead Underwriters for the Fixed Income security. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ApiResponse&lt;LeadUnderwritersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Lead Underwriters Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LeadUnderwritersResponse> getLeadUnderwritersWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getLeadUnderwriters");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/lead-underwriters";

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
        
        LeadUnderwritersResponse
      
    > apiResponse = apiClient.invokeAPI("UnderwritersApi.getLeadUnderwriters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLeadUnderwritersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Lead Underwriters for a list of Fixed Income securities.
   * Returns Lead Underwriters for a list of Fixed Income securities. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Lead Underwriters. (required)
   * @return LeadUnderwritersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Lead Underwriters Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LeadUnderwritersResponse getLeadUnderwritersForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    return getLeadUnderwritersForListWithHttpInfo(termsAndConditionsScalarRequest).getData();
  }

  /**
   * Return Lead Underwriters for a list of Fixed Income securities.
   * Returns Lead Underwriters for a list of Fixed Income securities. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Lead Underwriters. (required)
   * @return ApiResponse&lt;LeadUnderwritersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Lead Underwriters Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LeadUnderwritersResponse> getLeadUnderwritersForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    Object localVarPostBody = termsAndConditionsScalarRequest;
    
    // verify the required parameter 'termsAndConditionsScalarRequest' is set
    if (termsAndConditionsScalarRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'termsAndConditionsScalarRequest' when calling getLeadUnderwritersForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/lead-underwriters";

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
        
        LeadUnderwritersResponse
      
    > apiResponse = apiClient.invokeAPI("UnderwritersApi.getLeadUnderwritersForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLeadUnderwritersForListResponseTypeMap, false);

    return apiResponse;

  }
}
