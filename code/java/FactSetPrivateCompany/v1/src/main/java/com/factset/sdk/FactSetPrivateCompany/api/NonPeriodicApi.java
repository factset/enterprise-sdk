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

import com.factset.sdk.FactSetPrivateCompany.models.ErrorResponse;
import com.factset.sdk.FactSetPrivateCompany.models.NonPeriodicRequest;
import com.factset.sdk.FactSetPrivateCompany.models.NonPeriodicResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NonPeriodicApi {
  private ApiClient apiClient;

  public NonPeriodicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NonPeriodicApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getNonPeriodicResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNonPeriodicResponseTypeMap.put(200, new GenericType<NonPeriodicResponse>(){});
    getNonPeriodicResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getNonPeriodicResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getNonPeriodicResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getNonPeriodicResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getNonPeriodicResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getNonPeriodicForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNonPeriodicForListResponseTypeMap.put(200, new GenericType<NonPeriodicResponse>(){});
    getNonPeriodicForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getNonPeriodicForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getNonPeriodicForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getNonPeriodicForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getNonPeriodicForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Private Company Reference Data.
   * Retrieves non-periodic reference information for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to  retrieve valid Private Company identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a  full list of valid metrics or data items.  
   * @param ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  (required)
   * @param metrics Requested list of Private Company Non-Periodic Metrics.  (required)
   * @return NonPeriodicResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Private Company reference data for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public NonPeriodicResponse getNonPeriodic(java.util.List<String> ids, java.util.List<String> metrics) throws ApiException {
    return getNonPeriodicWithHttpInfo(ids, metrics).getData();
  }

  /**
   * Returns Private Company Reference Data.
   * Retrieves non-periodic reference information for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to  retrieve valid Private Company identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a  full list of valid metrics or data items.  
   * @param ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  (required)
   * @param metrics Requested list of Private Company Non-Periodic Metrics.  (required)
   * @return ApiResponse&lt;NonPeriodicResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Private Company reference data for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NonPeriodicResponse> getNonPeriodicWithHttpInfo(java.util.List<String> ids, java.util.List<String> metrics) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNonPeriodic");
    }
    
    // verify the required parameter 'metrics' is set
    if (metrics == null) {
      throw new ApiException(400, "Missing the required parameter 'metrics' when calling getNonPeriodic");
    }
    
    // create path and map variables
    String localVarPath = "/non-periodic";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "metrics", metrics));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NonPeriodicResponse
      
    > apiResponse = apiClient.invokeAPI("NonPeriodicApi.getNonPeriodic", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNonPeriodicResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns Private Company Reference Data.
   * Retrieves non-periodic reference information for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param nonPeriodicRequest Request Body to request a list of Private Company non-periodic objects. (required)
   * @return NonPeriodicResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Private Company Reference data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public NonPeriodicResponse getNonPeriodicForList(NonPeriodicRequest nonPeriodicRequest) throws ApiException {
    return getNonPeriodicForListWithHttpInfo(nonPeriodicRequest).getData();
  }

  /**
   * Returns Private Company Reference Data.
   * Retrieves non-periodic reference information for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param nonPeriodicRequest Request Body to request a list of Private Company non-periodic objects. (required)
   * @return ApiResponse&lt;NonPeriodicResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Private Company Reference data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NonPeriodicResponse> getNonPeriodicForListWithHttpInfo(NonPeriodicRequest nonPeriodicRequest) throws ApiException {
    Object localVarPostBody = nonPeriodicRequest;
    
    // verify the required parameter 'nonPeriodicRequest' is set
    if (nonPeriodicRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'nonPeriodicRequest' when calling getNonPeriodicForList");
    }
    
    // create path and map variables
    String localVarPath = "/non-periodic";

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
        
        NonPeriodicResponse
      
    > apiResponse = apiClient.invokeAPI("NonPeriodicApi.getNonPeriodicForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNonPeriodicForListResponseTypeMap, false);

    return apiResponse;

  }
}
