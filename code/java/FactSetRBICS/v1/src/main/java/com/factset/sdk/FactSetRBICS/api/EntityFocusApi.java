package com.factset.sdk.FactSetRBICS.api;

import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiResponse;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetRBICS.models.EntityFocusRequest;
import com.factset.sdk.FactSetRBICS.models.EntityFocusResponse;
import com.factset.sdk.FactSetRBICS.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityFocusApi {
  private ApiClient apiClient;

  public EntityFocusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityFocusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getRbicsEntityFocusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsEntityFocusResponseTypeMap.put(200, new GenericType<EntityFocusResponse>(){});
    getRbicsEntityFocusResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRbicsEntityFocusResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRbicsEntityFocusResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRbicsEntityFocusResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRbicsEntityFocusResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getRbicsEntityFocusForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRbicsEntityFocusForListResponseTypeMap.put(200, new GenericType<EntityFocusResponse>(){});
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
   * Get RBICS classification for the Focus industry
   * Gets RBICS classifications for the Focus industry for a short list of companies. Full history is included if _date_ parameter is not specified.      RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  
   * @param ids List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  (required)
   * @param date Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. (optional)
   * @param levels List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** (optional)
   * @param includeNames Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. (optional, default to true)
   * @return EntityFocusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Focus Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityFocusResponse getRbicsEntityFocus(java.util.List<String> ids, String date, java.util.Set<Integer> levels, Boolean includeNames) throws ApiException {
    return getRbicsEntityFocusWithHttpInfo(ids, date, levels, includeNames).getData();
  }

  /**
   * Get RBICS classification for the Focus industry
   * Gets RBICS classifications for the Focus industry for a short list of companies. Full history is included if _date_ parameter is not specified.      RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  
   * @param ids List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  (required)
   * @param date Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. (optional)
   * @param levels List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** (optional)
   * @param includeNames Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. (optional, default to true)
   * @return ApiResponse&lt;EntityFocusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Focus Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityFocusResponse> getRbicsEntityFocusWithHttpInfo(java.util.List<String> ids, String date, java.util.Set<Integer> levels, Boolean includeNames) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRbicsEntityFocus");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/entity-focus";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "levels", levels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeNames", includeNames));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityFocusResponse
      
    > apiResponse = apiClient.invokeAPI("EntityFocusApi.getRbicsEntityFocus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsEntityFocusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get RBICS classification for the Focus industry
   * Gets RBICS classifications for the Focus industry for a long list of companies. Full history is included if _date_ parameter is not specified.              RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  
   * @param entityFocusRequest Request Body to request a list of RBICS Entity Focus objects. (required)
   * @return EntityFocusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Focus Objects </td><td>  -  </td></tr>
     </table>
   */
  public EntityFocusResponse getRbicsEntityFocusForList(EntityFocusRequest entityFocusRequest) throws ApiException {
    return getRbicsEntityFocusForListWithHttpInfo(entityFocusRequest).getData();
  }

  /**
   * Get RBICS classification for the Focus industry
   * Gets RBICS classifications for the Focus industry for a long list of companies. Full history is included if _date_ parameter is not specified.              RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  
   * @param entityFocusRequest Request Body to request a list of RBICS Entity Focus objects. (required)
   * @return ApiResponse&lt;EntityFocusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Focus Objects </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityFocusResponse> getRbicsEntityFocusForListWithHttpInfo(EntityFocusRequest entityFocusRequest) throws ApiException {
    Object localVarPostBody = entityFocusRequest;
    
    // verify the required parameter 'entityFocusRequest' is set
    if (entityFocusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityFocusRequest' when calling getRbicsEntityFocusForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-rbics/v1/entity-focus";

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
        
        EntityFocusResponse
      
    > apiResponse = apiClient.invokeAPI("EntityFocusApi.getRbicsEntityFocusForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRbicsEntityFocusForListResponseTypeMap, false);

    return apiResponse;

  }
}
