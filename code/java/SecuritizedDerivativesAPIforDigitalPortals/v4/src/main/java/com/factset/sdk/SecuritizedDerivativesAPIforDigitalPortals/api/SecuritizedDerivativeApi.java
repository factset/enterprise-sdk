package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api;

import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeIssuerSearchRequest;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationRankingIntradayListRequest;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequest;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SecuritizedDerivativeApi {
  private ApiClient apiClient;

  public SecuritizedDerivativeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecuritizedDerivativeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSecuritizedDerivativeBarrierTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecuritizedDerivativeBarrierTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }

  private static final Map<Integer, GenericType> getSecuritizedDerivativeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecuritizedDerivativeGetResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }

  private static final Map<Integer, GenericType> getSecuritizedDerivativeKeyFiguresNotationGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecuritizedDerivativeKeyFiguresNotationGetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }

  private static final Map<Integer, GenericType> getSecuritizedDerivativeUnderlyingListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSecuritizedDerivativeUnderlyingListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }

  private static final Map<Integer, GenericType> postSecuritizedDerivativeIssuerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSecuritizedDerivativeIssuerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }

  private static final Map<Integer, GenericType> postSecuritizedDerivativeNotationRankingIntradayListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSecuritizedDerivativeNotationRankingIntradayListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }

  private static final Map<Integer, GenericType> postSecuritizedDerivativeNotationScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSecuritizedDerivativeNotationScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }

  private static final Map<Integer, GenericType> postSecuritizedDerivativeNotationScreenerValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSecuritizedDerivativeNotationScreenerValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
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
   * List of barrier types.
   * List of barrier types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getSecuritizedDerivativeBarrierTypeList(java.util.Set<String> attributes) throws ApiException {
    return getSecuritizedDerivativeBarrierTypeListWithHttpInfo(attributes).getData();
  }

  /**
   * List of barrier types.
   * List of barrier types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getSecuritizedDerivativeBarrierTypeListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/barrier/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.getSecuritizedDerivativeBarrierTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecuritizedDerivativeBarrierTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fundamental data for a single securitized derivative.
   * Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getSecuritizedDerivativeGet(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getSecuritizedDerivativeGetWithHttpInfo(identifier, identifierType, attributes, metaLanguage).getData();
  }

  /**
   * Fundamental data for a single securitized derivative.
   * Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getSecuritizedDerivativeGetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSecuritizedDerivativeGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getSecuritizedDerivativeGet");
    }
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.getSecuritizedDerivativeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecuritizedDerivativeGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Notation-based key figures of a securitized derivative.
   * Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute &#x60;underlyings.coverRatio&#x60; in endpoint &#x60;/securitized-derivative/underlying/list&#x60;.  Various barrier types (e.g. strike, knock in) - see endpoint &#x60;/securitized-derivative/barrier/type/list&#x60;.  Exercise right - see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Issue price - see attribute &#x60;issue.price&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Ask price - see attribute &#x60;prices.ask&#x60;.  Bid price - see attribute &#x60;prices.bid&#x60;.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getSecuritizedDerivativeKeyFiguresNotationGet(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getSecuritizedDerivativeKeyFiguresNotationGetWithHttpInfo(identifier, identifierType, attributes, metaLanguage).getData();
  }

  /**
   * Notation-based key figures of a securitized derivative.
   * Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute &#x60;underlyings.coverRatio&#x60; in endpoint &#x60;/securitized-derivative/underlying/list&#x60;.  Various barrier types (e.g. strike, knock in) - see endpoint &#x60;/securitized-derivative/barrier/type/list&#x60;.  Exercise right - see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Issue price - see attribute &#x60;issue.price&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Ask price - see attribute &#x60;prices.ask&#x60;.  Bid price - see attribute &#x60;prices.bid&#x60;.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getSecuritizedDerivativeKeyFiguresNotationGetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSecuritizedDerivativeKeyFiguresNotationGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getSecuritizedDerivativeKeyFiguresNotationGet");
    }
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/key-figures/notation/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.getSecuritizedDerivativeKeyFiguresNotationGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecuritizedDerivativeKeyFiguresNotationGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of underlyings with barrier and cash flow information.
   * Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 getSecuritizedDerivativeUnderlyingList(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getSecuritizedDerivativeUnderlyingListWithHttpInfo(identifier, identifierType, attributes, metaLanguage).getData();
  }

  /**
   * List of underlyings with barrier and cash flow information.
   * Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> getSecuritizedDerivativeUnderlyingListWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSecuritizedDerivativeUnderlyingList");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getSecuritizedDerivativeUnderlyingList");
    }
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/underlying/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.getSecuritizedDerivativeUnderlyingList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSecuritizedDerivativeUnderlyingListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for issuers of securitized derivatives.
   * Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param postSecuritizedDerivativeIssuerSearchRequest Request Body (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postSecuritizedDerivativeIssuerSearch(PostSecuritizedDerivativeIssuerSearchRequest postSecuritizedDerivativeIssuerSearchRequest) throws ApiException {
    return postSecuritizedDerivativeIssuerSearchWithHttpInfo(postSecuritizedDerivativeIssuerSearchRequest).getData();
  }

  /**
   * Search for issuers of securitized derivatives.
   * Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param postSecuritizedDerivativeIssuerSearchRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postSecuritizedDerivativeIssuerSearchWithHttpInfo(PostSecuritizedDerivativeIssuerSearchRequest postSecuritizedDerivativeIssuerSearchRequest) throws ApiException {
    Object localVarPostBody = postSecuritizedDerivativeIssuerSearchRequest;
    
    // verify the required parameter 'postSecuritizedDerivativeIssuerSearchRequest' is set
    if (postSecuritizedDerivativeIssuerSearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postSecuritizedDerivativeIssuerSearchRequest' when calling postSecuritizedDerivativeIssuerSearch");
    }
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/issuer/search";

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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.postSecuritizedDerivativeIssuerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSecuritizedDerivativeIssuerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Ranking of securitized derivatives&#39; notations using intraday figures.
   * Ranking of securitized derivatives&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute: - absolute and relative performance (see the response attributes &#x60;trade.performance.absolute&#x60; and &#x60;trade.performance.relative&#x60;) - the notation with the most recent trade price is used - number trades, trading value and trading volume (see the response attributes &#x60;accumulated.numberTrades&#x60;, &#x60;accumulated.tradingVolume&#x60; and &#x60;accumulated.tradingValue&#x60;) - the notation with highest (lowest) value is used  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters &#x60;valueUnit&#x60; and/or &#x60;currency&#x60; have not been specified.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param postSecuritizedDerivativeNotationRankingIntradayListRequest Request Body (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postSecuritizedDerivativeNotationRankingIntradayList(PostSecuritizedDerivativeNotationRankingIntradayListRequest postSecuritizedDerivativeNotationRankingIntradayListRequest) throws ApiException {
    return postSecuritizedDerivativeNotationRankingIntradayListWithHttpInfo(postSecuritizedDerivativeNotationRankingIntradayListRequest).getData();
  }

  /**
   * Ranking of securitized derivatives&#39; notations using intraday figures.
   * Ranking of securitized derivatives&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute: - absolute and relative performance (see the response attributes &#x60;trade.performance.absolute&#x60; and &#x60;trade.performance.relative&#x60;) - the notation with the most recent trade price is used - number trades, trading value and trading volume (see the response attributes &#x60;accumulated.numberTrades&#x60;, &#x60;accumulated.tradingVolume&#x60; and &#x60;accumulated.tradingValue&#x60;) - the notation with highest (lowest) value is used  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters &#x60;valueUnit&#x60; and/or &#x60;currency&#x60; have not been specified.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param postSecuritizedDerivativeNotationRankingIntradayListRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postSecuritizedDerivativeNotationRankingIntradayListWithHttpInfo(PostSecuritizedDerivativeNotationRankingIntradayListRequest postSecuritizedDerivativeNotationRankingIntradayListRequest) throws ApiException {
    Object localVarPostBody = postSecuritizedDerivativeNotationRankingIntradayListRequest;
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/notation/ranking/intraday/list";

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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.postSecuritizedDerivativeNotationRankingIntradayList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSecuritizedDerivativeNotationRankingIntradayListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
   * Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.   The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.
   * @param postSecuritizedDerivativeNotationScreenerSearchRequest Request Body (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postSecuritizedDerivativeNotationScreenerSearch(PostSecuritizedDerivativeNotationScreenerSearchRequest postSecuritizedDerivativeNotationScreenerSearchRequest) throws ApiException {
    return postSecuritizedDerivativeNotationScreenerSearchWithHttpInfo(postSecuritizedDerivativeNotationScreenerSearchRequest).getData();
  }

  /**
   * Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
   * Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.   The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.
   * @param postSecuritizedDerivativeNotationScreenerSearchRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postSecuritizedDerivativeNotationScreenerSearchWithHttpInfo(PostSecuritizedDerivativeNotationScreenerSearchRequest postSecuritizedDerivativeNotationScreenerSearchRequest) throws ApiException {
    Object localVarPostBody = postSecuritizedDerivativeNotationScreenerSearchRequest;
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/notation/screener/search";

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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.postSecuritizedDerivativeNotationScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSecuritizedDerivativeNotationScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivatives/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/securitized-derivatives/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.
   * @param postSecuritizedDerivativeNotationScreenerValueRangesGetRequest Request Body (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 postSecuritizedDerivativeNotationScreenerValueRangesGet(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest postSecuritizedDerivativeNotationScreenerValueRangesGetRequest) throws ApiException {
    return postSecuritizedDerivativeNotationScreenerValueRangesGetWithHttpInfo(postSecuritizedDerivativeNotationScreenerValueRangesGetRequest).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivatives/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/securitized-derivatives/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.
   * @param postSecuritizedDerivativeNotationScreenerValueRangesGetRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> postSecuritizedDerivativeNotationScreenerValueRangesGetWithHttpInfo(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest postSecuritizedDerivativeNotationScreenerValueRangesGetRequest) throws ApiException {
    Object localVarPostBody = postSecuritizedDerivativeNotationScreenerValueRangesGetRequest;
    
    // create path and map variables
    String localVarPath = "/securitized-derivative/notation/screener/value-ranges/get";

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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("SecuritizedDerivativeApi.postSecuritizedDerivativeNotationScreenerValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSecuritizedDerivativeNotationScreenerValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
}
