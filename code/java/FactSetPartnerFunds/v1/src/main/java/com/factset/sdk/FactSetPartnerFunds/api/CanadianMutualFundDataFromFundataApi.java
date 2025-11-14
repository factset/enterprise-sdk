package com.factset.sdk.FactSetPartnerFunds.api;

import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiResponse;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPartnerFunds.models.AssetAllocationsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.DistributionsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.ErrorResponse;
import com.factset.sdk.FactSetPartnerFunds.models.FeesResponse;
import com.factset.sdk.FactSetPartnerFunds.models.GeoAllocationsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.GrowthOfTenKResponse;
import com.factset.sdk.FactSetPartnerFunds.models.HoldingsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.PerformanceRankingsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.PerformanceReturnsResponse;
import com.factset.sdk.FactSetPartnerFunds.models.ProfileResponse;
import com.factset.sdk.FactSetPartnerFunds.models.RiskResponse;
import com.factset.sdk.FactSetPartnerFunds.models.SectorAllocationsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CanadianMutualFundDataFromFundataApi {
  private ApiClient apiClient;

  public CanadianMutualFundDataFromFundataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CanadianMutualFundDataFromFundataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAssetAllocationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAssetAllocationsResponseTypeMap.put(200, new GenericType<AssetAllocationsResponse>(){});
    getAssetAllocationsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getAssetAllocationsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getAssetAllocationsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getAssetAllocationsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getAssetAllocationsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDistributionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDistributionResponseTypeMap.put(200, new GenericType<DistributionsResponse>(){});
    getDistributionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDistributionResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDistributionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDistributionResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDistributionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFeesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFeesResponseTypeMap.put(200, new GenericType<FeesResponse>(){});
    getFeesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFeesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFeesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFeesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFeesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getGeographicAllocationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGeographicAllocationsResponseTypeMap.put(200, new GenericType<GeoAllocationsResponse>(){});
    getGeographicAllocationsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGeographicAllocationsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGeographicAllocationsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGeographicAllocationsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGeographicAllocationsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getGrowthOfTenKResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGrowthOfTenKResponseTypeMap.put(200, new GenericType<GrowthOfTenKResponse>(){});
    getGrowthOfTenKResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGrowthOfTenKResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGrowthOfTenKResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGrowthOfTenKResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGrowthOfTenKResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getHoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getHoldingsResponseTypeMap.put(200, new GenericType<HoldingsResponse>(){});
    getHoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getHoldingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getHoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getHoldingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getHoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getProfileResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProfileResponseTypeMap.put(200, new GenericType<ProfileResponse>(){});
    getProfileResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getProfileResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getProfileResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getProfileResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getProfileResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getRankingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRankingsResponseTypeMap.put(200, new GenericType<PerformanceRankingsResponse>(){});
    getRankingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRankingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRankingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRankingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRankingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getReturnsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getReturnsResponseTypeMap.put(200, new GenericType<PerformanceReturnsResponse>(){});
    getReturnsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getReturnsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getReturnsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getReturnsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getReturnsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getRiskResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRiskResponseTypeMap.put(200, new GenericType<RiskResponse>(){});
    getRiskResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRiskResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRiskResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRiskResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRiskResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSectorAllocationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSectorAllocationsResponseTypeMap.put(200, new GenericType<SectorAllocationsResponse>(){});
    getSectorAllocationsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSectorAllocationsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSectorAllocationsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSectorAllocationsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSectorAllocationsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Fund asset allocations
   * This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return AssetAllocationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The asset allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AssetAllocationsResponse getAssetAllocations(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    return getAssetAllocationsWithHttpInfo(ids, language, sort).getData();
  }

  /**
   * Fund asset allocations
   * This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return ApiResponse&lt;AssetAllocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The asset allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AssetAllocationsResponse> getAssetAllocationsWithHttpInfo(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getAssetAllocations");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/asset-allocations";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
        
        AssetAllocationsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getAssetAllocations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAssetAllocationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund distributions
   * This endpoint provides distribution data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return DistributionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The distribution response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DistributionsResponse getDistribution(java.util.List<String> ids) throws ApiException {
    return getDistributionWithHttpInfo(ids).getData();
  }

  /**
   * Fund distributions
   * This endpoint provides distribution data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return ApiResponse&lt;DistributionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The distribution response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DistributionsResponse> getDistributionWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getDistribution");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/distribution";

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
        
        DistributionsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getDistribution", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDistributionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund fees
   * This endpoint provides fees data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @return FeesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fees response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FeesResponse getFees(java.util.List<String> ids, String language) throws ApiException {
    return getFeesWithHttpInfo(ids, language).getData();
  }

  /**
   * Fund fees
   * This endpoint provides fees data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @return ApiResponse&lt;FeesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fees response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FeesResponse> getFeesWithHttpInfo(java.util.List<String> ids, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFees");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/fees";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FeesResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getFees", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFeesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund geographic allocations
   * This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return GeoAllocationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The geographic allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GeoAllocationsResponse getGeographicAllocations(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    return getGeographicAllocationsWithHttpInfo(ids, language, sort).getData();
  }

  /**
   * Fund geographic allocations
   * This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return ApiResponse&lt;GeoAllocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The geographic allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GeoAllocationsResponse> getGeographicAllocationsWithHttpInfo(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGeographicAllocations");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/geographic-allocations";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
        
        GeoAllocationsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getGeographicAllocations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGeographicAllocationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund growth of 10K
   * This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param timePeriod Periodicity or frequency of the fiscal period. (optional, default to 1Y)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return GrowthOfTenKResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The growth of 10K response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GrowthOfTenKResponse getGrowthOfTenK(java.util.List<String> ids, String timePeriod, java.util.List<String> sort) throws ApiException {
    return getGrowthOfTenKWithHttpInfo(ids, timePeriod, sort).getData();
  }

  /**
   * Fund growth of 10K
   * This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param timePeriod Periodicity or frequency of the fiscal period. (optional, default to 1Y)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return ApiResponse&lt;GrowthOfTenKResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The growth of 10K response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GrowthOfTenKResponse> getGrowthOfTenKWithHttpInfo(java.util.List<String> ids, String timePeriod, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGrowthOfTenK");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/growth-of-10k";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timePeriod", timePeriod));
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
        
        GrowthOfTenKResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getGrowthOfTenK", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGrowthOfTenKResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund holdings
   * This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return HoldingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The holdings response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public HoldingsResponse getHoldings(java.util.List<String> ids) throws ApiException {
    return getHoldingsWithHttpInfo(ids).getData();
  }

  /**
   * Fund holdings
   * This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return ApiResponse&lt;HoldingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The holdings response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HoldingsResponse> getHoldingsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getHoldings");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/holdings";

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
        
        HoldingsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getHoldings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getHoldingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund profile
   * This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund profile response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ProfileResponse getProfile(java.util.List<String> ids, String language) throws ApiException {
    return getProfileWithHttpInfo(ids, language).getData();
  }

  /**
   * Fund profile
   * This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund profile response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> getProfileWithHttpInfo(java.util.List<String> ids, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getProfile");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/profile";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProfileResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProfileResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund rankings
   * This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return PerformanceRankingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund rankings response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PerformanceRankingsResponse getRankings(java.util.List<String> ids) throws ApiException {
    return getRankingsWithHttpInfo(ids).getData();
  }

  /**
   * Fund rankings
   * This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return ApiResponse&lt;PerformanceRankingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund rankings response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PerformanceRankingsResponse> getRankingsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRankings");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/rankings";

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
        
        PerformanceRankingsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getRankings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRankingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund returns
   * This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized. 
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return PerformanceReturnsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund returns response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PerformanceReturnsResponse getReturns(java.util.List<String> ids) throws ApiException {
    return getReturnsWithHttpInfo(ids).getData();
  }

  /**
   * Fund returns
   * This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized. 
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @return ApiResponse&lt;PerformanceReturnsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund returns response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PerformanceReturnsResponse> getReturnsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getReturns");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/returns";

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
        
        PerformanceReturnsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getReturns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getReturnsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund risk
   * This endpoint provides risk data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param numYears Number of years of risk data to return.  (optional, default to 5)
   * @return RiskResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The risk response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RiskResponse getRisk(java.util.List<String> ids, String language, Integer numYears) throws ApiException {
    return getRiskWithHttpInfo(ids, language, numYears).getData();
  }

  /**
   * Fund risk
   * This endpoint provides risk data for Canadian mutual funds.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param numYears Number of years of risk data to return.  (optional, default to 5)
   * @return ApiResponse&lt;RiskResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The risk response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RiskResponse> getRiskWithHttpInfo(java.util.List<String> ids, String language, Integer numYears) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRisk");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/risk";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numYears", numYears));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RiskResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getRisk", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRiskResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fund sector allocations
   * This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return SectorAllocationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund sector allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SectorAllocationsResponse getSectorAllocations(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    return getSectorAllocationsWithHttpInfo(ids, language, sort).getData();
  }

  /**
   * Fund sector allocations
   * This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.
   * @param ids The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; (required)
   * @param language Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. (optional, default to EN)
   * @param sort Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. (optional, default to [\&quot;-weight\&quot;])
   * @return ApiResponse&lt;SectorAllocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The fund sector allocation response object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SectorAllocationsResponse> getSectorAllocationsWithHttpInfo(java.util.List<String> ids, String language, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSectorAllocations");
    }
    
    // create path and map variables
    String localVarPath = "/fundata/sector-allocations";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
        
        SectorAllocationsResponse
      
    > apiResponse = apiClient.invokeAPI("CanadianMutualFundDataFromFundataApi.getSectorAllocations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSectorAllocationsResponseTypeMap, false);

    return apiResponse;

  }
}
