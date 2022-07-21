package com.factset.sdk.TimeSeriesAPIforDigitalPortals.api;

import com.factset.sdk.TimeSeriesAPIforDigitalPortals.ApiException;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.Configuration;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject10;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject7;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject8;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject9;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse20010;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2009;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricesApi {
  private ApiClient apiClient;

  public PricesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> postPricesTimeSeriesEodListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesEodListResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> postPricesTimeSeriesEodSubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesEodSubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> postPricesTimeSeriesEodSubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesEodSubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> postPricesTimeSeriesIntradayListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesIntradayListResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> postPricesTimeSeriesIntradaySubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesIntradaySubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> postPricesTimeSeriesIntradaySubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTimeSeriesIntradaySubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
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
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject5  (required)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 postPricesTimeSeriesEodList(InlineObject5 inlineObject5) throws ApiException {
    return postPricesTimeSeriesEodListWithHttpInfo(inlineObject5).getData();
  }

  /**
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject5  (required)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> postPricesTimeSeriesEodListWithHttpInfo(InlineObject5 inlineObject5) throws ApiException {
    Object localVarPostBody = inlineObject5;
    
    // verify the required parameter 'inlineObject5' is set
    if (inlineObject5 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject5' when calling postPricesTimeSeriesEodList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/eod/list";

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
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesEodList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesEodListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param inlineObject6  (required)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postPricesTimeSeriesEodSubsampleGet(InlineObject6 inlineObject6) throws ApiException {
    return postPricesTimeSeriesEodSubsampleGetWithHttpInfo(inlineObject6).getData();
  }

  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param inlineObject6  (required)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postPricesTimeSeriesEodSubsampleGetWithHttpInfo(InlineObject6 inlineObject6) throws ApiException {
    Object localVarPostBody = inlineObject6;
    
    // verify the required parameter 'inlineObject6' is set
    if (inlineObject6 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject6' when calling postPricesTimeSeriesEodSubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/eod/subsample/get";

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
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesEodSubsampleGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesEodSubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject7  (required)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 postPricesTimeSeriesEodSubsampleList(InlineObject7 inlineObject7) throws ApiException {
    return postPricesTimeSeriesEodSubsampleListWithHttpInfo(inlineObject7).getData();
  }

  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject7  (required)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> postPricesTimeSeriesEodSubsampleListWithHttpInfo(InlineObject7 inlineObject7) throws ApiException {
    Object localVarPostBody = inlineObject7;
    
    // verify the required parameter 'inlineObject7' is set
    if (inlineObject7 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject7' when calling postPricesTimeSeriesEodSubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/eod/subsample/list";

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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesEodSubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesEodSubsampleListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Intraday time series data for a notation.
   * Intraday time series data for a notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject8  (required)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 postPricesTimeSeriesIntradayList(InlineObject8 inlineObject8) throws ApiException {
    return postPricesTimeSeriesIntradayListWithHttpInfo(inlineObject8).getData();
  }

  /**
   * Intraday time series data for a notation.
   * Intraday time series data for a notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject8  (required)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> postPricesTimeSeriesIntradayListWithHttpInfo(InlineObject8 inlineObject8) throws ApiException {
    Object localVarPostBody = inlineObject8;
    
    // verify the required parameter 'inlineObject8' is set
    if (inlineObject8 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject8' when calling postPricesTimeSeriesIntradayList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/intraday/list";

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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesIntradayList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesIntradayListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param inlineObject9  (required)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 postPricesTimeSeriesIntradaySubsampleGet(InlineObject9 inlineObject9) throws ApiException {
    return postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(inlineObject9).getData();
  }

  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param inlineObject9  (required)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(InlineObject9 inlineObject9) throws ApiException {
    Object localVarPostBody = inlineObject9;
    
    // verify the required parameter 'inlineObject9' is set
    if (inlineObject9 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject9' when calling postPricesTimeSeriesIntradaySubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/intraday/subsample/get";

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
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesIntradaySubsampleGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesIntradaySubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject10  (required)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 postPricesTimeSeriesIntradaySubsampleList(InlineObject10 inlineObject10) throws ApiException {
    return postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(inlineObject10).getData();
  }

  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param inlineObject10  (required)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(InlineObject10 inlineObject10) throws ApiException {
    Object localVarPostBody = inlineObject10;
    
    // verify the required parameter 'inlineObject10' is set
    if (inlineObject10 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject10' when calling postPricesTimeSeriesIntradaySubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/timeSeries/intraday/subsample/list";

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
        
        InlineResponse20010
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTimeSeriesIntradaySubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTimeSeriesIntradaySubsampleListResponseTypeMap, false);

    return apiResponse;

  }
}
