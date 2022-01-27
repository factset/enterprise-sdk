package com.factset.sdk.FactSetPrices.api;

import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiResponse;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.FactSetPrices.models.ErrorResponse;
import com.factset.sdk.FactSetPrices.models.RolloverResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatabaseRolloverApi {
  private ApiClient apiClient;

  public DatabaseRolloverApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DatabaseRolloverApi(ApiClient apiClient) {
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
   * Gets the latest relative rollover date for the database.
   * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 
   * @return RolloverResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Database rollover data items. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RolloverResponse getDatabaseRollover() throws ApiException {
    return getDatabaseRolloverWithHttpInfo().getData();
  }

  /**
   * Gets the latest relative rollover date for the database.
   * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 
   * @return ApiResponse&lt;RolloverResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Database rollover data items. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RolloverResponse> getDatabaseRolloverWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/database-rollover";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<RolloverResponse> localVarReturnType = new GenericType<RolloverResponse>() {};

    return apiClient.invokeAPI("DatabaseRolloverApi.getDatabaseRollover", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets the latest relative rollover date for the database.
   * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 
   * @return RolloverResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Database rollover data items. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RolloverResponse getDatabaseRolloverForList() throws ApiException {
    return getDatabaseRolloverForListWithHttpInfo().getData();
  }

  /**
   * Gets the latest relative rollover date for the database.
   * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 
   * @return ApiResponse&lt;RolloverResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Database rollover data items. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RolloverResponse> getDatabaseRolloverForListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-prices/v1/database-rollover";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<RolloverResponse> localVarReturnType = new GenericType<RolloverResponse>() {};

    return apiClient.invokeAPI("DatabaseRolloverApi.getDatabaseRolloverForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
