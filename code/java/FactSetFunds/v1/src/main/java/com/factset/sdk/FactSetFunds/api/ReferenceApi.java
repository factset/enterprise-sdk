package com.factset.sdk.FactSetFunds.api;

import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiResponse;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFunds.models.BenchmarkDetailsRequest;
import com.factset.sdk.FactSetFunds.models.BenchmarkDetailsResponse;
import com.factset.sdk.FactSetFunds.models.ClassificationsRequest;
import com.factset.sdk.FactSetFunds.models.ClassificationsResponse;
import com.factset.sdk.FactSetFunds.models.CostsFeesRequest;
import com.factset.sdk.FactSetFunds.models.CostsFeesResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.ManagersRequest;
import com.factset.sdk.FactSetFunds.models.ManagersResponse;
import com.factset.sdk.FactSetFunds.models.RelatedFundsRequest;
import com.factset.sdk.FactSetFunds.models.RelatedFundsResponse;
import com.factset.sdk.FactSetFunds.models.SummariesRequest;
import com.factset.sdk.FactSetFunds.models.SummariesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReferenceApi {
  private ApiClient apiClient;

  public ReferenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getFundsBenchmarkDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsBenchmarkDetailsResponseTypeMap.put(200, new GenericType<BenchmarkDetailsResponse>(){});
    getFundsBenchmarkDetailsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsBenchmarkDetailsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsBenchmarkDetailsForListResponseTypeMap.put(200, new GenericType<BenchmarkDetailsResponse>(){});
    getFundsBenchmarkDetailsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsBenchmarkDetailsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsClassificationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsClassificationsResponseTypeMap.put(200, new GenericType<ClassificationsResponse>(){});
    getFundsClassificationsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsClassificationsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsClassificationsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsClassificationsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsClassificationsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsClassificationsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsClassificationsForListResponseTypeMap.put(200, new GenericType<ClassificationsResponse>(){});
    getFundsClassificationsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsClassificationsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsClassificationsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsClassificationsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsClassificationsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsCostsFeesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsCostsFeesResponseTypeMap.put(200, new GenericType<CostsFeesResponse>(){});
    getFundsCostsFeesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsCostsFeesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsCostsFeesForListResponseTypeMap.put(200, new GenericType<CostsFeesResponse>(){});
    getFundsCostsFeesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsCostsFeesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsManagersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsManagersResponseTypeMap.put(200, new GenericType<ManagersResponse>(){});
    getFundsManagersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsManagersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsManagersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsManagersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsManagersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsManagersForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsManagersForListResponseTypeMap.put(200, new GenericType<ManagersResponse>(){});
    getFundsManagersForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsManagersForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsManagersForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsManagersForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsManagersForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsSummaryResponseTypeMap.put(200, new GenericType<SummariesResponse>(){});
    getFundsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFundsSummaryForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundsSummaryForListResponseTypeMap.put(200, new GenericType<SummariesResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundsSummaryForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getRelatedFundsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelatedFundsResponseTypeMap.put(200, new GenericType<RelatedFundsResponse>(){});
    getRelatedFundsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRelatedFundsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRelatedFundsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRelatedFundsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRelatedFundsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getRelatedFundsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelatedFundsForListResponseTypeMap.put(200, new GenericType<RelatedFundsResponse>(){});
    getRelatedFundsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRelatedFundsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRelatedFundsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRelatedFundsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRelatedFundsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get the Fund&#39;s Primary and Segment Benchmark Details
   * Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return BenchmarkDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Benchmark Details response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkDetailsResponse getFundsBenchmarkDetails(java.util.List<String> ids) throws ApiException {
    return getFundsBenchmarkDetailsWithHttpInfo(ids).getData();
  }

  /**
   * Get the Fund&#39;s Primary and Segment Benchmark Details
   * Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;BenchmarkDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Benchmark Details response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkDetailsResponse> getFundsBenchmarkDetailsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsBenchmarkDetails");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/benchmark-details";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BenchmarkDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsBenchmarkDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsBenchmarkDetailsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.
   * Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 
   * @param benchmarkDetailsRequest The Benchmark Details request body, allowing the user to specify a list of ids. (required)
   * @return BenchmarkDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Benchmark Details response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkDetailsResponse getFundsBenchmarkDetailsForList(BenchmarkDetailsRequest benchmarkDetailsRequest) throws ApiException {
    return getFundsBenchmarkDetailsForListWithHttpInfo(benchmarkDetailsRequest).getData();
  }

  /**
   * Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.
   * Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 
   * @param benchmarkDetailsRequest The Benchmark Details request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;BenchmarkDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Benchmark Details response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkDetailsResponse> getFundsBenchmarkDetailsForListWithHttpInfo(BenchmarkDetailsRequest benchmarkDetailsRequest) throws ApiException {
    Object localVarPostBody = benchmarkDetailsRequest;
    
    // verify the required parameter 'benchmarkDetailsRequest' is set
    if (benchmarkDetailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkDetailsRequest' when calling getFundsBenchmarkDetailsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/benchmark-details";

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
        
        BenchmarkDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsBenchmarkDetailsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsBenchmarkDetailsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic Fund Classifications
   * Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ClassificationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ClassificationsResponse getFundsClassifications(java.util.List<String> ids) throws ApiException {
    return getFundsClassificationsWithHttpInfo(ids).getData();
  }

  /**
   * Get basic Fund Classifications
   * Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;ClassificationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ClassificationsResponse> getFundsClassificationsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsClassifications");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/classifications";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ClassificationsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsClassifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsClassificationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic Fund Classifications for a large list of ids.
   * Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 
   * @param classificationsRequest The Classifications request body, allowing the user to specify a list of ids. (required)
   * @return ClassificationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Classifications response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ClassificationsResponse getFundsClassificationsForList(ClassificationsRequest classificationsRequest) throws ApiException {
    return getFundsClassificationsForListWithHttpInfo(classificationsRequest).getData();
  }

  /**
   * Get basic Fund Classifications for a large list of ids.
   * Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 
   * @param classificationsRequest The Classifications request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;ClassificationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Classifications response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ClassificationsResponse> getFundsClassificationsForListWithHttpInfo(ClassificationsRequest classificationsRequest) throws ApiException {
    Object localVarPostBody = classificationsRequest;
    
    // verify the required parameter 'classificationsRequest' is set
    if (classificationsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'classificationsRequest' when calling getFundsClassificationsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/classifications";

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
        
        ClassificationsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsClassificationsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsClassificationsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
   * Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. This subcategory includes management fees, 12b-1 fees, expense ratios, and several other data items. The value for each specified share class is expressed as a percentage of the AUM. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param date The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param currency Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional, default to LOCAL)
   * @return CostsFeesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Costs and Fees response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CostsFeesResponse getFundsCostsFees(java.util.List<String> ids, String date, String currency) throws ApiException {
    return getFundsCostsFeesWithHttpInfo(ids, date, currency).getData();
  }

  /**
   * Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
   * Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. This subcategory includes management fees, 12b-1 fees, expense ratios, and several other data items. The value for each specified share class is expressed as a percentage of the AUM. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param date The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param currency Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional, default to LOCAL)
   * @return ApiResponse&lt;CostsFeesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Costs and Fees response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CostsFeesResponse> getFundsCostsFeesWithHttpInfo(java.util.List<String> ids, String date, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsCostsFees");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/costs-fees";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CostsFeesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsCostsFees", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsCostsFeesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.
   * Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. Data Items include Expense Ratios, investment minimums and maximums, swing prices, entry and exit expenses, and more. 
   * @param costsFeesRequest The Costs and Fees request body, allowing the user to specify a list of ids. (required)
   * @return CostsFeesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Cost and Fees response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CostsFeesResponse getFundsCostsFeesForList(CostsFeesRequest costsFeesRequest) throws ApiException {
    return getFundsCostsFeesForListWithHttpInfo(costsFeesRequest).getData();
  }

  /**
   * Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.
   * Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. Data Items include Expense Ratios, investment minimums and maximums, swing prices, entry and exit expenses, and more. 
   * @param costsFeesRequest The Costs and Fees request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;CostsFeesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Cost and Fees response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CostsFeesResponse> getFundsCostsFeesForListWithHttpInfo(CostsFeesRequest costsFeesRequest) throws ApiException {
    Object localVarPostBody = costsFeesRequest;
    
    // verify the required parameter 'costsFeesRequest' is set
    if (costsFeesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'costsFeesRequest' when calling getFundsCostsFeesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/costs-fees";

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
        
        CostsFeesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsCostsFeesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsCostsFeesForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of Fund Managers and related details for a list of ids.
   * Fetch basic Fund manager details, such as Title, Phone, Job Id and Name. NOTE - A subscription to FactSet&#39;s Ownership product is required to access formulas in this Asset Managers subcategory. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ManagersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Managers response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ManagersResponse getFundsManagers(java.util.List<String> ids) throws ApiException {
    return getFundsManagersWithHttpInfo(ids).getData();
  }

  /**
   * Get a list of Fund Managers and related details for a list of ids.
   * Fetch basic Fund manager details, such as Title, Phone, Job Id and Name. NOTE - A subscription to FactSet&#39;s Ownership product is required to access formulas in this Asset Managers subcategory. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;ManagersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Managers response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ManagersResponse> getFundsManagersWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsManagers");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/managers";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ManagersResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsManagers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsManagersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of Fund Managers and related details for a large list of ids.
   * Fetch basic Fund manager details, such as Title, Phone, Job Id and Name.  
   * @param managersRequest The Funds Managers request body, allowing the user to specify a list of ids. (required)
   * @return ManagersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Managers response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ManagersResponse getFundsManagersForList(ManagersRequest managersRequest) throws ApiException {
    return getFundsManagersForListWithHttpInfo(managersRequest).getData();
  }

  /**
   * Get a list of Fund Managers and related details for a large list of ids.
   * Fetch basic Fund manager details, such as Title, Phone, Job Id and Name.  
   * @param managersRequest The Funds Managers request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;ManagersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Managers response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ManagersResponse> getFundsManagersForListWithHttpInfo(ManagersRequest managersRequest) throws ApiException {
    Object localVarPostBody = managersRequest;
    
    // verify the required parameter 'managersRequest' is set
    if (managersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'managersRequest' when calling getFundsManagersForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/managers";

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
        
        ManagersResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsManagersForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsManagersForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic reference summary data for a Fund.
   * Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return SummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SummariesResponse getFundsSummary(java.util.List<String> ids) throws ApiException {
    return getFundsSummaryWithHttpInfo(ids).getData();
  }

  /**
   * Get basic reference summary data for a Fund.
   * Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;SummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fund Summaries response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummariesResponse> getFundsSummaryWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SummariesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get basic reference data for a large list of Fund ids.
   * Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  
   * @param summariesRequest The Funds Summary request body, allowing the user to specify a list of ids. (required)
   * @return SummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Summary response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SummariesResponse getFundsSummaryForList(SummariesRequest summariesRequest) throws ApiException {
    return getFundsSummaryForListWithHttpInfo(summariesRequest).getData();
  }

  /**
   * Get basic reference data for a large list of Fund ids.
   * Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  
   * @param summariesRequest The Funds Summary request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;SummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Funds Summary response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummariesResponse> getFundsSummaryForListWithHttpInfo(SummariesRequest summariesRequest) throws ApiException {
    Object localVarPostBody = summariesRequest;
    
    // verify the required parameter 'summariesRequest' is set
    if (summariesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'summariesRequest' when calling getFundsSummaryForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/summary";

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
        
        SummariesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getFundsSummaryForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundsSummaryForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of Related Funds for a list of Fund ids.
   * Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return RelatedFundsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Related Funds response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelatedFundsResponse getRelatedFunds(java.util.List<String> ids) throws ApiException {
    return getRelatedFundsWithHttpInfo(ids).getData();
  }

  /**
   * Get a list of Related Funds for a list of Fund ids.
   * Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;RelatedFundsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Related Funds response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelatedFundsResponse> getRelatedFundsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRelatedFunds");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/related-funds";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RelatedFundsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getRelatedFunds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelatedFundsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of Related Funds for a large list of Fund ids.
   * Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 
   * @param relatedFundsRequest The Related Funds request body, allowing the user to specify a list of ids. (required)
   * @return RelatedFundsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Related Funds response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelatedFundsResponse getRelatedFundsForList(RelatedFundsRequest relatedFundsRequest) throws ApiException {
    return getRelatedFundsForListWithHttpInfo(relatedFundsRequest).getData();
  }

  /**
   * Get a list of Related Funds for a large list of Fund ids.
   * Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 
   * @param relatedFundsRequest The Related Funds request body, allowing the user to specify a list of ids. (required)
   * @return ApiResponse&lt;RelatedFundsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Related Funds response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelatedFundsResponse> getRelatedFundsForListWithHttpInfo(RelatedFundsRequest relatedFundsRequest) throws ApiException {
    Object localVarPostBody = relatedFundsRequest;
    
    // verify the required parameter 'relatedFundsRequest' is set
    if (relatedFundsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'relatedFundsRequest' when calling getRelatedFundsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/related-funds";

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
        
        RelatedFundsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getRelatedFundsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelatedFundsForListResponseTypeMap, false);

    return apiResponse;

  }
}
