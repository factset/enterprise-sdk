package com.factset.sdk.Symbology.api;

import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiResponse;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Symbology.models.ErrorResponse;
import com.factset.sdk.Symbology.models.SedolHistoryTranslationRequest;
import com.factset.sdk.Symbology.models.SedolHistoryTranslationResponse;
import com.factset.sdk.Symbology.models.SedolTranslationRequest;
import com.factset.sdk.Symbology.models.SedolTranslationResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SedolApi {
  private ApiClient apiClient;

  public SedolApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SedolApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> batchSedolHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchSedolHistoryResponseTypeMap.put(200, new GenericType<SedolHistoryTranslationResponse>(){});
    batchSedolHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchSedolHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchSedolHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchSedolHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchSedolHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> batchTranslateSedolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchTranslateSedolResponseTypeMap.put(200, new GenericType<SedolTranslationResponse>(){});
    batchTranslateSedolResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchTranslateSedolResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchTranslateSedolResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchTranslateSedolResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchTranslateSedolResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> sedolHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    sedolHistoryResponseTypeMap.put(200, new GenericType<SedolHistoryTranslationResponse>(){});
    sedolHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    sedolHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    sedolHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    sedolHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    sedolHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> translateSedolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    translateSedolResponseTypeMap.put(200, new GenericType<SedolTranslationResponse>(){});
    translateSedolResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    translateSedolResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    translateSedolResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    translateSedolResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    translateSedolResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve the full history or as of a specific date of SEDOL changes for a requested ID.
   * Return the full history of SEDOL changes for a given market security or FactSet Permanent Id. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param sedolHistoryTranslationRequest Response Body for SEDOL History (required)
   * @return SedolHistoryTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SedolHistoryTranslationResponse batchSedolHistory(SedolHistoryTranslationRequest sedolHistoryTranslationRequest) throws ApiException {
    return batchSedolHistoryWithHttpInfo(sedolHistoryTranslationRequest).getData();
  }

  /**
   * Retrieve the full history or as of a specific date of SEDOL changes for a requested ID.
   * Return the full history of SEDOL changes for a given market security or FactSet Permanent Id. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param sedolHistoryTranslationRequest Response Body for SEDOL History (required)
   * @return ApiResponse&lt;SedolHistoryTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SedolHistoryTranslationResponse> batchSedolHistoryWithHttpInfo(SedolHistoryTranslationRequest sedolHistoryTranslationRequest) throws ApiException {
    Object localVarPostBody = sedolHistoryTranslationRequest;
    
    // verify the required parameter 'sedolHistoryTranslationRequest' is set
    if (sedolHistoryTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sedolHistoryTranslationRequest' when calling batchSedolHistory");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/sedol-history";

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
        
        SedolHistoryTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("SedolApi.batchSedolHistory", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchSedolHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate market security symbols into SEDOL. - Current Only
   * Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param sedolTranslationRequest Request Body for SEDOL Symbology Translation (required)
   * @return SedolTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol Translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SedolTranslationResponse batchTranslateSedol(SedolTranslationRequest sedolTranslationRequest) throws ApiException {
    return batchTranslateSedolWithHttpInfo(sedolTranslationRequest).getData();
  }

  /**
   * Translate market security symbols into SEDOL. - Current Only
   * Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param sedolTranslationRequest Request Body for SEDOL Symbology Translation (required)
   * @return ApiResponse&lt;SedolTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol Translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SedolTranslationResponse> batchTranslateSedolWithHttpInfo(SedolTranslationRequest sedolTranslationRequest) throws ApiException {
    Object localVarPostBody = sedolTranslationRequest;
    
    // verify the required parameter 'sedolTranslationRequest' is set
    if (sedolTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sedolTranslationRequest' when calling batchTranslateSedol");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/sedol";

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
        
        SedolTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("SedolApi.batchTranslateSedol", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchTranslateSedolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the full history or as of a specific date of SEDOL changes for the requested ID(s).
   * Returns the full history of SEDOL changes for a given security or as of a requested date. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. (optional)
   * @return SedolHistoryTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SedolHistoryTranslationResponse sedolHistory(java.util.List<String> ids, String asOfDate) throws ApiException {
    return sedolHistoryWithHttpInfo(ids, asOfDate).getData();
  }

  /**
   * Retrieve the full history or as of a specific date of SEDOL changes for the requested ID(s).
   * Returns the full history of SEDOL changes for a given security or as of a requested date. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. (optional)
   * @return ApiResponse&lt;SedolHistoryTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SedolHistoryTranslationResponse> sedolHistoryWithHttpInfo(java.util.List<String> ids, String asOfDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling sedolHistory");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/sedol-history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asOfDate", asOfDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SedolHistoryTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("SedolApi.sedolHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, sedolHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate market security symbols into SEDOL. - Current Only
   * Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return SedolTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into SEDOL. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SedolTranslationResponse translateSedol(java.util.List<String> ids) throws ApiException {
    return translateSedolWithHttpInfo(ids).getData();
  }

  /**
   * Translate market security symbols into SEDOL. - Current Only
   * Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return ApiResponse&lt;SedolTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into SEDOL. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SedolTranslationResponse> translateSedolWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling translateSedol");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/sedol";

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
        
        SedolTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("SedolApi.translateSedol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, translateSedolResponseTypeMap, false);

    return apiResponse;

  }
}
