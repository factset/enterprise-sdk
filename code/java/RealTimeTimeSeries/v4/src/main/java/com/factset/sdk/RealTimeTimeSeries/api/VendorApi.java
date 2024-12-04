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

import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse200;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2001;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2002;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2003;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2004;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesEodListRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesEodSubsampleGetRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesEodSubsampleListRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest;
import com.factset.sdk.RealTimeTimeSeries.models.PostVendorChartIQTimeSeriesIntradaySubsampleListRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VendorApi {
  private ApiClient apiClient;

  public VendorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VendorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postVendorChartIqTimeSeriesEodListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIqTimeSeriesEodListResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }

  private static final Map<Integer, GenericType> postVendorChartIqTimeSeriesEodSubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIqTimeSeriesEodSubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }

  private static final Map<Integer, GenericType> postVendorChartIqTimeSeriesEodSubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIqTimeSeriesEodSubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }

  private static final Map<Integer, GenericType> postVendorChartIqTimeSeriesIntradaySubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIqTimeSeriesIntradaySubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }

  private static final Map<Integer, GenericType> postVendorChartIqTimeSeriesIntradaySubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIqTimeSeriesIntradaySubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
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
   * @param postVendorChartIQTimeSeriesEodListRequest Request Body (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postVendorChartIqTimeSeriesEodList(PostVendorChartIQTimeSeriesEodListRequest postVendorChartIQTimeSeriesEodListRequest) throws ApiException {
    return postVendorChartIqTimeSeriesEodListWithHttpInfo(postVendorChartIQTimeSeriesEodListRequest).getData();
  }

  /**
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postVendorChartIQTimeSeriesEodListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postVendorChartIqTimeSeriesEodListWithHttpInfo(PostVendorChartIQTimeSeriesEodListRequest postVendorChartIQTimeSeriesEodListRequest) throws ApiException {
    Object localVarPostBody = postVendorChartIQTimeSeriesEodListRequest;
    
    // verify the required parameter 'postVendorChartIQTimeSeriesEodListRequest' is set
    if (postVendorChartIQTimeSeriesEodListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postVendorChartIQTimeSeriesEodListRequest' when calling postVendorChartIqTimeSeriesEodList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chart-iq/time-series/eod/list";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIqTimeSeriesEodList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIqTimeSeriesEodListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param postVendorChartIQTimeSeriesEodSubsampleGetRequest Request Body (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postVendorChartIqTimeSeriesEodSubsampleGet(PostVendorChartIQTimeSeriesEodSubsampleGetRequest postVendorChartIQTimeSeriesEodSubsampleGetRequest) throws ApiException {
    return postVendorChartIqTimeSeriesEodSubsampleGetWithHttpInfo(postVendorChartIQTimeSeriesEodSubsampleGetRequest).getData();
  }

  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param postVendorChartIQTimeSeriesEodSubsampleGetRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postVendorChartIqTimeSeriesEodSubsampleGetWithHttpInfo(PostVendorChartIQTimeSeriesEodSubsampleGetRequest postVendorChartIQTimeSeriesEodSubsampleGetRequest) throws ApiException {
    Object localVarPostBody = postVendorChartIQTimeSeriesEodSubsampleGetRequest;
    
    // verify the required parameter 'postVendorChartIQTimeSeriesEodSubsampleGetRequest' is set
    if (postVendorChartIQTimeSeriesEodSubsampleGetRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postVendorChartIQTimeSeriesEodSubsampleGetRequest' when calling postVendorChartIqTimeSeriesEodSubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chart-iq/time-series/eod/subsample/get";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIqTimeSeriesEodSubsampleGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIqTimeSeriesEodSubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postVendorChartIQTimeSeriesEodSubsampleListRequest Request Body (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postVendorChartIqTimeSeriesEodSubsampleList(PostVendorChartIQTimeSeriesEodSubsampleListRequest postVendorChartIQTimeSeriesEodSubsampleListRequest) throws ApiException {
    return postVendorChartIqTimeSeriesEodSubsampleListWithHttpInfo(postVendorChartIQTimeSeriesEodSubsampleListRequest).getData();
  }

  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postVendorChartIQTimeSeriesEodSubsampleListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postVendorChartIqTimeSeriesEodSubsampleListWithHttpInfo(PostVendorChartIQTimeSeriesEodSubsampleListRequest postVendorChartIQTimeSeriesEodSubsampleListRequest) throws ApiException {
    Object localVarPostBody = postVendorChartIQTimeSeriesEodSubsampleListRequest;
    
    // verify the required parameter 'postVendorChartIQTimeSeriesEodSubsampleListRequest' is set
    if (postVendorChartIQTimeSeriesEodSubsampleListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postVendorChartIQTimeSeriesEodSubsampleListRequest' when calling postVendorChartIqTimeSeriesEodSubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chart-iq/time-series/eod/subsample/list";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIqTimeSeriesEodSubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIqTimeSeriesEodSubsampleListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param postVendorChartIQTimeSeriesIntradaySubsampleGetRequest Request Body (required)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postVendorChartIqTimeSeriesIntradaySubsampleGet(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest postVendorChartIQTimeSeriesIntradaySubsampleGetRequest) throws ApiException {
    return postVendorChartIqTimeSeriesIntradaySubsampleGetWithHttpInfo(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest).getData();
  }

  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param postVendorChartIQTimeSeriesIntradaySubsampleGetRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postVendorChartIqTimeSeriesIntradaySubsampleGetWithHttpInfo(PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest postVendorChartIQTimeSeriesIntradaySubsampleGetRequest) throws ApiException {
    Object localVarPostBody = postVendorChartIQTimeSeriesIntradaySubsampleGetRequest;
    
    // verify the required parameter 'postVendorChartIQTimeSeriesIntradaySubsampleGetRequest' is set
    if (postVendorChartIQTimeSeriesIntradaySubsampleGetRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postVendorChartIQTimeSeriesIntradaySubsampleGetRequest' when calling postVendorChartIqTimeSeriesIntradaySubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chart-iq/time-series/intraday/subsample/get";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIqTimeSeriesIntradaySubsampleGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIqTimeSeriesIntradaySubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postVendorChartIQTimeSeriesIntradaySubsampleListRequest Request Body (required)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postVendorChartIqTimeSeriesIntradaySubsampleList(PostVendorChartIQTimeSeriesIntradaySubsampleListRequest postVendorChartIQTimeSeriesIntradaySubsampleListRequest) throws ApiException {
    return postVendorChartIqTimeSeriesIntradaySubsampleListWithHttpInfo(postVendorChartIQTimeSeriesIntradaySubsampleListRequest).getData();
  }

  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postVendorChartIQTimeSeriesIntradaySubsampleListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postVendorChartIqTimeSeriesIntradaySubsampleListWithHttpInfo(PostVendorChartIQTimeSeriesIntradaySubsampleListRequest postVendorChartIQTimeSeriesIntradaySubsampleListRequest) throws ApiException {
    Object localVarPostBody = postVendorChartIQTimeSeriesIntradaySubsampleListRequest;
    
    // verify the required parameter 'postVendorChartIQTimeSeriesIntradaySubsampleListRequest' is set
    if (postVendorChartIQTimeSeriesIntradaySubsampleListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postVendorChartIQTimeSeriesIntradaySubsampleListRequest' when calling postVendorChartIqTimeSeriesIntradaySubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chart-iq/time-series/intraday/subsample/list";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIqTimeSeriesIntradaySubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIqTimeSeriesIntradaySubsampleListResponseTypeMap, false);

    return apiResponse;

  }
}
