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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20042;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20043;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20044;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20045;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20046;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20047;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20048;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20049;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20050;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20052;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20053;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20055;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20056;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20057;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20058;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20059;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20060;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20061;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20063;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20064;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20090;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentBackgroundTextTypeListRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentBenchmarkListRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentCategoryListRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentCompliancePropertyListRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentCrossReferenceListByISINRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentCrossReferenceListByWKNRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentNotationListRequest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostInstrumentRatingGradeListRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstrumentApi {
  private ApiClient apiClient;

  public InstrumentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InstrumentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getInstrumentBackgroundTextListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentBackgroundTextListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20044>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCompliancePropertyListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCompliancePropertyListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20049>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCompositeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCompositeGetResponseTypeMap.put(200, new GenericType<InlineResponse20050>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCouponDayCountConventionTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCouponDayCountConventionTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20052>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCouponInterestRateTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCouponInterestRateTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20053>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCouponKeyDataGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCouponKeyDataGetResponseTypeMap.put(200, new GenericType<InlineResponse20054>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCouponListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCouponListResponseTypeMap.put(200, new GenericType<InlineResponse20051>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCrossReferenceGetByISINResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCrossReferenceGetByISINResponseTypeMap.put(200, new GenericType<InlineResponse20055>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCrossReferenceGetByWKNResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCrossReferenceGetByWKNResponseTypeMap.put(200, new GenericType<InlineResponse20055>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCrossReferenceHistoryGetByISINResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCrossReferenceHistoryGetByISINResponseTypeMap.put(200, new GenericType<InlineResponse20058>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentCrossReferenceHistoryGetByWKNResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentCrossReferenceHistoryGetByWKNResponseTypeMap.put(200, new GenericType<InlineResponse20058>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentExchangeRateGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentExchangeRateGetResponseTypeMap.put(200, new GenericType<InlineResponse20059>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentExchangeRateGetByISOCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentExchangeRateGetByISOCodeResponseTypeMap.put(200, new GenericType<InlineResponse20059>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentGetResponseTypeMap.put(200, new GenericType<InlineResponse20042>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentGetByNotationResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentGetByNotationResponseTypeMap.put(200, new GenericType<InlineResponse20043>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentLegalEntityBackgroundTextListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentLegalEntityBackgroundTextListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20060>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentLegalEntityCompliancePropertyListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentLegalEntityCompliancePropertyListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20061>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentMifidGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentMifidGetResponseTypeMap.put(200, new GenericType<InlineResponse20062>(){});
  }
  private static final Map<Integer, GenericType> getInstrumentSearchBasicResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInstrumentSearchBasicResponseTypeMap.put(200, new GenericType<InlineResponse20090>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentBackgroundTextTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentBackgroundTextTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20045>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentBenchmarkListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentBenchmarkListResponseTypeMap.put(200, new GenericType<InlineResponse20046>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentCategoryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentCategoryListResponseTypeMap.put(200, new GenericType<InlineResponse20047>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentCompliancePropertyListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentCompliancePropertyListResponseTypeMap.put(200, new GenericType<InlineResponse20048>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentCrossReferenceListByISINResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentCrossReferenceListByISINResponseTypeMap.put(200, new GenericType<InlineResponse20056>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentCrossReferenceListByWKNResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentCrossReferenceListByWKNResponseTypeMap.put(200, new GenericType<InlineResponse20057>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentNotationListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentNotationListResponseTypeMap.put(200, new GenericType<InlineResponse20063>(){});
  }
  private static final Map<Integer, GenericType> postInstrumentRatingGradeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postInstrumentRatingGradeListResponseTypeMap.put(200, new GenericType<InlineResponse20064>(){});
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
   * Background texts of an instrument.
   * Background texts of an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20044
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20044 getInstrumentBackgroundTextListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentBackgroundTextListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Background texts of an instrument.
   * Background texts of an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20044&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20044> getInstrumentBackgroundTextListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentBackgroundTextListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/backgroundText/listByInstrument";

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
        
        InlineResponse20044
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentBackgroundTextListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentBackgroundTextListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Compliance properties of an instrument.
   * Compliance properties of an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20049
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20049 getInstrumentCompliancePropertyListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCompliancePropertyListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Compliance properties of an instrument.
   * Compliance properties of an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20049&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20049> getInstrumentCompliancePropertyListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentCompliancePropertyListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/complianceProperty/listByInstrument";

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
        
        InlineResponse20049
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCompliancePropertyListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCompliancePropertyListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Composite instrument and its components.
   * Composite instrument and its components.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20050
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20050 getInstrumentCompositeGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCompositeGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Composite instrument and its components.
   * Composite instrument and its components.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20050&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20050> getInstrumentCompositeGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentCompositeGet");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/composite/get";

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
        
        InlineResponse20050
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCompositeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCompositeGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of day count convention types.
   * List of day count convention types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20052
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20052 getInstrumentCouponDayCountConventionTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCouponDayCountConventionTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of day count convention types.
   * List of day count convention types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20052&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20052> getInstrumentCouponDayCountConventionTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/instrument/coupon/dayCountConvention/type/list";

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
        
        InlineResponse20052
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCouponDayCountConventionTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCouponDayCountConventionTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of interest rate types.
   * List of interest rate types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20053
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20053 getInstrumentCouponInterestRateTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCouponInterestRateTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of interest rate types.
   * List of interest rate types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20053&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20053> getInstrumentCouponInterestRateTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/instrument/coupon/interestRate/type/list";

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
        
        InlineResponse20053
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCouponInterestRateTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCouponInterestRateTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Interest rate details for selected periods of an interest-bearing instrument.
   * Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20054
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20054 getInstrumentCouponKeyDataGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCouponKeyDataGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Interest rate details for selected periods of an interest-bearing instrument.
   * Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20054&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20054> getInstrumentCouponKeyDataGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentCouponKeyDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/coupon/keyData/get";

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
        
        InlineResponse20054
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCouponKeyDataGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCouponKeyDataGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of coupons for an interest-bearing instrument.
   * List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument.   If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20051
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20051 getInstrumentCouponList(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentCouponListWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * List of coupons for an interest-bearing instrument.
   * List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument.   If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20051&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20051> getInstrumentCouponListWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentCouponList");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/coupon/list";

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
        
        InlineResponse20051
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCouponList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCouponListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate ISIN to instrument.
   * Translate a given ISIN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.
   * @param isin  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20055
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20055 getInstrumentCrossReferenceGetByISIN(String isin, java.util.Set<String> attributes) throws ApiException {
    return getInstrumentCrossReferenceGetByISINWithHttpInfo(isin, attributes).getData();
  }

  /**
   * Translate ISIN to instrument.
   * Translate a given ISIN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.
   * @param isin  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20055&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20055> getInstrumentCrossReferenceGetByISINWithHttpInfo(String isin, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'isin' is set
    if (isin == null) {
      throw new ApiException(400, "Missing the required parameter 'isin' when calling getInstrumentCrossReferenceGetByISIN");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/getByISIN";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
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
        
        InlineResponse20055
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCrossReferenceGetByISIN", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCrossReferenceGetByISINResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate WKN to instrument.
   * Translate a given WKN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.
   * @param wkn  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20055
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20055 getInstrumentCrossReferenceGetByWKN(String wkn, java.util.Set<String> attributes) throws ApiException {
    return getInstrumentCrossReferenceGetByWKNWithHttpInfo(wkn, attributes).getData();
  }

  /**
   * Translate WKN to instrument.
   * Translate a given WKN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.
   * @param wkn  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20055&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20055> getInstrumentCrossReferenceGetByWKNWithHttpInfo(String wkn, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'wkn' is set
    if (wkn == null) {
      throw new ApiException(400, "Missing the required parameter 'wkn' when calling getInstrumentCrossReferenceGetByWKN");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/getByWKN";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wkn", wkn));
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
        
        InlineResponse20055
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCrossReferenceGetByWKN", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCrossReferenceGetByWKNResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * ISIN to instrument translation history.
   * Retrieve the complete translation history of a given ISIN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.
   * @param isin  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 10)
   * @return InlineResponse20058
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20058 getInstrumentCrossReferenceHistoryGetByISIN(String isin, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getInstrumentCrossReferenceHistoryGetByISINWithHttpInfo(isin, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * ISIN to instrument translation history.
   * Retrieve the complete translation history of a given ISIN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.
   * @param isin  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 10)
   * @return ApiResponse&lt;InlineResponse20058&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20058> getInstrumentCrossReferenceHistoryGetByISINWithHttpInfo(String isin, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'isin' is set
    if (isin == null) {
      throw new ApiException(400, "Missing the required parameter 'isin' when calling getInstrumentCrossReferenceHistoryGetByISIN");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/history/getByISIN";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20058
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCrossReferenceHistoryGetByISIN", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCrossReferenceHistoryGetByISINResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * WKN to instrument translation history.
   * Retrieve the complete translation history of a given WKN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.
   * @param wkn  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 10)
   * @return InlineResponse20058
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20058 getInstrumentCrossReferenceHistoryGetByWKN(String wkn, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getInstrumentCrossReferenceHistoryGetByWKNWithHttpInfo(wkn, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * WKN to instrument translation history.
   * Retrieve the complete translation history of a given WKN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.
   * @param wkn  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 10)
   * @return ApiResponse&lt;InlineResponse20058&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20058> getInstrumentCrossReferenceHistoryGetByWKNWithHttpInfo(String wkn, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'wkn' is set
    if (wkn == null) {
      throw new ApiException(400, "Missing the required parameter 'wkn' when calling getInstrumentCrossReferenceHistoryGetByWKN");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/history/getByWKN";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wkn", wkn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20058
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentCrossReferenceHistoryGetByWKN", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentCrossReferenceHistoryGetByWKNResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve an exchange rate instrument identifier.
   * Retrieve an exchange rate instrument identifier using the identifier of the main currencies represented by that exchange rate.    An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.
   * @param target  (required)
   * @param source  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20059
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20059 getInstrumentExchangeRateGet(BigDecimal target, BigDecimal source, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentExchangeRateGetWithHttpInfo(target, source, attributes, language).getData();
  }

  /**
   * Retrieve an exchange rate instrument identifier.
   * Retrieve an exchange rate instrument identifier using the identifier of the main currencies represented by that exchange rate.    An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.
   * @param target  (required)
   * @param source  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20059&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20059> getInstrumentExchangeRateGetWithHttpInfo(BigDecimal target, BigDecimal source, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'target' is set
    if (target == null) {
      throw new ApiException(400, "Missing the required parameter 'target' when calling getInstrumentExchangeRateGet");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling getInstrumentExchangeRateGet");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/exchangeRate/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
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
        
        InlineResponse20059
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentExchangeRateGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentExchangeRateGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve an exchange rate instrument identifier.
   * Retrieve an exchange rate instrument identifier using the ISO 4217 code of the main currencies represented by that exchange rate.   An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.
   * @param target  (required)
   * @param source  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20059
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20059 getInstrumentExchangeRateGetByISOCode(String target, String source, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentExchangeRateGetByISOCodeWithHttpInfo(target, source, attributes, language).getData();
  }

  /**
   * Retrieve an exchange rate instrument identifier.
   * Retrieve an exchange rate instrument identifier using the ISO 4217 code of the main currencies represented by that exchange rate.   An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.
   * @param target  (required)
   * @param source  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20059&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20059> getInstrumentExchangeRateGetByISOCodeWithHttpInfo(String target, String source, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'target' is set
    if (target == null) {
      throw new ApiException(400, "Missing the required parameter 'target' when calling getInstrumentExchangeRateGetByISOCode");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling getInstrumentExchangeRateGetByISOCode");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/exchangeRate/getByISOCode";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
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
        
        InlineResponse20059
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentExchangeRateGetByISOCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentExchangeRateGetByISOCodeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic data for an instrument.
   * Basic data for an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20042
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20042 getInstrumentGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Basic data for an instrument.
   * Basic data for an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20042&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20042> getInstrumentGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentGet");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/get";

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
        
        InlineResponse20042
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic data for an instrument.
   * Basic data for an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20043
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20043 getInstrumentGetByNotation(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentGetByNotationWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Basic data for an instrument.
   * Basic data for an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20043&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20043> getInstrumentGetByNotationWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentGetByNotation");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/getByNotation";

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
        
        InlineResponse20043
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentGetByNotation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentGetByNotationResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Role-specific background texts of legal entities related to an instrument.
   * Role-specific background texts of legal entities related to an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20060
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20060 getInstrumentLegalEntityBackgroundTextListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentLegalEntityBackgroundTextListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Role-specific background texts of legal entities related to an instrument.
   * Role-specific background texts of legal entities related to an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20060&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20060> getInstrumentLegalEntityBackgroundTextListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentLegalEntityBackgroundTextListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/legalEntity/backgroundText/listByInstrument";

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
        
        InlineResponse20060
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentLegalEntityBackgroundTextListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentLegalEntityBackgroundTextListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Role-specific compliance properties of legal entities related to an instrument.
   * Role-specic compliance properties of legal entities related to an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20061
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20061 getInstrumentLegalEntityCompliancePropertyListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentLegalEntityCompliancePropertyListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Role-specific compliance properties of legal entities related to an instrument.
   * Role-specic compliance properties of legal entities related to an instrument.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20061&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20061> getInstrumentLegalEntityCompliancePropertyListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentLegalEntityCompliancePropertyListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/legalEntity/complianceProperty/listByInstrument";

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
        
        InlineResponse20061
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentLegalEntityCompliancePropertyListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentLegalEntityCompliancePropertyListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * MiFID II data for a financial instrument.
   * MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called \&quot;investment products\&quot;.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20062
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20062 getInstrumentMifidGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getInstrumentMifidGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * MiFID II data for a financial instrument.
   * MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called \&quot;investment products\&quot;.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20062&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20062> getInstrumentMifidGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getInstrumentMifidGet");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/mifid/get";

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
        
        InlineResponse20062
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentMifidGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentMifidGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Basic search for instruments.
   * Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.
   * @param searchValue  (required)
   * @param nsins  (optional)
   * @param assetClass  (optional)
   * @param onlyActive  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return InlineResponse20090
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20090 getInstrumentSearchBasic(String searchValue, java.util.Set<String> nsins, String assetClass, Boolean onlyActive, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getInstrumentSearchBasicWithHttpInfo(searchValue, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit).getData();
  }

  /**
   * Basic search for instruments.
   * Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.
   * @param searchValue  (required)
   * @param nsins  (optional)
   * @param assetClass  (optional)
   * @param onlyActive  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return ApiResponse&lt;InlineResponse20090&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20090> getInstrumentSearchBasicWithHttpInfo(String searchValue, java.util.Set<String> nsins, String assetClass, Boolean onlyActive, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'searchValue' is set
    if (searchValue == null) {
      throw new ApiException(400, "Missing the required parameter 'searchValue' when calling getInstrumentSearchBasic");
    }
    
    // create path and map variables
    String localVarPath = "/instrument/search/basic";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchValue", searchValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "nsins", nsins));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetClass", assetClass));
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
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.getInstrumentSearchBasic", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInstrumentSearchBasicResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of background text types for instruments.
   * List of background text types for instruments.
   * @param postInstrumentBackgroundTextTypeListRequest  (optional)
   * @return InlineResponse20045
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20045 postInstrumentBackgroundTextTypeList(PostInstrumentBackgroundTextTypeListRequest postInstrumentBackgroundTextTypeListRequest) throws ApiException {
    return postInstrumentBackgroundTextTypeListWithHttpInfo(postInstrumentBackgroundTextTypeListRequest).getData();
  }

  /**
   * List of background text types for instruments.
   * List of background text types for instruments.
   * @param postInstrumentBackgroundTextTypeListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20045&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20045> postInstrumentBackgroundTextTypeListWithHttpInfo(PostInstrumentBackgroundTextTypeListRequest postInstrumentBackgroundTextTypeListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentBackgroundTextTypeListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/backgroundText/type/list";

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
        
        InlineResponse20045
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentBackgroundTextTypeList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentBackgroundTextTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of benchmarks of a financial instrument.
   * Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.
   * @param postInstrumentBenchmarkListRequest  (optional)
   * @return InlineResponse20046
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20046 postInstrumentBenchmarkList(PostInstrumentBenchmarkListRequest postInstrumentBenchmarkListRequest) throws ApiException {
    return postInstrumentBenchmarkListWithHttpInfo(postInstrumentBenchmarkListRequest).getData();
  }

  /**
   * List of benchmarks of a financial instrument.
   * Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.
   * @param postInstrumentBenchmarkListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20046&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20046> postInstrumentBenchmarkListWithHttpInfo(PostInstrumentBenchmarkListRequest postInstrumentBenchmarkListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentBenchmarkListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/benchmark/list";

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
        
        InlineResponse20046
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentBenchmarkList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentBenchmarkListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of categories assigned to a specific instrument the application is entitled to see.
   * List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.
   * @param postInstrumentCategoryListRequest  (optional)
   * @return InlineResponse20047
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20047 postInstrumentCategoryList(PostInstrumentCategoryListRequest postInstrumentCategoryListRequest) throws ApiException {
    return postInstrumentCategoryListWithHttpInfo(postInstrumentCategoryListRequest).getData();
  }

  /**
   * List of categories assigned to a specific instrument the application is entitled to see.
   * List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.
   * @param postInstrumentCategoryListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20047&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20047> postInstrumentCategoryListWithHttpInfo(PostInstrumentCategoryListRequest postInstrumentCategoryListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentCategoryListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/category/list";

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
        
        InlineResponse20047
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentCategoryList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentCategoryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of compliance properties for instruments.
   * List of compliance properties for instruments.
   * @param postInstrumentCompliancePropertyListRequest  (optional)
   * @return InlineResponse20048
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20048 postInstrumentCompliancePropertyList(PostInstrumentCompliancePropertyListRequest postInstrumentCompliancePropertyListRequest) throws ApiException {
    return postInstrumentCompliancePropertyListWithHttpInfo(postInstrumentCompliancePropertyListRequest).getData();
  }

  /**
   * List of compliance properties for instruments.
   * List of compliance properties for instruments.
   * @param postInstrumentCompliancePropertyListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20048&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20048> postInstrumentCompliancePropertyListWithHttpInfo(PostInstrumentCompliancePropertyListRequest postInstrumentCompliancePropertyListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentCompliancePropertyListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/complianceProperty/list";

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
        
        InlineResponse20048
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentCompliancePropertyList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentCompliancePropertyListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate a list of ISINs to instruments.
   * Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.
   * @param postInstrumentCrossReferenceListByISINRequest  (optional)
   * @return InlineResponse20056
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20056 postInstrumentCrossReferenceListByISIN(PostInstrumentCrossReferenceListByISINRequest postInstrumentCrossReferenceListByISINRequest) throws ApiException {
    return postInstrumentCrossReferenceListByISINWithHttpInfo(postInstrumentCrossReferenceListByISINRequest).getData();
  }

  /**
   * Translate a list of ISINs to instruments.
   * Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.
   * @param postInstrumentCrossReferenceListByISINRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20056&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20056> postInstrumentCrossReferenceListByISINWithHttpInfo(PostInstrumentCrossReferenceListByISINRequest postInstrumentCrossReferenceListByISINRequest) throws ApiException {
    Object localVarPostBody = postInstrumentCrossReferenceListByISINRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/listByISIN";

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
        
        InlineResponse20056
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentCrossReferenceListByISIN", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentCrossReferenceListByISINResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Translate a list of WKNs to instruments.
   * Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.
   * @param postInstrumentCrossReferenceListByWKNRequest  (optional)
   * @return InlineResponse20057
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20057 postInstrumentCrossReferenceListByWKN(PostInstrumentCrossReferenceListByWKNRequest postInstrumentCrossReferenceListByWKNRequest) throws ApiException {
    return postInstrumentCrossReferenceListByWKNWithHttpInfo(postInstrumentCrossReferenceListByWKNRequest).getData();
  }

  /**
   * Translate a list of WKNs to instruments.
   * Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.
   * @param postInstrumentCrossReferenceListByWKNRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20057&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20057> postInstrumentCrossReferenceListByWKNWithHttpInfo(PostInstrumentCrossReferenceListByWKNRequest postInstrumentCrossReferenceListByWKNRequest) throws ApiException {
    Object localVarPostBody = postInstrumentCrossReferenceListByWKNRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/crossReference/listByWKN";

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
        
        InlineResponse20057
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentCrossReferenceListByWKN", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentCrossReferenceListByWKNResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of active, entitled notations for a set of instruments.
   * List of active, entitled notations for a set of instruments. By default the list of notations (per instrument) is sorted descending by the trading volume, averaged over one month. All identifiers used as parameters must be valid and entitled.
   * @param postInstrumentNotationListRequest  (optional)
   * @return InlineResponse20063
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20063 postInstrumentNotationList(PostInstrumentNotationListRequest postInstrumentNotationListRequest) throws ApiException {
    return postInstrumentNotationListWithHttpInfo(postInstrumentNotationListRequest).getData();
  }

  /**
   * List of active, entitled notations for a set of instruments.
   * List of active, entitled notations for a set of instruments. By default the list of notations (per instrument) is sorted descending by the trading volume, averaged over one month. All identifiers used as parameters must be valid and entitled.
   * @param postInstrumentNotationListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20063&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20063> postInstrumentNotationListWithHttpInfo(PostInstrumentNotationListRequest postInstrumentNotationListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentNotationListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/notation/list";

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
        
        InlineResponse20063
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentNotationList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentNotationListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of rating grades for a list of instruments.
   * List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.
   * @param postInstrumentRatingGradeListRequest  (optional)
   * @return InlineResponse20064
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20064 postInstrumentRatingGradeList(PostInstrumentRatingGradeListRequest postInstrumentRatingGradeListRequest) throws ApiException {
    return postInstrumentRatingGradeListWithHttpInfo(postInstrumentRatingGradeListRequest).getData();
  }

  /**
   * List of rating grades for a list of instruments.
   * List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.
   * @param postInstrumentRatingGradeListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20064&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20064> postInstrumentRatingGradeListWithHttpInfo(PostInstrumentRatingGradeListRequest postInstrumentRatingGradeListRequest) throws ApiException {
    Object localVarPostBody = postInstrumentRatingGradeListRequest;
    
    // create path and map variables
    String localVarPath = "/instrument/rating/grade/list";

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
        
        InlineResponse20064
      
    > apiResponse = apiClient.invokeAPI("InstrumentApi.postInstrumentRatingGradeList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postInstrumentRatingGradeListResponseTypeMap, false);

    return apiResponse;

  }
}
