package com.factset.sdk.FactSetEntity.api;

import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiResponse;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEntity.models.EntitySecuritiesRequest;
import com.factset.sdk.FactSetEntity.models.EntitySecuritiesResponse;
import com.factset.sdk.FactSetEntity.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntitySecuritiesApi {
  private ApiClient apiClient;

  public EntitySecuritiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntitySecuritiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntitySecuritiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntitySecuritiesResponseTypeMap.put(200, new GenericType<EntitySecuritiesResponse>(){});
    getEntitySecuritiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntitySecuritiesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntitySecuritiesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntitySecuritiesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntitySecuritiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postEntitySecuritiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEntitySecuritiesResponseTypeMap.put(200, new GenericType<EntitySecuritiesResponse>(){});
    postEntitySecuritiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postEntitySecuritiesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postEntitySecuritiesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postEntitySecuritiesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postEntitySecuritiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
   * Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param securityType Controls the response to return all related equity listings (EQ), all debt instruments (FI), or both all equity and all debt (ALL). (optional, default to EQ)
   * @return EntitySecuritiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Entity Security data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntitySecuritiesResponse getEntitySecurities(java.util.List<String> ids, String securityType) throws ApiException {
    return getEntitySecuritiesWithHttpInfo(ids, securityType).getData();
  }

  /**
   * Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
   * Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param securityType Controls the response to return all related equity listings (EQ), all debt instruments (FI), or both all equity and all debt (ALL). (optional, default to EQ)
   * @return ApiResponse&lt;EntitySecuritiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Entity Security data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntitySecuritiesResponse> getEntitySecuritiesWithHttpInfo(java.util.List<String> ids, String securityType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getEntitySecurities");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/entity-securities";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityType", securityType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntitySecuritiesResponse
      
    > apiResponse = apiClient.invokeAPI("EntitySecuritiesApi.getEntitySecurities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntitySecuritiesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
   * Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 
   * @param entitySecuritiesRequest Request Body to request a list of Entity Security objects. (required)
   * @return EntitySecuritiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Security Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntitySecuritiesResponse postEntitySecurities(EntitySecuritiesRequest entitySecuritiesRequest) throws ApiException {
    return postEntitySecuritiesWithHttpInfo(entitySecuritiesRequest).getData();
  }

  /**
   * Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
   * Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 
   * @param entitySecuritiesRequest Request Body to request a list of Entity Security objects. (required)
   * @return ApiResponse&lt;EntitySecuritiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response producing an array of Entity Security Objects </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntitySecuritiesResponse> postEntitySecuritiesWithHttpInfo(EntitySecuritiesRequest entitySecuritiesRequest) throws ApiException {
    Object localVarPostBody = entitySecuritiesRequest;
    
    // verify the required parameter 'entitySecuritiesRequest' is set
    if (entitySecuritiesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entitySecuritiesRequest' when calling postEntitySecurities");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/entity-securities";

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
        
        EntitySecuritiesResponse
      
    > apiResponse = apiClient.invokeAPI("EntitySecuritiesApi.postEntitySecurities", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEntitySecuritiesResponseTypeMap, false);

    return apiResponse;

  }
}
