package com.factset.sdk.Cabot.api;

import com.factset.sdk.Cabot.ApiException;
import com.factset.sdk.Cabot.ApiClient;
import com.factset.sdk.Cabot.ApiResponse;
import com.factset.sdk.Cabot.Configuration;
import com.factset.sdk.Cabot.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Cabot.models.Attributes;
import com.factset.sdk.Cabot.models.ClientErrorResponse;
import com.factset.sdk.Cabot.models.Regions;
import com.factset.sdk.Cabot.models.Sectors;
import com.factset.sdk.Cabot.models.SellTimingResponseRoot;
import com.factset.sdk.Cabot.models.StopLossResponseRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SellingModelsApi {
  private ApiClient apiClient;

  public SellingModelsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SellingModelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSellTimingModelAnalyticResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSellTimingModelAnalyticResponseTypeMap.put(200, new GenericType<SellTimingResponseRoot>(){});
    getSellTimingModelAnalyticResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getSellTimingModelAnalyticResponseTypeMap.put(404, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getStopLossModelAnalyticResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStopLossModelAnalyticResponseTypeMap.put(200, new GenericType<StopLossResponseRoot>(){});
    getStopLossModelAnalyticResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getStopLossModelAnalyticResponseTypeMap.put(404, new GenericType<ClientErrorResponse>(){});
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
   * Cabot main path for Sell Timing API
   * Cabot main path for Sell Timing API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param period For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; (required)
   * @param attribute The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param sector Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param region Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @return SellTimingResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public SellTimingResponseRoot getSellTimingModelAnalytic(String accountPath, String benchmarkPath, String period, Attributes attribute, Sectors sector, Regions region) throws ApiException {
    return getSellTimingModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, attribute, sector, region).getData();
  }

  /**
   * Cabot main path for Sell Timing API
   * Cabot main path for Sell Timing API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param period For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; (required)
   * @param attribute The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param sector Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param region Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @return ApiResponse&lt;SellTimingResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SellTimingResponseRoot> getSellTimingModelAnalyticWithHttpInfo(String accountPath, String benchmarkPath, String period, Attributes attribute, Sectors sector, Regions region) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountPath' is set
    if (accountPath == null) {
      throw new ApiException(400, "Missing the required parameter 'accountPath' when calling getSellTimingModelAnalytic");
    }
    
    // verify the required parameter 'benchmarkPath' is set
    if (benchmarkPath == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkPath' when calling getSellTimingModelAnalytic");
    }
    
    // verify the required parameter 'period' is set
    if (period == null) {
      throw new ApiException(400, "Missing the required parameter 'period' when calling getSellTimingModelAnalytic");
    }
    
    // create path and map variables
    String localVarPath = "/models/sell-timing";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountPath", accountPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "benchmarkPath", benchmarkPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attribute", attribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sector", sector));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", region));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SellTimingResponseRoot
      
    > apiResponse = apiClient.invokeAPI("SellingModelsApi.getSellTimingModelAnalytic", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSellTimingModelAnalyticResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Cabot main path for Stop Loss API
   * Cabot main path for Stop Loss API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param period For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; (required)
   * @param attribute The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param sector Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param region Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @return StopLossResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public StopLossResponseRoot getStopLossModelAnalytic(String accountPath, String benchmarkPath, String period, Attributes attribute, Sectors sector, Regions region) throws ApiException {
    return getStopLossModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, attribute, sector, region).getData();
  }

  /**
   * Cabot main path for Stop Loss API
   * Cabot main path for Stop Loss API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param period For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; (required)
   * @param attribute The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param sector Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @param region Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; (optional)
   * @return ApiResponse&lt;StopLossResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<StopLossResponseRoot> getStopLossModelAnalyticWithHttpInfo(String accountPath, String benchmarkPath, String period, Attributes attribute, Sectors sector, Regions region) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountPath' is set
    if (accountPath == null) {
      throw new ApiException(400, "Missing the required parameter 'accountPath' when calling getStopLossModelAnalytic");
    }
    
    // verify the required parameter 'benchmarkPath' is set
    if (benchmarkPath == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkPath' when calling getStopLossModelAnalytic");
    }
    
    // verify the required parameter 'period' is set
    if (period == null) {
      throw new ApiException(400, "Missing the required parameter 'period' when calling getStopLossModelAnalytic");
    }
    
    // create path and map variables
    String localVarPath = "/models/stop-loss";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountPath", accountPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "benchmarkPath", benchmarkPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attribute", attribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sector", sector));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", region));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StopLossResponseRoot
      
    > apiResponse = apiClient.invokeAPI("SellingModelsApi.getStopLossModelAnalytic", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStopLossModelAnalyticResponseTypeMap, false);

    return apiResponse;

  }
}
