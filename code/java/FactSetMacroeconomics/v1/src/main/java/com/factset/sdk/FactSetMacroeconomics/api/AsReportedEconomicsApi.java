package com.factset.sdk.FactSetMacroeconomics.api;

import com.factset.sdk.FactSetMacroeconomics.ApiException;
import com.factset.sdk.FactSetMacroeconomics.ApiClient;
import com.factset.sdk.FactSetMacroeconomics.ApiResponse;
import com.factset.sdk.FactSetMacroeconomics.Configuration;
import com.factset.sdk.FactSetMacroeconomics.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetMacroeconomics.models.AsReportedEconomicsResponse;
import com.factset.sdk.FactSetMacroeconomics.models.ErrorResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AsReportedEconomicsApi {
  private ApiClient apiClient;

  public AsReportedEconomicsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AsReportedEconomicsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAsReportedEconomicsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAsReportedEconomicsResponseTypeMap.put(200, new GenericType<AsReportedEconomicsResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getAsReportedEconomicsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve as-reported economic time series data
   * Returns as-reported economic time series data for a given series ID, with optional frequency conversion and data transformation. Use &#x60;/meta/series&#x60; to discover available series IDs.
   * @param seriesId The Series ID identifying the economic series to retrieve. Use the &#x60;/meta/series&#x60; endpoint to get a list of available series IDs.  (required)
   * @param startDate Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  (optional)
   * @param endDate End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param frequency Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When &#x60;frequency&#x60; is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return AsReportedEconomicsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved as-reported economic data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public AsReportedEconomicsResponse getAsReportedEconomics(String seriesId, LocalDate startDate, LocalDate endDate, String countryCode, String frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getAsReportedEconomicsWithHttpInfo(seriesId, startDate, endDate, countryCode, frequency, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve as-reported economic time series data
   * Returns as-reported economic time series data for a given series ID, with optional frequency conversion and data transformation. Use &#x60;/meta/series&#x60; to discover available series IDs.
   * @param seriesId The Series ID identifying the economic series to retrieve. Use the &#x60;/meta/series&#x60; endpoint to get a list of available series IDs.  (required)
   * @param startDate Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  (optional)
   * @param endDate End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param frequency Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When &#x60;frequency&#x60; is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return ApiResponse&lt;AsReportedEconomicsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved as-reported economic data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AsReportedEconomicsResponse> getAsReportedEconomicsWithHttpInfo(String seriesId, LocalDate startDate, LocalDate endDate, String countryCode, String frequency, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'seriesId' is set
    if (seriesId == null) {
      throw new ApiException(400, "Missing the required parameter 'seriesId' when calling getAsReportedEconomics");
    }
    
    // create path and map variables
    String localVarPath = "/as-reported-economics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "seriesId", seriesId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        AsReportedEconomicsResponse
      
    > apiResponse = apiClient.invokeAPI("AsReportedEconomicsApi.getAsReportedEconomics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAsReportedEconomicsResponseTypeMap, false);

    return apiResponse;

  }
}
