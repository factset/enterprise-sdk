package com.factset.sdk.FactSetGeoRev.api;

import com.factset.sdk.FactSetGeoRev.ApiException;
import com.factset.sdk.FactSetGeoRev.ApiClient;
import com.factset.sdk.FactSetGeoRev.ApiResponse;
import com.factset.sdk.FactSetGeoRev.Configuration;
import com.factset.sdk.FactSetGeoRev.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.FactSetGeoRev.models.ErrorResponse;
import com.factset.sdk.FactSetGeoRev.models.RegionRequest;
import com.factset.sdk.FactSetGeoRev.models.RegionResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegionsApi {
  private ApiClient apiClient;

  public RegionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Gets the revenue details for the requested Regions
   * Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.* 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  300 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param regionIds The Regional Identifier or Regional Group. Groups include \&quot;SUPER_REGIONS\&quot;, \&quot;REGIONS\&quot;, and \&quot;AREAS\&quot;. When requesting a group, all regionIds within that group will be requested. To limit or specify select regions returned in the response, provide a comma-separated list of the below regionIds. |Regional Group|regionId|Descriptions| |---|---|---| |Group|SUPER_REGIONS|Fetchs all regionIds for Super Regions| |Group|REGIONS|Fetchs all regionIds for Regions| |Group|AREAS|Fetchs all regionIds for Areas|  |Level|regionId|Parent|Description|Level|regionId|Parent|Description| |---|---|---|---|---|---|---|---| |__**Super Region**__||||__**Area**__|||| |Super Region|R1|R100|Africa and Middle East|Area|R3|R2|Eastern Africa| |Super Region|R101|R100|Americas|Area|R18|R2|Southern Africa| |Super Region|R170|R100|Asia/Pacific|Area|R45|R2|Western Africa| |Super Region|R274|R100|Europe|Area|R69|R68|Central Middle East| |Super Region|R349|R100|Non-Disclosed Revenue|Area|R87|R68|Eastern Middle East| |Super Region|R354|R100|No Operations|Area|R97|R68|Western Middle East| |Super Region|R393|R100|Non-Geographic Revenue|Area|R103|R102|Caribbean| |__**Region**__||||Area|R135|R102|Central America| |Region|R2|R1|Africa|Area|R145|R102|South America| |Region|R68|R1|Middle East|Area|R165|R164|Other North America| |Region|R102|R101|Latin America|Area|R167|R164|United States and Canada| |Region|R164|R101|North America|Area|R172|R171|Far East| |Region|R171|R170|Asia|Area|R219|R171|Indian Region| |Region|R233|R170|Oceania|Area|R234|R233|Australia and New Zealand| |Region|R275|R274|European Union|Area|R237|R233|Pacific Islands| |Region|R314|R274|Non-European Union|Area|R276|R275|Eastern European Union| |Region|R350|R349|Region Unspecified|Area|R286|R275|Northern European Union| |Region|R355|R354|Non-Operating Region|Area|R292|R275|Southern European Union| |Region|R394|R393|Non-Geographic Revenue Region|Area|R298|R275|Western European Union| |Region|R398|R1|Africa and Middle East Unallocated Region|Area|R315|R314|Eastern Non-European Union| |Region|R401|R170|Asia/Pacific Unallocated Region|Area|R323|R314|Northern Non-European Union| |Region|R404|R101|Americas Unallocated Revenue Region|Area|R328|R314|Southern Non-European Union| |Region|R407|R274|Europe Unallocated Region|Area|R340|R314|Western Non-European Union| |||||Area|R351|R350|Area Unspecified| |||||Area|R356|R355|Non-Operating Area| |||||Area|R395|R394|Non-Geographic Revenue Area| |||||Area|R399|R398|Africa and Middle East Unallocated Area|  (optional, default to [\&quot;SUPER_REGIONS\&quot;])
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     (optional, default to FY)
   * @param currency Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return RegionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RegionResponse getRegions(java.util.List<String> ids, java.util.List<String> regionIds, String startDate, String endDate, String frequency, String currency) throws ApiException {
    return getRegionsWithHttpInfo(ids, regionIds, startDate, endDate, frequency, currency).getData();
  }

  /**
   * Gets the revenue details for the requested Regions
   * Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.* 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  300 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param regionIds The Regional Identifier or Regional Group. Groups include \&quot;SUPER_REGIONS\&quot;, \&quot;REGIONS\&quot;, and \&quot;AREAS\&quot;. When requesting a group, all regionIds within that group will be requested. To limit or specify select regions returned in the response, provide a comma-separated list of the below regionIds. |Regional Group|regionId|Descriptions| |---|---|---| |Group|SUPER_REGIONS|Fetchs all regionIds for Super Regions| |Group|REGIONS|Fetchs all regionIds for Regions| |Group|AREAS|Fetchs all regionIds for Areas|  |Level|regionId|Parent|Description|Level|regionId|Parent|Description| |---|---|---|---|---|---|---|---| |__**Super Region**__||||__**Area**__|||| |Super Region|R1|R100|Africa and Middle East|Area|R3|R2|Eastern Africa| |Super Region|R101|R100|Americas|Area|R18|R2|Southern Africa| |Super Region|R170|R100|Asia/Pacific|Area|R45|R2|Western Africa| |Super Region|R274|R100|Europe|Area|R69|R68|Central Middle East| |Super Region|R349|R100|Non-Disclosed Revenue|Area|R87|R68|Eastern Middle East| |Super Region|R354|R100|No Operations|Area|R97|R68|Western Middle East| |Super Region|R393|R100|Non-Geographic Revenue|Area|R103|R102|Caribbean| |__**Region**__||||Area|R135|R102|Central America| |Region|R2|R1|Africa|Area|R145|R102|South America| |Region|R68|R1|Middle East|Area|R165|R164|Other North America| |Region|R102|R101|Latin America|Area|R167|R164|United States and Canada| |Region|R164|R101|North America|Area|R172|R171|Far East| |Region|R171|R170|Asia|Area|R219|R171|Indian Region| |Region|R233|R170|Oceania|Area|R234|R233|Australia and New Zealand| |Region|R275|R274|European Union|Area|R237|R233|Pacific Islands| |Region|R314|R274|Non-European Union|Area|R276|R275|Eastern European Union| |Region|R350|R349|Region Unspecified|Area|R286|R275|Northern European Union| |Region|R355|R354|Non-Operating Region|Area|R292|R275|Southern European Union| |Region|R394|R393|Non-Geographic Revenue Region|Area|R298|R275|Western European Union| |Region|R398|R1|Africa and Middle East Unallocated Region|Area|R315|R314|Eastern Non-European Union| |Region|R401|R170|Asia/Pacific Unallocated Region|Area|R323|R314|Northern Non-European Union| |Region|R404|R101|Americas Unallocated Revenue Region|Area|R328|R314|Southern Non-European Union| |Region|R407|R274|Europe Unallocated Region|Area|R340|R314|Western Non-European Union| |||||Area|R351|R350|Area Unspecified| |||||Area|R356|R355|Non-Operating Area| |||||Area|R395|R394|Non-Geographic Revenue Area| |||||Area|R399|R398|Africa and Middle East Unallocated Area|  (optional, default to [\&quot;SUPER_REGIONS\&quot;])
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     (optional, default to FY)
   * @param currency Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return ApiResponse&lt;RegionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegionResponse> getRegionsWithHttpInfo(java.util.List<String> ids, java.util.List<String> regionIds, String startDate, String endDate, String frequency, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRegions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-georev/v1/regions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "regionIds", regionIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<RegionResponse> localVarReturnType = new GenericType<RegionResponse>() {};

    return apiClient.invokeAPI("RegionsApi.getRegions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets the revenue details for the requested Regions. Use for large lists of company ids.
   * Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.* 
   * @param regionRequest The Region request body, allowing the user to specify a list of ids, time range, and regionIds. (required)
   * @return RegionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RegionResponse getRegionsForList(RegionRequest regionRequest) throws ApiException {
    return getRegionsForListWithHttpInfo(regionRequest).getData();
  }

  /**
   * Gets the revenue details for the requested Regions. Use for large lists of company ids.
   * Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.* 
   * @param regionRequest The Region request body, allowing the user to specify a list of ids, time range, and regionIds. (required)
   * @return ApiResponse&lt;RegionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegionResponse> getRegionsForListWithHttpInfo(RegionRequest regionRequest) throws ApiException {
    Object localVarPostBody = regionRequest;
    
    // verify the required parameter 'regionRequest' is set
    if (regionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'regionRequest' when calling getRegionsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-georev/v1/regions";

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

    GenericType<RegionResponse> localVarReturnType = new GenericType<RegionResponse>() {};

    return apiClient.invokeAPI("RegionsApi.getRegionsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
