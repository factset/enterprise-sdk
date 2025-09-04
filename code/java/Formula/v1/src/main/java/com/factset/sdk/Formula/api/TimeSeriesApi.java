package com.factset.sdk.Formula.api;

import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiResponse;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Formula.models.BatchStatusResponse;
import com.factset.sdk.Formula.models.ErrorDetail;
import com.factset.sdk.Formula.models.TimeSeriesRequest;
import com.factset.sdk.Formula.models.TimeSeriesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TimeSeriesApi {
  private ApiClient apiClient;

  public TimeSeriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TimeSeriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTimeSeriesDataForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimeSeriesDataForListResponseTypeMap.put(200, new GenericType<TimeSeriesResponse>(){});
    getTimeSeriesDataForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getTimeSeriesDataForListResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(413, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(429, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getTimeSeriesDataForListResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }

  
 /**
   * Wrapper to support POST /time-series returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code TimeSeriesResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetTimeSeriesDataForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     TimeSeriesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetTimeSeriesDataForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTimeSeriesDataForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public TimeSeriesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (TimeSeriesResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetTimeSeriesDataForListResponseWrapper other = (GetTimeSeriesDataForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTimeSeriesDataForListResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param timeSeriesRequest  (required)
   * @return GetTimeSeriesDataForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetTimeSeriesDataForListResponseWrapper getTimeSeriesDataForList(TimeSeriesRequest timeSeriesRequest) throws ApiException {
    return getTimeSeriesDataForListWithHttpInfo(timeSeriesRequest).getData();
  }

  /**
   * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
   * The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 
   * @param timeSeriesRequest  (required)
   * @return ApiResponse&lt;GetTimeSeriesDataForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetTimeSeriesDataForListResponseWrapper> getTimeSeriesDataForListWithHttpInfo(TimeSeriesRequest timeSeriesRequest) throws ApiException {
    Object localVarPostBody = timeSeriesRequest;
    
    // verify the required parameter 'timeSeriesRequest' is set
    if (timeSeriesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'timeSeriesRequest' when calling getTimeSeriesDataForList");
    }
    
    // create path and map variables
    String localVarPath = "/time-series";

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("TimeSeriesApi.getTimeSeriesDataForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimeSeriesDataForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTimeSeriesDataForListResponseWrapper responseWrapper = new GetTimeSeriesDataForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTimeSeriesDataForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
