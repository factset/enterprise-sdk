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
import com.factset.sdk.FactSetPrivateCompany.models.FinancialsRequest;
import com.factset.sdk.FactSetPrivateCompany.models.FinancialsResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FinancialsApi {
  private ApiClient apiClient;

  public FinancialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FinancialsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFinancialsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialsResponseTypeMap.put(200, new GenericType<FinancialsResponse>(){});
    getFinancialsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFinancialsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFinancialsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFinancialsForListResponseTypeMap.put(200, new GenericType<FinancialsResponse>(){});
    getFinancialsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFinancialsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFinancialsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFinancialsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFinancialsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Private Company Financial Data.
   * Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  (required)
   * @param metrics Requested list of Private Company Financial items  (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @return FinancialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Private Company Financials for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialsResponse getFinancials(java.util.List<String> ids, java.util.List<String> metrics, LocalDate startDate, LocalDate endDate) throws ApiException {
    return getFinancialsWithHttpInfo(ids, metrics, startDate, endDate).getData();
  }

  /**
   * Returns Private Company Financial Data.
   * Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  (required)
   * @param metrics Requested list of Private Company Financial items  (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @return ApiResponse&lt;FinancialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Private Company Financials for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialsResponse> getFinancialsWithHttpInfo(java.util.List<String> ids, java.util.List<String> metrics, LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFinancials");
    }
    
    // verify the required parameter 'metrics' is set
    if (metrics == null) {
      throw new ApiException(400, "Missing the required parameter 'metrics' when calling getFinancials");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getFinancials");
    }
    
    // create path and map variables
    String localVarPath = "/financials";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FinancialsResponse
      
    > apiResponse = apiClient.invokeAPI("FinancialsApi.getFinancials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns Private Company Financial Data.
   * Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param financialsRequest Request Body to request a list of Private Company financials objects. (required)
   * @return FinancialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Private Company financials data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FinancialsResponse getFinancialsForList(FinancialsRequest financialsRequest) throws ApiException {
    return getFinancialsForListWithHttpInfo(financialsRequest).getData();
  }

  /**
   * Returns Private Company Financial Data.
   * Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  
   * @param financialsRequest Request Body to request a list of Private Company financials objects. (required)
   * @return ApiResponse&lt;FinancialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Private Company financials data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FinancialsResponse> getFinancialsForListWithHttpInfo(FinancialsRequest financialsRequest) throws ApiException {
    Object localVarPostBody = financialsRequest;
    
    // verify the required parameter 'financialsRequest' is set
    if (financialsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'financialsRequest' when calling getFinancialsForList");
    }
    
    // create path and map variables
    String localVarPath = "/financials";

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
        
        FinancialsResponse
      
    > apiResponse = apiClient.invokeAPI("FinancialsApi.getFinancialsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFinancialsForListResponseTypeMap, false);

    return apiResponse;

  }
}
