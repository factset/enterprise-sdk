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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject7;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineObject8;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20010;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20011;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20012;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20013;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20014;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20015;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20016;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20017;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20018;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20019;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20020;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20021;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20022;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20023;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20024;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20025;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20026;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20027;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20028;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20029;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20030;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse2009;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BasicApi {
  private ApiClient apiClient;

  public BasicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BasicApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getBasicAssetClassListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicAssetClassListResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> getBasicBenchmarkTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicBenchmarkTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getBasicFrequencyTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicFrequencyTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> getBasicLanguageGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicLanguageGetResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> getBasicLanguageGetByCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicLanguageGetByCodeResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> getBasicLanguageListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicLanguageListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> getBasicMarketGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicMarketGetResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> getBasicMarketGroupListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicMarketGroupListResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
  }
  private static final Map<Integer, GenericType> getBasicMarketTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicMarketTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20011>(){});
  }
  private static final Map<Integer, GenericType> getBasicMediaKindListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicMediaKindListResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionContinentGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionContinentGetResponseTypeMap.put(200, new GenericType<InlineResponse20017>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionContinentListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionContinentListResponseTypeMap.put(200, new GenericType<InlineResponse20018>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionCountryGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionCountryGetResponseTypeMap.put(200, new GenericType<InlineResponse20019>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionCountryGetByCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionCountryGetByCodeResponseTypeMap.put(200, new GenericType<InlineResponse20020>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionCountryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionCountryListResponseTypeMap.put(200, new GenericType<InlineResponse20021>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionGetResponseTypeMap.put(200, new GenericType<InlineResponse20015>(){});
  }
  private static final Map<Integer, GenericType> getBasicRegionListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicRegionListResponseTypeMap.put(200, new GenericType<InlineResponse20016>(){});
  }
  private static final Map<Integer, GenericType> getBasicTimezoneGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicTimezoneGetResponseTypeMap.put(200, new GenericType<InlineResponse20022>(){});
  }
  private static final Map<Integer, GenericType> getBasicTimezoneGetByNameResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicTimezoneGetByNameResponseTypeMap.put(200, new GenericType<InlineResponse20022>(){});
  }
  private static final Map<Integer, GenericType> getBasicValueUnitAlternativeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicValueUnitAlternativeListResponseTypeMap.put(200, new GenericType<InlineResponse20026>(){});
  }
  private static final Map<Integer, GenericType> getBasicValueUnitCurrencyFractionalGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicValueUnitCurrencyFractionalGetResponseTypeMap.put(200, new GenericType<InlineResponse20028>(){});
  }
  private static final Map<Integer, GenericType> getBasicValueUnitCurrencyFractionalListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicValueUnitCurrencyFractionalListResponseTypeMap.put(200, new GenericType<InlineResponse20029>(){});
  }
  private static final Map<Integer, GenericType> getBasicValueUnitGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBasicValueUnitGetResponseTypeMap.put(200, new GenericType<InlineResponse20024>(){});
  }
  private static final Map<Integer, GenericType> postBasicBackgroundTextTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicBackgroundTextTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postBasicDeliveryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicDeliveryListResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postBasicMarketListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicMarketListResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> postBasicMediaTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicMediaTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20013>(){});
  }
  private static final Map<Integer, GenericType> postBasicMicOperatingListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicMicOperatingListResponseTypeMap.put(200, new GenericType<InlineResponse20014>(){});
  }
  private static final Map<Integer, GenericType> postBasicTimezoneListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicTimezoneListResponseTypeMap.put(200, new GenericType<InlineResponse20023>(){});
  }
  private static final Map<Integer, GenericType> postBasicValueUnitCurrencyListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicValueUnitCurrencyListResponseTypeMap.put(200, new GenericType<InlineResponse20027>(){});
  }
  private static final Map<Integer, GenericType> postBasicValueUnitCurrencyMainListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicValueUnitCurrencyMainListResponseTypeMap.put(200, new GenericType<InlineResponse20030>(){});
  }
  private static final Map<Integer, GenericType> postBasicValueUnitListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postBasicValueUnitListResponseTypeMap.put(200, new GenericType<InlineResponse20025>(){});
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
   * List of asset classes.
   * List of asset classes as defined by FactSet Digital Solutions.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getBasicAssetClassList(java.util.Set<String> attributes) throws ApiException {
    return getBasicAssetClassListWithHttpInfo(attributes).getData();
  }

  /**
   * List of asset classes.
   * List of asset classes as defined by FactSet Digital Solutions.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getBasicAssetClassListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/assetClass/list";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicAssetClassList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicAssetClassListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of benchmark types.
   * List of benchmark types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getBasicBenchmarkTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicBenchmarkTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of benchmark types.
   * List of benchmark types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getBasicBenchmarkTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/benchmark/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicBenchmarkTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicBenchmarkTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of frequency types.
   * List of frequency types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getBasicFrequencyTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicFrequencyTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of frequency types.
   * List of frequency types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getBasicFrequencyTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/frequency/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicFrequencyTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicFrequencyTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a language.
   * Details for a language.
   * @param id Identifier of a language. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getBasicLanguageGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicLanguageGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details for a language.
   * Details for a language.
   * @param id Identifier of a language. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getBasicLanguageGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicLanguageGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/language/get";

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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicLanguageGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicLanguageGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a language identified by code.
   * Details for a language identified by code.
   * @param code ISO 639-1 code of the language. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getBasicLanguageGetByCode(String code, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicLanguageGetByCodeWithHttpInfo(code, attributes, language).getData();
  }

  /**
   * Details for a language identified by code.
   * Details for a language identified by code.
   * @param code ISO 639-1 code of the language. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getBasicLanguageGetByCodeWithHttpInfo(String code, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getBasicLanguageGetByCode");
    }
    
    // create path and map variables
    String localVarPath = "/basic/language/getByCode";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicLanguageGetByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicLanguageGetByCodeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of languages.
   * List of languages.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 getBasicLanguageList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicLanguageListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of languages.
   * List of languages.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> getBasicLanguageListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/language/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicLanguageList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicLanguageListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a market.
   * Details of a market.
   * @param id Identifier of a market. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 getBasicMarketGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicMarketGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of a market.
   * Details of a market.
   * @param id Identifier of a market. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> getBasicMarketGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicMarketGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/market/get";

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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicMarketGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicMarketGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of market groups.
   * List of market groups.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 getBasicMarketGroupList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicMarketGroupListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of market groups.
   * List of market groups.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> getBasicMarketGroupListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/market/group/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20010
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicMarketGroupList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicMarketGroupListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of market types.
   * List of market types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20011 getBasicMarketTypeList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicMarketTypeListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of market types.
   * List of market types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20011> getBasicMarketTypeListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/market/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20011
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicMarketTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicMarketTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of media kinds.
   * List of media kinds.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getBasicMediaKindList(java.util.Set<String> attributes) throws ApiException {
    return getBasicMediaKindListWithHttpInfo(attributes).getData();
  }

  /**
   * List of media kinds.
   * List of media kinds.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getBasicMediaKindListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/media/kind/list";

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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicMediaKindList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicMediaKindListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a continent.
   * Details for a continent.
   * @param id Identifier of a continent. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20017
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20017 getBasicRegionContinentGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicRegionContinentGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details for a continent.
   * Details for a continent.
   * @param id Identifier of a continent. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20017&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20017> getBasicRegionContinentGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicRegionContinentGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/region/continent/get";

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
        
        InlineResponse20017
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionContinentGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionContinentGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of continents.
   * List of continents.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20018
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20018 getBasicRegionContinentList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicRegionContinentListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of continents.
   * List of continents.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20018&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20018> getBasicRegionContinentListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/region/continent/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20018
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionContinentList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionContinentListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a country.
   * Details for a country.
   * @param id Identifier of a country. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20019
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20019 getBasicRegionCountryGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicRegionCountryGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details for a country.
   * Details for a country.
   * @param id Identifier of a country. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20019&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20019> getBasicRegionCountryGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicRegionCountryGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/region/country/get";

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
        
        InlineResponse20019
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionCountryGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionCountryGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a country identified by code.
   * Details for a country identified by code.
   * @param code ISO 3166-1 alpha-2 code of a country. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20020
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20020 getBasicRegionCountryGetByCode(String code, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicRegionCountryGetByCodeWithHttpInfo(code, attributes, language).getData();
  }

  /**
   * Details for a country identified by code.
   * Details for a country identified by code.
   * @param code ISO 3166-1 alpha-2 code of a country. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20020&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20020> getBasicRegionCountryGetByCodeWithHttpInfo(String code, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getBasicRegionCountryGetByCode");
    }
    
    // create path and map variables
    String localVarPath = "/basic/region/country/getByCode";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
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
        
        InlineResponse20020
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionCountryGetByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionCountryGetByCodeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of countries.
   * List of countries.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20021
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20021 getBasicRegionCountryList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicRegionCountryListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of countries.
   * List of countries.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20021&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20021> getBasicRegionCountryListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/region/country/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20021
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionCountryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionCountryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a region.
   * Details for a geographic, political, or economic region.
   * @param id Identifier of a region. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20015
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20015 getBasicRegionGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicRegionGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details for a region.
   * Details for a geographic, political, or economic region.
   * @param id Identifier of a region. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20015&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20015> getBasicRegionGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicRegionGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/region/get";

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
        
        InlineResponse20015
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of regions.
   * List of geographic, political, and economic regions.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20016
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20016 getBasicRegionList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicRegionListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of regions.
   * List of geographic, political, and economic regions.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20016&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20016> getBasicRegionListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/region/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20016
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicRegionList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicRegionListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a timezone.
   * Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param id Identifier of a timezone. An invalid or unsupported identifier will result in an error. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20022
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20022 getBasicTimezoneGet(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    return getBasicTimezoneGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a timezone.
   * Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param id Identifier of a timezone. An invalid or unsupported identifier will result in an error. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20022&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20022> getBasicTimezoneGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicTimezoneGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/timezone/get";

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
        
        InlineResponse20022
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicTimezoneGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicTimezoneGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a timezone identified by name.
   * Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param name Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20022
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20022 getBasicTimezoneGetByName(String name, java.util.Set<String> attributes) throws ApiException {
    return getBasicTimezoneGetByNameWithHttpInfo(name, attributes).getData();
  }

  /**
   * Details of a timezone identified by name.
   * Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param name Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20022&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20022> getBasicTimezoneGetByNameWithHttpInfo(String name, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getBasicTimezoneGetByName");
    }
    
    // create path and map variables
    String localVarPath = "/basic/timezone/getByName";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
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
        
        InlineResponse20022
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicTimezoneGetByName", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicTimezoneGetByNameResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of alternative units.
   * List of alternative units.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20026
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20026 getBasicValueUnitAlternativeList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicValueUnitAlternativeListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of alternative units.
   * List of alternative units.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20026&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20026> getBasicValueUnitAlternativeListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/alternative/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20026
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicValueUnitAlternativeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicValueUnitAlternativeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a fractional currency.
   * Details of a fractional currency.
   * @param id Identifier of a fractional currency. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20028
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20028 getBasicValueUnitCurrencyFractionalGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicValueUnitCurrencyFractionalGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of a fractional currency.
   * Details of a fractional currency.
   * @param id Identifier of a fractional currency. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20028&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20028> getBasicValueUnitCurrencyFractionalGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicValueUnitCurrencyFractionalGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/currency/fractional/get";

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
        
        InlineResponse20028
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicValueUnitCurrencyFractionalGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicValueUnitCurrencyFractionalGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of fractional currencies.
   * List of fractional currencies.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20029
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20029 getBasicValueUnitCurrencyFractionalList(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    return getBasicValueUnitCurrencyFractionalListWithHttpInfo(attributes, language, sort).getData();
  }

  /**
   * List of fractional currencies.
   * List of fractional currencies.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20029&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20029> getBasicValueUnitCurrencyFractionalListWithHttpInfo(java.util.Set<String> attributes, String language, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/currency/fractional/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20029
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicValueUnitCurrencyFractionalList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicValueUnitCurrencyFractionalListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a value unit.
   * Details of a value unit.
   * @param id Identifier of a value unit. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20024
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20024 getBasicValueUnitGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getBasicValueUnitGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of a value unit.
   * Details of a value unit.
   * @param id Identifier of a value unit. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20024&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20024> getBasicValueUnitGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getBasicValueUnitGet");
    }
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/get";

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
        
        InlineResponse20024
      
    > apiResponse = apiClient.invokeAPI("BasicApi.getBasicValueUnitGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBasicValueUnitGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of background text types.
   * List of background text types.
   * @param body  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postBasicBackgroundTextTypeList(InlineObject body) throws ApiException {
    return postBasicBackgroundTextTypeListWithHttpInfo(body).getData();
  }

  /**
   * List of background text types.
   * List of background text types.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postBasicBackgroundTextTypeListWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/backgroundText/type/list";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicBackgroundTextTypeList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicBackgroundTextTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of deliveries.
   * List of deliveries.
   * @param body  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postBasicDeliveryList(InlineObject1 body) throws ApiException {
    return postBasicDeliveryListWithHttpInfo(body).getData();
  }

  /**
   * List of deliveries.
   * List of deliveries.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postBasicDeliveryListWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/delivery/list";

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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicDeliveryList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicDeliveryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of markets.
   * List of markets.
   * @param body  (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 postBasicMarketList(InlineObject2 body) throws ApiException {
    return postBasicMarketListWithHttpInfo(body).getData();
  }

  /**
   * List of markets.
   * List of markets.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> postBasicMarketListWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/market/list";

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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicMarketList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicMarketListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of Internet media types.
   * List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.
   * @param body  (optional)
   * @return InlineResponse20013
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20013 postBasicMediaTypeList(InlineObject3 body) throws ApiException {
    return postBasicMediaTypeListWithHttpInfo(body).getData();
  }

  /**
   * List of Internet media types.
   * List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20013&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20013> postBasicMediaTypeListWithHttpInfo(InlineObject3 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/media/type/list";

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
        
        InlineResponse20013
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicMediaTypeList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicMediaTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of operating market identifier codes (MIC).
   * List of operating market identifier codes (MIC).
   * @param body  (optional)
   * @return InlineResponse20014
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20014 postBasicMicOperatingList(InlineObject4 body) throws ApiException {
    return postBasicMicOperatingListWithHttpInfo(body).getData();
  }

  /**
   * List of operating market identifier codes (MIC).
   * List of operating market identifier codes (MIC).
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20014&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20014> postBasicMicOperatingListWithHttpInfo(InlineObject4 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/mic/operating/list";

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
        
        InlineResponse20014
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicMicOperatingList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicMicOperatingListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of timezones.
   * List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param body  (optional)
   * @return InlineResponse20023
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20023 postBasicTimezoneList(InlineObject5 body) throws ApiException {
    return postBasicTimezoneListWithHttpInfo(body).getData();
  }

  /**
   * List of timezones.
   * List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20023&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20023> postBasicTimezoneListWithHttpInfo(InlineObject5 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/timezone/list";

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
        
        InlineResponse20023
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicTimezoneList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicTimezoneListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of currencies.
   * List of currencies.
   * @param body  (optional)
   * @return InlineResponse20027
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20027 postBasicValueUnitCurrencyList(InlineObject7 body) throws ApiException {
    return postBasicValueUnitCurrencyListWithHttpInfo(body).getData();
  }

  /**
   * List of currencies.
   * List of currencies.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20027&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20027> postBasicValueUnitCurrencyListWithHttpInfo(InlineObject7 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/currency/list";

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
        
        InlineResponse20027
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicValueUnitCurrencyList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicValueUnitCurrencyListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of main currencies.
   * List of main currencies.
   * @param body  (optional)
   * @return InlineResponse20030
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20030 postBasicValueUnitCurrencyMainList(InlineObject8 body) throws ApiException {
    return postBasicValueUnitCurrencyMainListWithHttpInfo(body).getData();
  }

  /**
   * List of main currencies.
   * List of main currencies.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20030&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20030> postBasicValueUnitCurrencyMainListWithHttpInfo(InlineObject8 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/currency/main/list";

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
        
        InlineResponse20030
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicValueUnitCurrencyMainList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicValueUnitCurrencyMainListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of value units.
   * List of value units.
   * @param body  (optional)
   * @return InlineResponse20025
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20025 postBasicValueUnitList(InlineObject6 body) throws ApiException {
    return postBasicValueUnitListWithHttpInfo(body).getData();
  }

  /**
   * List of value units.
   * List of value units.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20025&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20025> postBasicValueUnitListWithHttpInfo(InlineObject6 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/basic/valueUnit/list";

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
        
        InlineResponse20025
      
    > apiResponse = apiClient.invokeAPI("BasicApi.postBasicValueUnitList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postBasicValueUnitListResponseTypeMap, false);

    return apiResponse;

  }
}
