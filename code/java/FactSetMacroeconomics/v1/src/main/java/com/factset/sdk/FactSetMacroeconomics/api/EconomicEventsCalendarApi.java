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
import com.factset.sdk.FactSetMacroeconomics.models.EventCountResponse;
import com.factset.sdk.FactSetMacroeconomics.models.EventResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EconomicEventsCalendarApi {
  private ApiClient apiClient;

  public EconomicEventsCalendarApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EconomicEventsCalendarApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEconomicEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEconomicEventsResponseTypeMap.put(200, new GenericType<EventResponse>(){});
    getEconomicEventsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getEconomicEventsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEconomicEventsCountResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEconomicEventsCountResponseTypeMap.put(200, new GenericType<EventCountResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getEconomicEventsCountResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve economic calendar events
   * Returns economic calendar events for a specified date range, with optional filtering by country, indicator, and FDS code. Use &#x60;/meta/events&#x60; to discover available filter values (indicators, countries, FDS codes).
   * @param fdsCode FDS code to filter events by a specific economic indicator. Use the &#x60;/meta/events?type&#x3D;fds-codes&#x60; endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
   * @param indicator Economic indicator name for filtering events. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param timeZone Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the &#x60;/meta/events?type&#x3D;TIMEZONES&#x60; endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  (optional, default to GMT)
   * @param startDate Start date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param endDate End date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param fields Comma-separated list of fields to include in the &#x60;items&#x60; array for each event. Common event fields (&#x60;requestedFdsCode&#x60;, &#x60;eventName&#x60;, &#x60;countryCode&#x60;, &#x60;indicator&#x60;) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | &#x60;eventDateTime&#x60; | Scheduled release date and time (UTC) | | &#x60;period&#x60; | Reference period covered by the data | | &#x60;actual&#x60; | Released actual value | | &#x60;prior&#x60; | Value from the prior period | | &#x60;consensus&#x60; | Consensus market estimate | | &#x60;surprise&#x60; | Difference between actual and consensus |  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return EventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic events. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public EventResponse getEconomicEvents(String fdsCode, String indicator, String countryCode, String timeZone, LocalDate startDate, LocalDate endDate, java.util.List<String> fields, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getEconomicEventsWithHttpInfo(fdsCode, indicator, countryCode, timeZone, startDate, endDate, fields, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve economic calendar events
   * Returns economic calendar events for a specified date range, with optional filtering by country, indicator, and FDS code. Use &#x60;/meta/events&#x60; to discover available filter values (indicators, countries, FDS codes).
   * @param fdsCode FDS code to filter events by a specific economic indicator. Use the &#x60;/meta/events?type&#x3D;fds-codes&#x60; endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
   * @param indicator Economic indicator name for filtering events. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
   * @param countryCode ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  (optional)
   * @param timeZone Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the &#x60;/meta/events?type&#x3D;TIMEZONES&#x60; endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  (optional, default to GMT)
   * @param startDate Start date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param endDate End date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param fields Comma-separated list of fields to include in the &#x60;items&#x60; array for each event. Common event fields (&#x60;requestedFdsCode&#x60;, &#x60;eventName&#x60;, &#x60;countryCode&#x60;, &#x60;indicator&#x60;) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | &#x60;eventDateTime&#x60; | Scheduled release date and time (UTC) | | &#x60;period&#x60; | Reference period covered by the data | | &#x60;actual&#x60; | Released actual value | | &#x60;prior&#x60; | Value from the prior period | | &#x60;consensus&#x60; | Consensus market estimate | | &#x60;surprise&#x60; | Difference between actual and consensus |  (optional)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return ApiResponse&lt;EventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic events. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventResponse> getEconomicEventsWithHttpInfo(String fdsCode, String indicator, String countryCode, String timeZone, LocalDate startDate, LocalDate endDate, java.util.List<String> fields, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/economic-events";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fdsCode", fdsCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indicator", indicator));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
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
        
        EventResponse
      
    > apiResponse = apiClient.invokeAPI("EconomicEventsCalendarApi.getEconomicEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEconomicEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve economic events count
   * Returns the number of economic events per calendar day for a specified date range. Weekends can be included or excluded via the &#x60;includeWeekends&#x60; parameter.  Note: The response includes only dates with one or more events. Dates with no events are omitted from the response. 
   * @param startDate Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param endDate End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param includeWeekends Returned daily counts include weekends by default. Set this to &#x60;false&#x60; to exclude weekends. (optional, default to true)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return EventCountResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic events count. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public EventCountResponse getEconomicEventsCount(LocalDate startDate, LocalDate endDate, Boolean includeWeekends, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getEconomicEventsCountWithHttpInfo(startDate, endDate, includeWeekends, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve economic events count
   * Returns the number of economic events per calendar day for a specified date range. Weekends can be included or excluded via the &#x60;includeWeekends&#x60; parameter.  Note: The response includes only dates with one or more events. Dates with no events are omitted from the response. 
   * @param startDate Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param endDate End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
   * @param includeWeekends Returned daily counts include weekends by default. Set this to &#x60;false&#x60; to exclude weekends. (optional, default to true)
   * @param paginationLimit Maximum number of results to return per page. If not specified, the default page size is applied.  (optional, default to 25)
   * @param paginationOffset Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  (optional, default to 0)
   * @return ApiResponse&lt;EventCountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully retrieved economic events count. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventCountResponse> getEconomicEventsCountWithHttpInfo(LocalDate startDate, LocalDate endDate, Boolean includeWeekends, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/event-count";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeWeekends", includeWeekends));
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
        
        EventCountResponse
      
    > apiResponse = apiClient.invokeAPI("EconomicEventsCalendarApi.getEconomicEventsCount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEconomicEventsCountResponseTypeMap, false);

    return apiResponse;

  }
}
