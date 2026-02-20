package com.factset.sdk.FactSetOwnership.api;

import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiResponse;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOwnership.models.ErrorResponse;
import com.factset.sdk.FactSetOwnership.models.SecurityHoldersRequest;
import com.factset.sdk.FactSetOwnership.models.SecurityHoldersResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SecurityHoldersApi {
  private ApiClient apiClient;

  public SecurityHoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecurityHoldersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSecurityHoldersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecurityHoldersResponseTypeMap.put(200, new GenericType<SecurityHoldersResponse>(){});
    getSecurityHoldersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSecurityHoldersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSecurityHoldersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSecurityHoldersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSecurityHoldersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postSecurityHoldersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSecurityHoldersResponseTypeMap.put(200, new GenericType<SecurityHoldersResponse>(){});
    postSecurityHoldersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postSecurityHoldersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postSecurityHoldersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postSecurityHoldersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postSecurityHoldersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get security ownership data for requested security identifers.
   * Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p&gt;. (required)
   * @param holderType Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  (optional, default to F)
   * @param topn Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional, default to ALL)
   * @param date Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return SecurityHoldersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Security Holders Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SecurityHoldersResponse getSecurityHolders(java.util.List<String> ids, String holderType, String topn, String date, String currency, String batch) throws ApiException {
    return getSecurityHoldersWithHttpInfo(ids, holderType, topn, date, currency, batch).getData();
  }

  /**
   * Get security ownership data for requested security identifers.
   * Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p&gt;. (required)
   * @param holderType Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  (optional, default to F)
   * @param topn Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional, default to ALL)
   * @param date Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return ApiResponse&lt;SecurityHoldersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Security Holders Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SecurityHoldersResponse> getSecurityHoldersWithHttpInfo(java.util.List<String> ids, String holderType, String topn, String date, String currency, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSecurityHolders");
    }
    
    // create path and map variables
    String localVarPath = "/security-holders";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holderType", holderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topn", topn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SecurityHoldersResponse
      
    > apiResponse = apiClient.invokeAPI("SecurityHoldersApi.getSecurityHolders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecurityHoldersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get security ownership data for a list of requested securities.
   * Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 
   * @param securityHoldersRequest Requesting Security Holders for a list of Fund Identifiers. (required)
   * @return SecurityHoldersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Security Holders Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SecurityHoldersResponse postSecurityHolders(SecurityHoldersRequest securityHoldersRequest) throws ApiException {
    return postSecurityHoldersWithHttpInfo(securityHoldersRequest).getData();
  }

  /**
   * Get security ownership data for a list of requested securities.
   * Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 
   * @param securityHoldersRequest Requesting Security Holders for a list of Fund Identifiers. (required)
   * @return ApiResponse&lt;SecurityHoldersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Security Holders Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SecurityHoldersResponse> postSecurityHoldersWithHttpInfo(SecurityHoldersRequest securityHoldersRequest) throws ApiException {
    Object localVarPostBody = securityHoldersRequest;
    
    // verify the required parameter 'securityHoldersRequest' is set
    if (securityHoldersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'securityHoldersRequest' when calling postSecurityHolders");
    }
    
    // create path and map variables
    String localVarPath = "/security-holders";

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
        
        SecurityHoldersResponse
      
    > apiResponse = apiClient.invokeAPI("SecurityHoldersApi.postSecurityHolders", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSecurityHoldersResponseTypeMap, false);

    return apiResponse;

  }
}
