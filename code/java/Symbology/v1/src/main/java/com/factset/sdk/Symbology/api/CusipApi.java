package com.factset.sdk.Symbology.api;

import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiResponse;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Symbology.models.CusipHistoryTranslationRequest;
import com.factset.sdk.Symbology.models.CusipHistoryTranslationResponse;
import com.factset.sdk.Symbology.models.CusipTranslationRequest;
import com.factset.sdk.Symbology.models.CusipTranslationResponse;
import com.factset.sdk.Symbology.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CusipApi {
  private ApiClient apiClient;

  public CusipApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CusipApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> batchCusipHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchCusipHistoryResponseTypeMap.put(200, new GenericType<CusipHistoryTranslationResponse>(){});
    batchCusipHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchCusipHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchCusipHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchCusipHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchCusipHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> batchTranslateCusipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchTranslateCusipsResponseTypeMap.put(200, new GenericType<CusipTranslationResponse>(){});
    batchTranslateCusipsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchTranslateCusipsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchTranslateCusipsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchTranslateCusipsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchTranslateCusipsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> cusipHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cusipHistoryResponseTypeMap.put(200, new GenericType<CusipHistoryTranslationResponse>(){});
    cusipHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    cusipHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    cusipHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    cusipHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    cusipHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> translateCusipResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    translateCusipResponseTypeMap.put(200, new GenericType<CusipTranslationResponse>(){});
    translateCusipResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    translateCusipResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    translateCusipResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    translateCusipResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    translateCusipResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve the full history of CUSIP changes for the requested ID(s).
   * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. 
   * @param cusipHistoryTranslationRequest Request Body for CUSIP History (required)
   * @return CusipHistoryTranslationResponse
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
  public CusipHistoryTranslationResponse batchCusipHistory(CusipHistoryTranslationRequest cusipHistoryTranslationRequest) throws ApiException {
    return batchCusipHistoryWithHttpInfo(cusipHistoryTranslationRequest).getData();
  }

  /**
   * Retrieve the full history of CUSIP changes for the requested ID(s).
   * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. 
   * @param cusipHistoryTranslationRequest Request Body for CUSIP History (required)
   * @return ApiResponse&lt;CusipHistoryTranslationResponse&gt;
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
  public ApiResponse<CusipHistoryTranslationResponse> batchCusipHistoryWithHttpInfo(CusipHistoryTranslationRequest cusipHistoryTranslationRequest) throws ApiException {
    Object localVarPostBody = cusipHistoryTranslationRequest;
    
    // verify the required parameter 'cusipHistoryTranslationRequest' is set
    if (cusipHistoryTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'cusipHistoryTranslationRequest' when calling batchCusipHistory");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/cusip-history";

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
        
        CusipHistoryTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("CusipApi.batchCusipHistory", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchCusipHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate market security symbols into CUSIP.
   * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;
   * @param cusipTranslationRequest Request Body for CUSIP Symbology Translation (required)
   * @return CusipTranslationResponse
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
  public CusipTranslationResponse batchTranslateCusips(CusipTranslationRequest cusipTranslationRequest) throws ApiException {
    return batchTranslateCusipsWithHttpInfo(cusipTranslationRequest).getData();
  }

  /**
   * Translate market security symbols into CUSIP.
   * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;
   * @param cusipTranslationRequest Request Body for CUSIP Symbology Translation (required)
   * @return ApiResponse&lt;CusipTranslationResponse&gt;
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
  public ApiResponse<CusipTranslationResponse> batchTranslateCusipsWithHttpInfo(CusipTranslationRequest cusipTranslationRequest) throws ApiException {
    Object localVarPostBody = cusipTranslationRequest;
    
    // verify the required parameter 'cusipTranslationRequest' is set
    if (cusipTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'cusipTranslationRequest' when calling batchTranslateCusips");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/cusip";

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
        
        CusipTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("CusipApi.batchTranslateCusips", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchTranslateCusipsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the full history of CUSIP changes for the requested ID(s).
   * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system.  &lt;p&gt;*GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/P&gt;
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @return CusipHistoryTranslationResponse
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
  public CusipHistoryTranslationResponse cusipHistory(java.util.List<String> ids) throws ApiException {
    return cusipHistoryWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve the full history of CUSIP changes for the requested ID(s).
   * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system.  &lt;p&gt;*GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/P&gt;
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @return ApiResponse&lt;CusipHistoryTranslationResponse&gt;
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
  public ApiResponse<CusipHistoryTranslationResponse> cusipHistoryWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling cusipHistory");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/cusip-history";

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
        
        CusipHistoryTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("CusipApi.cusipHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cusipHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate market security symbols into CUSIP.
   * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. &lt;p&gt;*GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/P&gt;
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @param asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. (optional)
   * @return CusipTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into CUSIPs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CusipTranslationResponse translateCusip(java.util.List<String> ids, String asOfDate) throws ApiException {
    return translateCusipWithHttpInfo(ids, asOfDate).getData();
  }

  /**
   * Translate market security symbols into CUSIP.
   * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. &lt;p&gt;*GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/P&gt;
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. (required)
   * @param asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. (optional)
   * @return ApiResponse&lt;CusipTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into CUSIPs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CusipTranslationResponse> translateCusipWithHttpInfo(java.util.List<String> ids, String asOfDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling translateCusip");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v1/cusip";

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
        
        CusipTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("CusipApi.translateCusip", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, translateCusipResponseTypeMap, false);

    return apiResponse;

  }
}
