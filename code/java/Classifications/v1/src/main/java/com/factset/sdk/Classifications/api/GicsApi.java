package com.factset.sdk.Classifications.api;

import com.factset.sdk.Classifications.ApiException;
import com.factset.sdk.Classifications.ApiClient;
import com.factset.sdk.Classifications.ApiResponse;
import com.factset.sdk.Classifications.Configuration;
import com.factset.sdk.Classifications.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Classifications.models.ErrorResponse;
import com.factset.sdk.Classifications.models.GicsRequest;
import com.factset.sdk.Classifications.models.GicsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GicsApi {
  private ApiClient apiClient;

  public GicsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GicsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getGicsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGicsResponseTypeMap.put(200, new GenericType<GicsResponse>(){});
    getGicsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGicsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGicsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGicsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGicsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> postGicsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postGicsResponseTypeMap.put(200, new GenericType<GicsResponse>(){});
    postGicsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postGicsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postGicsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postGicsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postGicsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Gets the GICS Direct Classifications
   * Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate Requested start date expressed in YYYY-MM-DD format. (optional)
   * @param endDate Requested End Date for Range expressed in YYYY-MM-DD format. (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  (optional, default to M)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. (optional, default to FIVEDAY)
   * @return GicsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> GICS Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GicsResponse getGics(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    return getGicsWithHttpInfo(ids, startDate, endDate, frequency, calendar).getData();
  }

  /**
   * Gets the GICS Direct Classifications
   * Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate Requested start date expressed in YYYY-MM-DD format. (optional)
   * @param endDate Requested End Date for Range expressed in YYYY-MM-DD format. (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  (optional, default to M)
   * @param calendar Calendar of data returned. SEVENDAY includes weekends. (optional, default to FIVEDAY)
   * @return ApiResponse&lt;GicsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> GICS Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GicsResponse> getGicsWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency, String calendar) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGics");
    }
    
    // create path and map variables
    String localVarPath = "/classifications/v1/gics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calendar", calendar));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        GicsResponse
      
    > apiResponse = apiClient.invokeAPI("GicsApi.getGics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGicsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the GICS classifications for the requested &#39;ids&#39; and date range.
   * Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
   * @param gicsRequest Requests GICS Classifications for the given identifier and date range. (required)
   * @return GicsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> GICS Direct Response Items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GicsResponse postGics(GicsRequest gicsRequest) throws ApiException {
    return postGicsWithHttpInfo(gicsRequest).getData();
  }

  /**
   * Returns the GICS classifications for the requested &#39;ids&#39; and date range.
   * Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
   * @param gicsRequest Requests GICS Classifications for the given identifier and date range. (required)
   * @return ApiResponse&lt;GicsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> GICS Direct Response Items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GicsResponse> postGicsWithHttpInfo(GicsRequest gicsRequest) throws ApiException {
    Object localVarPostBody = gicsRequest;
    
    // verify the required parameter 'gicsRequest' is set
    if (gicsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gicsRequest' when calling postGics");
    }
    
    // create path and map variables
    String localVarPath = "/classifications/v1/gics";

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
        
        GicsResponse
      
    > apiResponse = apiClient.invokeAPI("GicsApi.postGics", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postGicsResponseTypeMap, false);

    return apiResponse;

  }
}
