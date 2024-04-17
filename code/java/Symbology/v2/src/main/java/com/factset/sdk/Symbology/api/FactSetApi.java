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
import com.factset.sdk.Symbology.models.FactsetTranslationAdvancedRequest;
import com.factset.sdk.Symbology.models.FactsetTranslationAdvancedResponse;
import com.factset.sdk.Symbology.models.FactsetTranslationRequest;
import com.factset.sdk.Symbology.models.FactsetTranslationResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetApi {
  private ApiClient apiClient;

  public FactSetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> batchTranslateFactSetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchTranslateFactSetResponseTypeMap.put(200, new GenericType<FactsetTranslationResponse>(){});
    batchTranslateFactSetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> batchTranslateFactSetAdvancedResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchTranslateFactSetAdvancedResponseTypeMap.put(200, new GenericType<FactsetTranslationAdvancedResponse>(){});
    batchTranslateFactSetAdvancedResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetAdvancedResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetAdvancedResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetAdvancedResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchTranslateFactSetAdvancedResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> translateFactsetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    translateFactsetResponseTypeMap.put(200, new GenericType<FactsetTranslationResponse>(){});
    translateFactsetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    translateFactsetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    translateFactsetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    translateFactsetResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    translateFactsetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> translateFactsetAdvancedResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    translateFactsetAdvancedResponseTypeMap.put(200, new GenericType<FactsetTranslationAdvancedResponse>(){});
    translateFactsetAdvancedResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    translateFactsetAdvancedResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    translateFactsetAdvancedResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    translateFactsetAdvancedResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    translateFactsetAdvancedResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Translate market security symbols into FactSet Permanent Identifiers
   * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.
   * @param factsetTranslationRequest Request Body for FactSet Symbology Translation (required)
   * @return FactsetTranslationResponse
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
  public FactsetTranslationResponse batchTranslateFactSet(FactsetTranslationRequest factsetTranslationRequest) throws ApiException {
    return batchTranslateFactSetWithHttpInfo(factsetTranslationRequest).getData();
  }

  /**
   * Translate market security symbols into FactSet Permanent Identifiers
   * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.
   * @param factsetTranslationRequest Request Body for FactSet Symbology Translation (required)
   * @return ApiResponse&lt;FactsetTranslationResponse&gt;
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
  public ApiResponse<FactsetTranslationResponse> batchTranslateFactSetWithHttpInfo(FactsetTranslationRequest factsetTranslationRequest) throws ApiException {
    Object localVarPostBody = factsetTranslationRequest;
    
    // verify the required parameter 'factsetTranslationRequest' is set
    if (factsetTranslationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'factsetTranslationRequest' when calling batchTranslateFactSet");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/factset";

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
        
        FactsetTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetApi.batchTranslateFactSet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchTranslateFactSetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate advanced symbol types into FactSet Permanent Identifiers
   * FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)    Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
   * @param factsetTranslationAdvancedRequest Request Body for FactSet Symbology Translation (required)
   * @return FactsetTranslationAdvancedResponse
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
  public FactsetTranslationAdvancedResponse batchTranslateFactSetAdvanced(FactsetTranslationAdvancedRequest factsetTranslationAdvancedRequest) throws ApiException {
    return batchTranslateFactSetAdvancedWithHttpInfo(factsetTranslationAdvancedRequest).getData();
  }

  /**
   * Translate advanced symbol types into FactSet Permanent Identifiers
   * FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)    Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
   * @param factsetTranslationAdvancedRequest Request Body for FactSet Symbology Translation (required)
   * @return ApiResponse&lt;FactsetTranslationAdvancedResponse&gt;
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
  public ApiResponse<FactsetTranslationAdvancedResponse> batchTranslateFactSetAdvancedWithHttpInfo(FactsetTranslationAdvancedRequest factsetTranslationAdvancedRequest) throws ApiException {
    Object localVarPostBody = factsetTranslationAdvancedRequest;
    
    // verify the required parameter 'factsetTranslationAdvancedRequest' is set
    if (factsetTranslationAdvancedRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'factsetTranslationAdvancedRequest' when calling batchTranslateFactSetAdvanced");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/factset-advanced";

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
        
        FactsetTranslationAdvancedResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetApi.batchTranslateFactSetAdvanced", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchTranslateFactSetAdvancedResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate market security symbols into FactSet Permanent Identifiers.
   * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return FactsetTranslationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into FactSet Permanent Identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FactsetTranslationResponse translateFactset(java.util.List<String> ids) throws ApiException {
    return translateFactsetWithHttpInfo(ids).getData();
  }

  /**
   * Translate market security symbols into FactSet Permanent Identifiers.
   * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 
   * @param ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @return ApiResponse&lt;FactsetTranslationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of Market IDs translated into FactSet Permanent Identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FactsetTranslationResponse> translateFactsetWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling translateFactset");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/factset";

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
        
        FactsetTranslationResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetApi.translateFactset", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, translateFactsetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate advanced symbol types into FactSet Permanent Identifiers
   * FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)  Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
   * @param ids Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param symbolType Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun &amp; Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody&#39;s Ratings Identifier|Entity (-E)|   |SPR|S&amp;P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|Security (-S)|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  (optional, default to )
   * @return FactsetTranslationAdvancedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of ids translated into FactSet Permanent Identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FactsetTranslationAdvancedResponse translateFactsetAdvanced(java.util.List<String> ids, String symbolType) throws ApiException {
    return translateFactsetAdvancedWithHttpInfo(ids, symbolType).getData();
  }

  /**
   * Translate advanced symbol types into FactSet Permanent Identifiers
   * FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)  Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
   * @param ids Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param symbolType Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun &amp; Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody&#39;s Ratings Identifier|Entity (-E)|   |SPR|S&amp;P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|Security (-S)|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  (optional, default to )
   * @return ApiResponse&lt;FactsetTranslationAdvancedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response of ids translated into FactSet Permanent Identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FactsetTranslationAdvancedResponse> translateFactsetAdvancedWithHttpInfo(java.util.List<String> ids, String symbolType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling translateFactsetAdvanced");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v2/factset-advanced";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbolType", symbolType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FactsetTranslationAdvancedResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetApi.translateFactsetAdvanced", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, translateFactsetAdvancedResponseTypeMap, false);

    return apiResponse;

  }
}
