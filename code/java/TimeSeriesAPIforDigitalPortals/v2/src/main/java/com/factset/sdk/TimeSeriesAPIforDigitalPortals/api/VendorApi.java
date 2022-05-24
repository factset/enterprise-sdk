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

import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2004;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorApi {
  private ApiClient apiClient;

  public VendorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VendorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getVendorChartIQTimeSeriesIntradaySubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getVendorChartIQTimeSeriesIntradaySubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postVendorChartIQTimeSeriesEodListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIQTimeSeriesEodListResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> postVendorChartIQTimeSeriesEodSubsampleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIQTimeSeriesEodSubsampleGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postVendorChartIQTimeSeriesEodSubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIQTimeSeriesEodSubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> postVendorChartIQTimeSeriesIntradaySubsampleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postVendorChartIQTimeSeriesIntradaySubsampleListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
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
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param id Identifier of the notation. (required)
   * @param from Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed. (required)
   * @param type Type of the price as configured for the customer. (optional, default to trade)
   * @param quality Quality of the price. (optional, default to DLY)
   * @param granularity Subsample granularities suitable for intraday data. (optional, default to 1h)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getVendorChartIQTimeSeriesIntradaySubsampleGet(String id, String from, String type, String quality, String granularity, java.util.Set<String> attributes) throws ApiException {
    return getVendorChartIQTimeSeriesIntradaySubsampleGetWithHttpInfo(id, from, type, quality, granularity, attributes).getData();
  }

  /**
   * Single subsample intraday data for a notation.
   * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
   * @param id Identifier of the notation. (required)
   * @param from Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed. (required)
   * @param type Type of the price as configured for the customer. (optional, default to trade)
   * @param quality Quality of the price. (optional, default to DLY)
   * @param granularity Subsample granularities suitable for intraday data. (optional, default to 1h)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getVendorChartIQTimeSeriesIntradaySubsampleGetWithHttpInfo(String id, String from, String type, String quality, String granularity, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVendorChartIQTimeSeriesIntradaySubsampleGet");
    }
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling getVendorChartIQTimeSeriesIntradaySubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chartIQ/timeSeries/intraday/subsample/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("VendorApi.getVendorChartIQTimeSeriesIntradaySubsampleGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getVendorChartIQTimeSeriesIntradaySubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.
   * @param body  (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postVendorChartIQTimeSeriesEodList(InlineObject body) throws ApiException {
    return postVendorChartIQTimeSeriesEodListWithHttpInfo(body).getData();
  }

  /**
   * End-of-day time series data for a notation.
   * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postVendorChartIQTimeSeriesEodListWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVendorChartIQTimeSeriesEodList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chartIQ/timeSeries/eod/list";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIQTimeSeriesEodList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIQTimeSeriesEodListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param body  (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postVendorChartIQTimeSeriesEodSubsampleGet(InlineObject1 body) throws ApiException {
    return postVendorChartIQTimeSeriesEodSubsampleGetWithHttpInfo(body).getData();
  }

  /**
   * Single subsample end-of-day data for a notation.
   * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postVendorChartIQTimeSeriesEodSubsampleGetWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVendorChartIQTimeSeriesEodSubsampleGet");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chartIQ/timeSeries/eod/subsample/get";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIQTimeSeriesEodSubsampleGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIQTimeSeriesEodSubsampleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.
   * @param body  (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postVendorChartIQTimeSeriesEodSubsampleList(InlineObject2 body) throws ApiException {
    return postVendorChartIQTimeSeriesEodSubsampleListWithHttpInfo(body).getData();
  }

  /**
   * Subsampled end-of-day time series data for a notation.
   * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postVendorChartIQTimeSeriesEodSubsampleListWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVendorChartIQTimeSeriesEodSubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chartIQ/timeSeries/eod/subsample/list";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIQTimeSeriesEodSubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIQTimeSeriesEodSubsampleListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.
   * @param body  (required)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postVendorChartIQTimeSeriesIntradaySubsampleList(InlineObject3 body) throws ApiException {
    return postVendorChartIQTimeSeriesIntradaySubsampleListWithHttpInfo(body).getData();
  }

  /**
   * Subsampled intraday time series data for a notation.
   * Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postVendorChartIQTimeSeriesIntradaySubsampleListWithHttpInfo(InlineObject3 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVendorChartIQTimeSeriesIntradaySubsampleList");
    }
    
    // create path and map variables
    String localVarPath = "/vendor/chartIQ/timeSeries/intraday/subsample/list";

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
      
    > apiResponse = apiClient.invokeAPI("VendorApi.postVendorChartIQTimeSeriesIntradaySubsampleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postVendorChartIQTimeSeriesIntradaySubsampleListResponseTypeMap, false);

    return apiResponse;

  }
}
