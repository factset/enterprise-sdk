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

import com.factset.sdk.FactSetMacroeconomics.models.ErrorResponse;
import com.factset.sdk.FactSetMacroeconomics.models.MetaEventsResponse;
import com.factset.sdk.FactSetMacroeconomics.models.MetaSeriesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReferenceDataApi {
  private ApiClient apiClient;

  public ReferenceDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEconomicEventReferenceDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEconomicEventReferenceDataResponseTypeMap.put(200, new GenericType<MetaEventsResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getEconomicEventReferenceDataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFdsCodeMappingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsCodeMappingResponseTypeMap.put(200, new GenericType<MetaSeriesResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getFdsCodeMappingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve reference data for events
   * Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.
   * @param type Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  (required)
   * @return MetaEventsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response containing reference data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public MetaEventsResponse getEconomicEventReferenceData(String type) throws ApiException {
    return getEconomicEventReferenceDataWithHttpInfo(type).getData();
  }

  /**
   * Retrieve reference data for events
   * Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.
   * @param type Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  (required)
   * @return ApiResponse&lt;MetaEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response containing reference data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetaEventsResponse> getEconomicEventReferenceDataWithHttpInfo(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getEconomicEventReferenceData");
    }
    
    // create path and map variables
    String localVarPath = "/meta/events";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        MetaEventsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceDataApi.getEconomicEventReferenceData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEconomicEventReferenceDataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve reference data for series
   * Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.
   * @param searchText Text to search for within series names. Restricts results to only series that match the provided search text. (optional)
   * @param category Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return MetaSeriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic series metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public MetaSeriesResponse getFdsCodeMapping(String searchText, java.util.List<String> category, String countryCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFdsCodeMappingWithHttpInfo(searchText, category, countryCode, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve reference data for series
   * Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.
   * @param searchText Text to search for within series names. Restricts results to only series that match the provided search text. (optional)
   * @param category Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return ApiResponse&lt;MetaSeriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic series metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetaSeriesResponse> getFdsCodeMappingWithHttpInfo(String searchText, java.util.List<String> category, String countryCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/meta/series";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
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
        
        MetaSeriesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceDataApi.getFdsCodeMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsCodeMappingResponseTypeMap, false);

    return apiResponse;

  }
}
