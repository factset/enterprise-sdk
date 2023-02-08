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

import com.factset.sdk.Symbology.models.ErrorResponse;
import com.factset.sdk.Symbology.models.IdentifierResolutionRequest;
import com.factset.sdk.Symbology.models.IdentifierResolutionResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentifierResolutionApi {
  private ApiClient apiClient;

  public IdentifierResolutionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentifierResolutionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> batchIdentifierResolutionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchIdentifierResolutionResponseTypeMap.put(200, new GenericType<IdentifierResolutionResponse>(){});
    batchIdentifierResolutionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    batchIdentifierResolutionResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    batchIdentifierResolutionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    batchIdentifierResolutionResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    batchIdentifierResolutionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> identifierResolutionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    identifierResolutionResponseTypeMap.put(200, new GenericType<IdentifierResolutionResponse>(){});
    identifierResolutionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    identifierResolutionResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    identifierResolutionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    identifierResolutionResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    identifierResolutionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the specified output identifiers for the specified input identifier.
   * The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param identifierResolutionRequest Request Body for Identifier Resolution. (required)
   * @return IdentifierResolutionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdentifierResolutionResponse batchIdentifierResolution(IdentifierResolutionRequest identifierResolutionRequest) throws ApiException {
    return batchIdentifierResolutionWithHttpInfo(identifierResolutionRequest).getData();
  }

  /**
   * Returns the specified output identifiers for the specified input identifier.
   * The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param identifierResolutionRequest Request Body for Identifier Resolution. (required)
   * @return ApiResponse&lt;IdentifierResolutionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdentifierResolutionResponse> batchIdentifierResolutionWithHttpInfo(IdentifierResolutionRequest identifierResolutionRequest) throws ApiException {
    Object localVarPostBody = identifierResolutionRequest;
    
    // verify the required parameter 'identifierResolutionRequest' is set
    if (identifierResolutionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierResolutionRequest' when calling batchIdentifierResolution");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v3/identifier-resolution";

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
        
        IdentifierResolutionResponse
      
    > apiResponse = apiClient.invokeAPI("IdentifierResolutionApi.batchIdentifierResolution", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchIdentifierResolutionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the specified output identifiers for the specified input identifier.
   * The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param ids Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param inputSymbolType The type of symbol being inputted. Only one type of symbol is accepted with each request.  (required)
   * @param outputSymbolTypes The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. (required)
   * @return IdentifierResolutionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdentifierResolutionResponse identifierResolution(java.util.List<String> ids, String inputSymbolType, java.util.List<String> outputSymbolTypes) throws ApiException {
    return identifierResolutionWithHttpInfo(ids, inputSymbolType, outputSymbolTypes).getData();
  }

  /**
   * Returns the specified output identifiers for the specified input identifier.
   * The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param ids Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param inputSymbolType The type of symbol being inputted. Only one type of symbol is accepted with each request.  (required)
   * @param outputSymbolTypes The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. (required)
   * @return ApiResponse&lt;IdentifierResolutionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Symbol translation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdentifierResolutionResponse> identifierResolutionWithHttpInfo(java.util.List<String> ids, String inputSymbolType, java.util.List<String> outputSymbolTypes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling identifierResolution");
    }
    
    // verify the required parameter 'inputSymbolType' is set
    if (inputSymbolType == null) {
      throw new ApiException(400, "Missing the required parameter 'inputSymbolType' when calling identifierResolution");
    }
    
    // verify the required parameter 'outputSymbolTypes' is set
    if (outputSymbolTypes == null) {
      throw new ApiException(400, "Missing the required parameter 'outputSymbolTypes' when calling identifierResolution");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v3/identifier-resolution";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inputSymbolType", inputSymbolType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "outputSymbolTypes", outputSymbolTypes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IdentifierResolutionResponse
      
    > apiResponse = apiClient.invokeAPI("IdentifierResolutionApi.identifierResolution", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, identifierResolutionResponseTypeMap, false);

    return apiResponse;

  }
}
