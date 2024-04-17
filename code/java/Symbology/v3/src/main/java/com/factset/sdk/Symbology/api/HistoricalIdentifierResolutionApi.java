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

import com.factset.sdk.Symbology.models.ErrorResponseHistorical;
import com.factset.sdk.Symbology.models.IdentifierResolutionHistoricalRequest;
import com.factset.sdk.Symbology.models.IdentifierResolutionHistoricalResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class HistoricalIdentifierResolutionApi {
  private ApiClient apiClient;

  public HistoricalIdentifierResolutionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HistoricalIdentifierResolutionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> batchHistoricalIdentifierResolutionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    batchHistoricalIdentifierResolutionResponseTypeMap.put(200, new GenericType<IdentifierResolutionHistoricalResponse>(){});
    batchHistoricalIdentifierResolutionResponseTypeMap.put(400, new GenericType<ErrorResponseHistorical>(){});
    batchHistoricalIdentifierResolutionResponseTypeMap.put(401, new GenericType<ErrorResponseHistorical>(){});
    batchHistoricalIdentifierResolutionResponseTypeMap.put(403, new GenericType<ErrorResponseHistorical>(){});
    batchHistoricalIdentifierResolutionResponseTypeMap.put(415, new GenericType<ErrorResponseHistorical>(){});
    batchHistoricalIdentifierResolutionResponseTypeMap.put(500, new GenericType<ErrorResponseHistorical>(){});
  }

  private static final Map<Integer, GenericType> historicalIdentifierResolutionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    historicalIdentifierResolutionResponseTypeMap.put(200, new GenericType<IdentifierResolutionHistoricalResponse>(){});
    historicalIdentifierResolutionResponseTypeMap.put(400, new GenericType<ErrorResponseHistorical>(){});
    historicalIdentifierResolutionResponseTypeMap.put(401, new GenericType<ErrorResponseHistorical>(){});
    historicalIdentifierResolutionResponseTypeMap.put(403, new GenericType<ErrorResponseHistorical>(){});
    historicalIdentifierResolutionResponseTypeMap.put(415, new GenericType<ErrorResponseHistorical>(){});
    historicalIdentifierResolutionResponseTypeMap.put(500, new GenericType<ErrorResponseHistorical>(){});
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
   * Returns the specified historical output identifiers for the given input identifier.
   * This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The &#x60;asOfDate&#x60; field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody&#39;s Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&amp;P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\&quot;Wertpapierkennnummer\&quot;) (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY &amp; IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param identifierResolutionHistoricalRequest Request Body for Historical Identifier Resolution. (required)
   * @return IdentifierResolutionHistoricalResponse
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
  public IdentifierResolutionHistoricalResponse batchHistoricalIdentifierResolution(IdentifierResolutionHistoricalRequest identifierResolutionHistoricalRequest) throws ApiException {
    return batchHistoricalIdentifierResolutionWithHttpInfo(identifierResolutionHistoricalRequest).getData();
  }

  /**
   * Returns the specified historical output identifiers for the given input identifier.
   * This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The &#x60;asOfDate&#x60; field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody&#39;s Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&amp;P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\&quot;Wertpapierkennnummer\&quot;) (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY &amp; IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param identifierResolutionHistoricalRequest Request Body for Historical Identifier Resolution. (required)
   * @return ApiResponse&lt;IdentifierResolutionHistoricalResponse&gt;
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
  public ApiResponse<IdentifierResolutionHistoricalResponse> batchHistoricalIdentifierResolutionWithHttpInfo(IdentifierResolutionHistoricalRequest identifierResolutionHistoricalRequest) throws ApiException {
    Object localVarPostBody = identifierResolutionHistoricalRequest;
    
    // verify the required parameter 'identifierResolutionHistoricalRequest' is set
    if (identifierResolutionHistoricalRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierResolutionHistoricalRequest' when calling batchHistoricalIdentifierResolution");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v3/historical-identifier-resolution";

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
        
        IdentifierResolutionHistoricalResponse
      
    > apiResponse = apiClient.invokeAPI("HistoricalIdentifierResolutionApi.batchHistoricalIdentifierResolution", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, batchHistoricalIdentifierResolutionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the specified historical output identifiers for the given input identifier.
   * This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The &#x60;asOfDate&#x60; field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody&#39;s Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&amp;P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\&quot;Wertpapierkennnummer\&quot;) (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY &amp; IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)   **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param ids Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param inputSymbolType The type of symbol being inputted. Only one type of symbol is accepted with each request.  (required)
   * @param outputSymbolTypes The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. (required)
   * @param asOfDate As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  (optional)
   * @return IdentifierResolutionHistoricalResponse
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
  public IdentifierResolutionHistoricalResponse historicalIdentifierResolution(java.util.List<String> ids, String inputSymbolType, java.util.List<String> outputSymbolTypes, LocalDate asOfDate) throws ApiException {
    return historicalIdentifierResolutionWithHttpInfo(ids, inputSymbolType, outputSymbolTypes, asOfDate).getData();
  }

  /**
   * Returns the specified historical output identifiers for the given input identifier.
   * This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The &#x60;asOfDate&#x60; field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody&#39;s Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&amp;P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\&quot;Wertpapierkennnummer\&quot;) (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY &amp; IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)   **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param ids Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param inputSymbolType The type of symbol being inputted. Only one type of symbol is accepted with each request.  (required)
   * @param outputSymbolTypes The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. (required)
   * @param asOfDate As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  (optional)
   * @return ApiResponse&lt;IdentifierResolutionHistoricalResponse&gt;
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
  public ApiResponse<IdentifierResolutionHistoricalResponse> historicalIdentifierResolutionWithHttpInfo(java.util.List<String> ids, String inputSymbolType, java.util.List<String> outputSymbolTypes, LocalDate asOfDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling historicalIdentifierResolution");
    }
    
    // verify the required parameter 'inputSymbolType' is set
    if (inputSymbolType == null) {
      throw new ApiException(400, "Missing the required parameter 'inputSymbolType' when calling historicalIdentifierResolution");
    }
    
    // verify the required parameter 'outputSymbolTypes' is set
    if (outputSymbolTypes == null) {
      throw new ApiException(400, "Missing the required parameter 'outputSymbolTypes' when calling historicalIdentifierResolution");
    }
    
    // create path and map variables
    String localVarPath = "/symbology/v3/historical-identifier-resolution";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inputSymbolType", inputSymbolType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "outputSymbolTypes", outputSymbolTypes));
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
        
        IdentifierResolutionHistoricalResponse
      
    > apiResponse = apiClient.invokeAPI("HistoricalIdentifierResolutionApi.historicalIdentifierResolution", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, historicalIdentifierResolutionResponseTypeMap, false);

    return apiResponse;

  }
}
