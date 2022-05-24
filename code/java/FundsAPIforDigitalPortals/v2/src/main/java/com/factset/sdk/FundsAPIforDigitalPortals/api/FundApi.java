package com.factset.sdk.FundsAPIforDigitalPortals.api;

import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2006;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundApi {
  private ApiClient apiClient;

  public FundApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getFundHoldingListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundHoldingListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkYear1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkYear1GetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkYear3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkYear3GetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getFundNotationKeyFiguresBenchmarkYear5GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundNotationKeyFiguresBenchmarkYear5GetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getFundShareClassGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundShareClassGetResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> postFundIssuerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFundIssuerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postFundNotationScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFundNotationScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> postFundNotationScreenerValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFundNotationScreenerValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
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
   * Holdings of a fund.
   * Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).
   * @param id Identifier of an instrument of a fund share class. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;-holdings.weight\&quot;])
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getFundHoldingListByInstrument(String id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getFundHoldingListByInstrumentWithHttpInfo(id, attributes, sort).getData();
  }

  /**
   * Holdings of a fund.
   * Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).
   * @param id Identifier of an instrument of a fund share class. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;-holdings.weight\&quot;])
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getFundHoldingListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundHoldingListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/fund/holding/listByInstrument";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundHoldingListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundHoldingListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public ApiResponse<InlineResponse2002> getFundNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkMonth1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkMonth1Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/month/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkMonth1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth3Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public ApiResponse<InlineResponse2002> getFundNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkMonth3Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkMonth3Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/month/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkMonth3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getFundNotationKeyFiguresBenchmarkWeek1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getFundNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkWeek1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkWeek1Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/week/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkWeek1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public ApiResponse<InlineResponse2002> getFundNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkYear1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkYear1Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/year/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkYear1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkYear1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear3Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public ApiResponse<InlineResponse2002> getFundNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkYear3Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkYear3Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/year/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkYear3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkYear3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear5Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of benchmark notations. (required)
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
  public ApiResponse<InlineResponse2002> getFundNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundNotationKeyFiguresBenchmarkYear5Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getFundNotationKeyFiguresBenchmarkYear5Get");
    }
    
    // create path and map variables
    String localVarPath = "/fund/notation/keyFigures/benchmark/year/5/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundNotationKeyFiguresBenchmarkYear5Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundNotationKeyFiguresBenchmarkYear5GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fundamental data for a share class of a fund.
   * The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes.   Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint &#x60;/basic/region/country/list&#x60; for possible values.
   * @param id Identifier of the instrument. (required)
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
  public InlineResponse2006 getFundShareClassGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getFundShareClassGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Fundamental data for a share class of a fund.
   * The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes.   Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint &#x60;/basic/region/country/list&#x60; for possible values.
   * @param id Identifier of the instrument. (required)
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
  public ApiResponse<InlineResponse2006> getFundShareClassGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFundShareClassGet");
    }
    
    // create path and map variables
    String localVarPath = "/fund/shareClass/get";

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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("FundApi.getFundShareClassGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundShareClassGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for issuers of funds.
   * Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param body  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postFundIssuerSearch(InlineObject body) throws ApiException {
    return postFundIssuerSearchWithHttpInfo(body).getData();
  }

  /**
   * Search for issuers of funds.
   * Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postFundIssuerSearchWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/fund/issuer/search";

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
      
    > apiResponse = apiClient.invokeAPI("FundApi.postFundIssuerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFundIssuerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
   * Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example &#x60;issuer.selection&#x60;. Others apply to the share classes, thus only notations of matching share classes are returned, for example &#x60;minimumInvestment.initial&#x60;. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;) and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.       A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postFundNotationScreenerSearch(InlineObject1 body) throws ApiException {
    return postFundNotationScreenerSearchWithHttpInfo(body).getData();
  }

  /**
   * Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
   * Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example &#x60;issuer.selection&#x60;. Others apply to the share classes, thus only notations of matching share classes are returned, for example &#x60;minimumInvestment.initial&#x60;. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;) and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.       A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postFundNotationScreenerSearchWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/fund/notation/screener/search";

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
      
    > apiResponse = apiClient.invokeAPI("FundApi.postFundNotationScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFundNotationScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/fund/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;), and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.
   * @param body  (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 postFundNotationScreenerValueRangesGet(InlineObject2 body) throws ApiException {
    return postFundNotationScreenerValueRangesGetWithHttpInfo(body).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/fund/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;), and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> postFundNotationScreenerValueRangesGetWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/fund/notation/screener/valueRanges/get";

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
      
    > apiResponse = apiClient.invokeAPI("FundApi.postFundNotationScreenerValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFundNotationScreenerValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
}
