package com.factset.sdk.RealTimeTimeSeries.api;

import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiResponse;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse20010;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2005;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2006;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2007;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2008;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2009;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesEodListRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesEodSubsampleGetRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesEodSubsampleListRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradayListRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradaySubsampleGetRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradaySubsampleListRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

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
   * @param postPricesTimeSeriesEodListRequest Request Body (required)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 postPricesTimeSeriesEodList(PostPricesTimeSeriesEodListRequest postPricesTimeSeriesEodListRequest) throws ApiException {
    return postPricesTimeSeriesEodListWithHttpInfo(postPricesTimeSeriesEodListRequest).getData();
  }

  /**
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTimeSeriesEodListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> postPricesTimeSeriesEodListWithHttpInfo(PostPricesTimeSeriesEodListRequest postPricesTimeSeriesEodListRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesEodListRequest;
    
    // verify the required parameter 'postPricesTimeSeriesEodListRequest' is set
    if (postPricesTimeSeriesEodListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesEodListRequest' when calling postPricesTimeSeriesEodList");
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
   * @param postPricesTimeSeriesEodSubsampleGetRequest Request Body (required)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postPricesTimeSeriesEodSubsampleGet(PostPricesTimeSeriesEodSubsampleGetRequest postPricesTimeSeriesEodSubsampleGetRequest) throws ApiException {
    return postPricesTimeSeriesEodSubsampleGetWithHttpInfo(postPricesTimeSeriesEodSubsampleGetRequest).getData();
  }

  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param postPricesTimeSeriesEodSubsampleGetRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postPricesTimeSeriesEodSubsampleGetWithHttpInfo(PostPricesTimeSeriesEodSubsampleGetRequest postPricesTimeSeriesEodSubsampleGetRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesEodSubsampleGetRequest;
    
    // verify the required parameter 'postPricesTimeSeriesEodSubsampleGetRequest' is set
    if (postPricesTimeSeriesEodSubsampleGetRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesEodSubsampleGetRequest' when calling postPricesTimeSeriesEodSubsampleGet");
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
   * @param postPricesTimeSeriesEodSubsampleListRequest Request Body (required)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 postPricesTimeSeriesEodSubsampleList(PostPricesTimeSeriesEodSubsampleListRequest postPricesTimeSeriesEodSubsampleListRequest) throws ApiException {
    return postPricesTimeSeriesEodSubsampleListWithHttpInfo(postPricesTimeSeriesEodSubsampleListRequest).getData();
  }

  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTimeSeriesEodSubsampleListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> postPricesTimeSeriesEodSubsampleListWithHttpInfo(PostPricesTimeSeriesEodSubsampleListRequest postPricesTimeSeriesEodSubsampleListRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesEodSubsampleListRequest;
    
    // verify the required parameter 'postPricesTimeSeriesEodSubsampleListRequest' is set
    if (postPricesTimeSeriesEodSubsampleListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesEodSubsampleListRequest' when calling postPricesTimeSeriesEodSubsampleList");
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
   * @param postPricesTimeSeriesIntradayListRequest Request Body (required)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 postPricesTimeSeriesIntradayList(PostPricesTimeSeriesIntradayListRequest postPricesTimeSeriesIntradayListRequest) throws ApiException {
    return postPricesTimeSeriesIntradayListWithHttpInfo(postPricesTimeSeriesIntradayListRequest).getData();
  }

  /**
   * Intraday time series data for a notation.
   * Intraday time series data for a notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTimeSeriesIntradayListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> postPricesTimeSeriesIntradayListWithHttpInfo(PostPricesTimeSeriesIntradayListRequest postPricesTimeSeriesIntradayListRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesIntradayListRequest;
    
    // verify the required parameter 'postPricesTimeSeriesIntradayListRequest' is set
    if (postPricesTimeSeriesIntradayListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesIntradayListRequest' when calling postPricesTimeSeriesIntradayList");
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
   * @param postPricesTimeSeriesIntradaySubsampleGetRequest Request Body (required)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 postPricesTimeSeriesIntradaySubsampleGet(PostPricesTimeSeriesIntradaySubsampleGetRequest postPricesTimeSeriesIntradaySubsampleGetRequest) throws ApiException {
    return postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(postPricesTimeSeriesIntradaySubsampleGetRequest).getData();
  }

  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param postPricesTimeSeriesIntradaySubsampleGetRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(PostPricesTimeSeriesIntradaySubsampleGetRequest postPricesTimeSeriesIntradaySubsampleGetRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesIntradaySubsampleGetRequest;
    
    // verify the required parameter 'postPricesTimeSeriesIntradaySubsampleGetRequest' is set
    if (postPricesTimeSeriesIntradaySubsampleGetRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesIntradaySubsampleGetRequest' when calling postPricesTimeSeriesIntradaySubsampleGet");
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
   * @param postPricesTimeSeriesIntradaySubsampleListRequest Request Body (required)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 postPricesTimeSeriesIntradaySubsampleList(PostPricesTimeSeriesIntradaySubsampleListRequest postPricesTimeSeriesIntradaySubsampleListRequest) throws ApiException {
    return postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(postPricesTimeSeriesIntradaySubsampleListRequest).getData();
  }

  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTimeSeriesIntradaySubsampleListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(PostPricesTimeSeriesIntradaySubsampleListRequest postPricesTimeSeriesIntradaySubsampleListRequest) throws ApiException {
    Object localVarPostBody = postPricesTimeSeriesIntradaySubsampleListRequest;
    
    // verify the required parameter 'postPricesTimeSeriesIntradaySubsampleListRequest' is set
    if (postPricesTimeSeriesIntradaySubsampleListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTimeSeriesIntradaySubsampleListRequest' when calling postPricesTimeSeriesIntradaySubsampleList");
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
