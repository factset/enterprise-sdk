package com.factset.sdk.QuotesAPIforDigitalPortals.api;

import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject16;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject17;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject18;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject19;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject20;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject22;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20065;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20066;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20067;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20068;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20069;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20070;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20071;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20072;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20073;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20074;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20075;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20076;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20077;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20078;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20088;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20089;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20090;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationApi {
  private ApiClient apiClient;

  public NotationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getNotationCrossReferenceFactSetIdentifierGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationCrossReferenceFactSetIdentifierGetResponseTypeMap.put(200, new GenericType<InlineResponse20069>(){});
  }
  private static final Map<Integer, GenericType> getNotationCrossReferenceGetByFactSetMarketSymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationCrossReferenceGetByFactSetMarketSymbolResponseTypeMap.put(200, new GenericType<InlineResponse20066>(){});
  }
  private static final Map<Integer, GenericType> getNotationGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationGetResponseTypeMap.put(200, new GenericType<InlineResponse20064>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth1GetResponseTypeMap.put(200, new GenericType<InlineResponse20072>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth1ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth1ListResponseTypeMap.put(200, new GenericType<InlineResponse20073>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth3GetResponseTypeMap.put(200, new GenericType<InlineResponse20074>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth3ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth3ListResponseTypeMap.put(200, new GenericType<InlineResponse20075>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth6GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth6GetResponseTypeMap.put(200, new GenericType<InlineResponse20074>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresMonth6ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresMonth6ListResponseTypeMap.put(200, new GenericType<InlineResponse20075>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresWeek1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresWeek1GetResponseTypeMap.put(200, new GenericType<InlineResponse20072>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresWeek1ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresWeek1ListResponseTypeMap.put(200, new GenericType<InlineResponse20073>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear1GetResponseTypeMap.put(200, new GenericType<InlineResponse20072>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear1ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear1ListResponseTypeMap.put(200, new GenericType<InlineResponse20073>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear3GetResponseTypeMap.put(200, new GenericType<InlineResponse20074>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear3ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear3ListResponseTypeMap.put(200, new GenericType<InlineResponse20075>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear5GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear5GetResponseTypeMap.put(200, new GenericType<InlineResponse20074>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYear5ListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYear5ListResponseTypeMap.put(200, new GenericType<InlineResponse20075>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYearToDateGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYearToDateGetResponseTypeMap.put(200, new GenericType<InlineResponse20076>(){});
  }
  private static final Map<Integer, GenericType> getNotationKeyFiguresYearToDateListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationKeyFiguresYearToDateListResponseTypeMap.put(200, new GenericType<InlineResponse20077>(){});
  }
  private static final Map<Integer, GenericType> getNotationListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationListResponseTypeMap.put(200, new GenericType<InlineResponse20065>(){});
  }
  private static final Map<Integer, GenericType> getNotationSearchBasicResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationSearchBasicResponseTypeMap.put(200, new GenericType<InlineResponse20088>(){});
  }
  private static final Map<Integer, GenericType> getNotationSearchByTextRankedByVolumeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationSearchByTextRankedByVolumeResponseTypeMap.put(200, new GenericType<InlineResponse20090>(){});
  }
  private static final Map<Integer, GenericType> getNotationStatusGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotationStatusGetResponseTypeMap.put(200, new GenericType<InlineResponse20078>(){});
  }
  private static final Map<Integer, GenericType> postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierResponseTypeMap.put(200, new GenericType<InlineResponse20070>(){});
  }
  private static final Map<Integer, GenericType> postNotationCrossReferenceFactSetIdentifierListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationCrossReferenceFactSetIdentifierListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20071>(){});
  }
  private static final Map<Integer, GenericType> postNotationCrossReferenceListByISINResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationCrossReferenceListByISINResponseTypeMap.put(200, new GenericType<InlineResponse20067>(){});
  }
  private static final Map<Integer, GenericType> postNotationCrossReferenceListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationCrossReferenceListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20067>(){});
  }
  private static final Map<Integer, GenericType> postNotationCrossReferenceListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationCrossReferenceListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20068>(){});
  }
  private static final Map<Integer, GenericType> postNotationSearchByTextResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNotationSearchByTextResponseTypeMap.put(200, new GenericType<InlineResponse20089>(){});
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
   * Retrieve FactSet identifiers for a given notation.
   * &lt;p&gt;Retrieve FactSet identifiers for a given notation. Security and listing-level identifiers are always included, regional level identifiers are included, if available.
   * @param id Identifier of a notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20069
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20069 getNotationCrossReferenceFactSetIdentifierGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationCrossReferenceFactSetIdentifierGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Retrieve FactSet identifiers for a given notation.
   * &lt;p&gt;Retrieve FactSet identifiers for a given notation. Security and listing-level identifiers are always included, regional level identifiers are included, if available.
   * @param id Identifier of a notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20069&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20069> getNotationCrossReferenceFactSetIdentifierGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationCrossReferenceFactSetIdentifierGet");
    }
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/factSetIdentifier/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20069
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationCrossReferenceFactSetIdentifierGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationCrossReferenceFactSetIdentifierGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate a FactSet market symbol to a notation.
   * Translate a FactSet market symbol to a notation. This symbol is also known as TICKER_EXCHANGE.
   * @param factSetMarketSymbol Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE). (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20066
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20066 getNotationCrossReferenceGetByFactSetMarketSymbol(String factSetMarketSymbol, java.util.Set<String> attributes, String language) throws ApiException {
    return getNotationCrossReferenceGetByFactSetMarketSymbolWithHttpInfo(factSetMarketSymbol, attributes, language).getData();
  }

  /**
   * Translate a FactSet market symbol to a notation.
   * Translate a FactSet market symbol to a notation. This symbol is also known as TICKER_EXCHANGE.
   * @param factSetMarketSymbol Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE). (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20066&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20066> getNotationCrossReferenceGetByFactSetMarketSymbolWithHttpInfo(String factSetMarketSymbol, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'factSetMarketSymbol' is set
    if (factSetMarketSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'factSetMarketSymbol' when calling getNotationCrossReferenceGetByFactSetMarketSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/getByFactSetMarketSymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factSetMarketSymbol", factSetMarketSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20066
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationCrossReferenceGetByFactSetMarketSymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationCrossReferenceGetByFactSetMarketSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic data for a notation.
   * Basic data for a notation.
   * @param id Identifier of a notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20064
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20064 getNotationGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getNotationGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Basic data for a notation.
   * Basic data for a notation.
   * @param id Identifier of a notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20064&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20064> getNotationGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationGet");
    }
    
    // create path and map variables
    String localVarPath = "/notation/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20064
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one month.
   * End-of-day (EOD) key figures for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20072
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20072 getNotationKeyFiguresMonth1Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth1GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one month.
   * End-of-day (EOD) key figures for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20072&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20072> getNotationKeyFiguresMonth1GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresMonth1Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20072
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one month, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one month, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20073
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20073 getNotationKeyFiguresMonth1List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth1ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one month, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one month, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20073&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20073> getNotationKeyFiguresMonth1ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresMonth1List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/1/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20073
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth1List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth1ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of three months.
   * End-of-day (EOD) key figures for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20074
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20074 getNotationKeyFiguresMonth3Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth3GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of three months.
   * End-of-day (EOD) key figures for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20074&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20074> getNotationKeyFiguresMonth3GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresMonth3Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20074
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of three months, for a list of notations.
   * End-of-day (EOD) key figures for the time range of three months, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20075
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20075 getNotationKeyFiguresMonth3List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth3ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of three months, for a list of notations.
   * End-of-day (EOD) key figures for the time range of three months, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20075&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20075> getNotationKeyFiguresMonth3ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresMonth3List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/3/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20075
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth3List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth3ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of six months.
   * End-of-day (EOD) key figures for the time range of six months.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20074
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20074 getNotationKeyFiguresMonth6Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth6GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of six months.
   * End-of-day (EOD) key figures for the time range of six months.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20074&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20074> getNotationKeyFiguresMonth6GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresMonth6Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/6/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20074
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth6Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth6GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of six months, for a list of notations.
   * End-of-day (EOD) key figures for the time range of six months, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20075
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20075 getNotationKeyFiguresMonth6List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresMonth6ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of six months, for a list of notations.
   * End-of-day (EOD) key figures for the time range of six months, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20075&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20075> getNotationKeyFiguresMonth6ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresMonth6List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/month/6/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20075
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresMonth6List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresMonth6ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one week.
   * End-of-day (EOD) key figures for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20072
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20072 getNotationKeyFiguresWeek1Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresWeek1GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one week.
   * End-of-day (EOD) key figures for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20072&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20072> getNotationKeyFiguresWeek1GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresWeek1Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/week/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20072
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresWeek1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresWeek1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one week, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one week, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20073
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20073 getNotationKeyFiguresWeek1List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresWeek1ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one week, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one week, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20073&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20073> getNotationKeyFiguresWeek1ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresWeek1List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/week/1/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20073
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresWeek1List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresWeek1ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one year.
   * End-of-day (EOD) key figures for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20072
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20072 getNotationKeyFiguresYear1Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear1GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one year.
   * End-of-day (EOD) key figures for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20072&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20072> getNotationKeyFiguresYear1GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresYear1Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20072
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of one year, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one year, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20073
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20073 getNotationKeyFiguresYear1List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear1ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of one year, for a list of notations.
   * End-of-day (EOD) key figures for the time range of one year, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20073&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20073> getNotationKeyFiguresYear1ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresYear1List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/1/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20073
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear1List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear1ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of three years.
   * End-of-day (EOD) key figures for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20074
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20074 getNotationKeyFiguresYear3Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear3GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of three years.
   * End-of-day (EOD) key figures for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20074&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20074> getNotationKeyFiguresYear3GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresYear3Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20074
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of three years, for a list of notations.
   * End-of-day (EOD) key figures for the time range of three years, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20075
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20075 getNotationKeyFiguresYear3List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear3ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of three years, for a list of notations.
   * End-of-day (EOD) key figures for the time range of three years, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20075&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20075> getNotationKeyFiguresYear3ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresYear3List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/3/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20075
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear3List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear3ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of five years.
   * End-of-day (EOD) key figures for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20074
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20074 getNotationKeyFiguresYear5Get(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear5GetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of five years.
   * End-of-day (EOD) key figures for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20074&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20074> getNotationKeyFiguresYear5GetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresYear5Get");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/5/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20074
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear5Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear5GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range of five years, for a list of notations.
   * End-of-day (EOD) key figures for the time range of five years, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20075
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20075 getNotationKeyFiguresYear5List(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYear5ListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range of five years, for a list of notations.
   * End-of-day (EOD) key figures for the time range of five years, for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20075&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20075> getNotationKeyFiguresYear5ListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresYear5List");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/year/5/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20075
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYear5List", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYear5ListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range year-to-date (YTD)..
   * End-of-day (EOD) key figures for the time range year-to-date (YTD). The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent trading day of the current calendar year for which EOD prices are available..
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20076
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20076 getNotationKeyFiguresYearToDateGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYearToDateGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range year-to-date (YTD)..
   * End-of-day (EOD) key figures for the time range year-to-date (YTD). The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent trading day of the current calendar year for which EOD prices are available..
   * @param id Identifier of the notation. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20076&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20076> getNotationKeyFiguresYearToDateGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationKeyFiguresYearToDateGet");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/yearToDate/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse20076
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYearToDateGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYearToDateGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
   * End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations. The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent tradingday of the current calendar year for which EOD prices are available..
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20077
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20077 getNotationKeyFiguresYearToDateList(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    return getNotationKeyFiguresYearToDateListWithHttpInfo(ids, attributes).getData();
  }

  /**
   * End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
   * End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations. The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent tradingday of the current calendar year for which EOD prices are available..
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20077&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20077> getNotationKeyFiguresYearToDateListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationKeyFiguresYearToDateList");
    }
    
    // create path and map variables
    String localVarPath = "/notation/keyFigures/yearToDate/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse20077
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationKeyFiguresYearToDateList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationKeyFiguresYearToDateListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic data for a list of notations.
   * Basic data for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20065
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20065 getNotationList(java.util.Set<String> ids, java.util.Set<String> attributes, String language) throws ApiException {
    return getNotationListWithHttpInfo(ids, attributes, language).getData();
  }

  /**
   * Basic data for a list of notations.
   * Basic data for a list of notations.
   * @param ids List of notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20065&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20065> getNotationListWithHttpInfo(java.util.Set<String> ids, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNotationList");
    }
    
    // create path and map variables
    String localVarPath = "/notation/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20065
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic search for notations.
   * Search for a notation whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered. Better matching results appear in the response before less relevant matches. If the parameter popularity is set to true, the popularity of the notation is the primary sort criterion. Popularity is affected mostly by the request frequency of the notation.
   * @param searchValue Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. (required)
   * @param nsins A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional)
   * @param assetClass A parameter to limit the output to a particular asset class. (optional)
   * @param onlyActive If true, restricts the result to active notations. (optional, default to true)
   * @param popularity If true, the results are sorted by descending popularity. (optional, default to false)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20088
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20088 getNotationSearchBasic(String searchValue, java.util.Set<String> nsins, String assetClass, Boolean onlyActive, Boolean popularity, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getNotationSearchBasicWithHttpInfo(searchValue, nsins, assetClass, onlyActive, popularity, attributes, language, paginationOffset, paginationLimit).getData();
  }

  /**
   * Basic search for notations.
   * Search for a notation whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered. Better matching results appear in the response before less relevant matches. If the parameter popularity is set to true, the popularity of the notation is the primary sort criterion. Popularity is affected mostly by the request frequency of the notation.
   * @param searchValue Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. (required)
   * @param nsins A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional)
   * @param assetClass A parameter to limit the output to a particular asset class. (optional)
   * @param onlyActive If true, restricts the result to active notations. (optional, default to true)
   * @param popularity If true, the results are sorted by descending popularity. (optional, default to false)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20088&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20088> getNotationSearchBasicWithHttpInfo(String searchValue, java.util.Set<String> nsins, String assetClass, Boolean onlyActive, Boolean popularity, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'searchValue' is set
    if (searchValue == null) {
      throw new ApiException(400, "Missing the required parameter 'searchValue' when calling getNotationSearchBasic");
    }
    
    // create path and map variables
    String localVarPath = "/notation/search/basic";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchValue", searchValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "nsins", nsins));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetClass", assetClass));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyActive", onlyActive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "popularity", popularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20088
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationSearchBasic", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationSearchBasicResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic search for notations.
   * Search for notations whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered.
   * @param searchValue Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. (required)
   * @param idMarkets List of market identifiers. Limits the results to the given markets. For possible values, see endpoint &#x60;/basic/market/list&#x60;. (optional)
   * @param nsins A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional)
   * @param assetClass Limits the results to a particular asset class. (optional)
   * @param onlyActive If true, restricts the result to active notations. (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20090
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20090 getNotationSearchByTextRankedByVolume(String searchValue, java.util.Set<BigDecimal> idMarkets, java.util.Set<String> nsins, java.util.List<String> assetClass, Boolean onlyActive, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getNotationSearchByTextRankedByVolumeWithHttpInfo(searchValue, idMarkets, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit).getData();
  }

  /**
   * Basic search for notations.
   * Search for notations whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered.
   * @param searchValue Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. (required)
   * @param idMarkets List of market identifiers. Limits the results to the given markets. For possible values, see endpoint &#x60;/basic/market/list&#x60;. (optional)
   * @param nsins A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional)
   * @param assetClass Limits the results to a particular asset class. (optional)
   * @param onlyActive If true, restricts the result to active notations. (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20090&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20090> getNotationSearchByTextRankedByVolumeWithHttpInfo(String searchValue, java.util.Set<BigDecimal> idMarkets, java.util.Set<String> nsins, java.util.List<String> assetClass, Boolean onlyActive, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'searchValue' is set
    if (searchValue == null) {
      throw new ApiException(400, "Missing the required parameter 'searchValue' when calling getNotationSearchByTextRankedByVolume");
    }
    
    // create path and map variables
    String localVarPath = "/notation/searchByTextRankedByVolume";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchValue", searchValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idMarkets", idMarkets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "nsins", nsins));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "assetClass", assetClass));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyActive", onlyActive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20090
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationSearchByTextRankedByVolume", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationSearchByTextRankedByVolumeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Intraday trading status of a notation.
   * Intraday trading status of a notation.
   * @param id Identifier of a notation. (required)
   * @param quality Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20078
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20078 getNotationStatusGet(String id, String quality, java.util.Set<String> attributes) throws ApiException {
    return getNotationStatusGetWithHttpInfo(id, quality, attributes).getData();
  }

  /**
   * Intraday trading status of a notation.
   * Intraday trading status of a notation.
   * @param id Identifier of a notation. (required)
   * @param quality Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20078&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20078> getNotationStatusGetWithHttpInfo(String id, String quality, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotationStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/notation/status/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
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
        
        InlineResponse20078
      
    > apiResponse = apiClient.invokeAPI("NotationApi.getNotationStatusGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotationStatusGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve a list of notations for a given FactSet identifier.
   * &lt;p&gt;Retrieve a list of notations for a given FactSet identifier, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;
   * @param body  (required)
   * @return InlineResponse20070
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20070 postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(InlineObject19 body) throws ApiException {
    return postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierWithHttpInfo(body).getData();
  }

  /**
   * Retrieve a list of notations for a given FactSet identifier.
   * &lt;p&gt;Retrieve a list of notations for a given FactSet identifier, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse20070&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20070> postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierWithHttpInfo(InlineObject19 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier");
    }
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/factSetIdentifier/listByFactSetIdentifier";

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
        
        InlineResponse20070
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve a list of FactSet identifiers for a given instrument.
   * &lt;p&gt;Retrieve a list of FactSet identifiers for a given instrument, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;The result contains only notations that have at least one FactSet identifier (see &lt;big&gt;&lt;tt&gt;listing.permanentIdentifier&lt;/tt&gt;&lt;/big&gt;, &lt;big&gt;&lt;tt&gt;listing.tickerExchange&lt;/tt&gt;&lt;/big&gt;).&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;
   * @param body  (required)
   * @return InlineResponse20071
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20071 postNotationCrossReferenceFactSetIdentifierListByInstrument(InlineObject20 body) throws ApiException {
    return postNotationCrossReferenceFactSetIdentifierListByInstrumentWithHttpInfo(body).getData();
  }

  /**
   * Retrieve a list of FactSet identifiers for a given instrument.
   * &lt;p&gt;Retrieve a list of FactSet identifiers for a given instrument, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;The result contains only notations that have at least one FactSet identifier (see &lt;big&gt;&lt;tt&gt;listing.permanentIdentifier&lt;/tt&gt;&lt;/big&gt;, &lt;big&gt;&lt;tt&gt;listing.tickerExchange&lt;/tt&gt;&lt;/big&gt;).&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse20071&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20071> postNotationCrossReferenceFactSetIdentifierListByInstrumentWithHttpInfo(InlineObject20 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNotationCrossReferenceFactSetIdentifierListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/factSetIdentifier/listByInstrument";

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
        
        InlineResponse20071
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationCrossReferenceFactSetIdentifierListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationCrossReferenceFactSetIdentifierListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of entitled notations.
   * List of entitled notations.
   * @param body  (optional)
   * @return InlineResponse20067
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20067 postNotationCrossReferenceListByISIN(InlineObject17 body) throws ApiException {
    return postNotationCrossReferenceListByISINWithHttpInfo(body).getData();
  }

  /**
   * List of entitled notations.
   * List of entitled notations.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20067&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20067> postNotationCrossReferenceListByISINWithHttpInfo(InlineObject17 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/listByISIN";

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
        
        InlineResponse20067
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationCrossReferenceListByISIN", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationCrossReferenceListByISINResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of entitled notations.
   * List of entitled notations.
   * @param body  (optional)
   * @return InlineResponse20067
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20067 postNotationCrossReferenceListByInstrument(InlineObject16 body) throws ApiException {
    return postNotationCrossReferenceListByInstrumentWithHttpInfo(body).getData();
  }

  /**
   * List of entitled notations.
   * List of entitled notations.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20067&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20067> postNotationCrossReferenceListByInstrumentWithHttpInfo(InlineObject16 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/listByInstrument";

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
        
        InlineResponse20067
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationCrossReferenceListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationCrossReferenceListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of entitled notations.
   * List of entitled notations. Symbols are not globally unique; therefore, a given symbol interpreted in different markets might refer to different instruments.
   * @param body  (optional)
   * @return InlineResponse20068
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20068 postNotationCrossReferenceListBySymbol(InlineObject18 body) throws ApiException {
    return postNotationCrossReferenceListBySymbolWithHttpInfo(body).getData();
  }

  /**
   * List of entitled notations.
   * List of entitled notations. Symbols are not globally unique; therefore, a given symbol interpreted in different markets might refer to different instruments.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20068&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20068> postNotationCrossReferenceListBySymbolWithHttpInfo(InlineObject18 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/notation/crossReference/listBySymbol";

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
        
        InlineResponse20068
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationCrossReferenceListBySymbol", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationCrossReferenceListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Text-based search for notations.
   * Text-based search for notations in selected identifier and name attributes according to a tolerant full-text match algorithm. The results satisfy all selected filters; sorting by various attributes is possible. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.       The result is limited to 10000 notations. All identifiers used as parameters must be valid and entitled.
   * @param body  (required)
   * @return InlineResponse20089
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20089 postNotationSearchByText(InlineObject22 body) throws ApiException {
    return postNotationSearchByTextWithHttpInfo(body).getData();
  }

  /**
   * Text-based search for notations.
   * Text-based search for notations in selected identifier and name attributes according to a tolerant full-text match algorithm. The results satisfy all selected filters; sorting by various attributes is possible. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.       The result is limited to 10000 notations. All identifiers used as parameters must be valid and entitled.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse20089&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20089> postNotationSearchByTextWithHttpInfo(InlineObject22 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNotationSearchByText");
    }
    
    // create path and map variables
    String localVarPath = "/notation/searchByText";

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
        
        InlineResponse20089
      
    > apiResponse = apiClient.invokeAPI("NotationApi.postNotationSearchByText", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNotationSearchByTextResponseTypeMap, false);

    return apiResponse;

  }
}
