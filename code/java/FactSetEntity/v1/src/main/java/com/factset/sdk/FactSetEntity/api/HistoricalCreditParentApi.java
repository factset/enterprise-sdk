package com.factset.sdk.FactSetEntity.api;

import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiResponse;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEntity.models.CreditParentRequest;
import com.factset.sdk.FactSetEntity.models.CreditParentResponse;
import com.factset.sdk.FactSetEntity.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HistoricalCreditParentApi {
  private ApiClient apiClient;

  public HistoricalCreditParentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HistoricalCreditParentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getHistCredParentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getHistCredParentResponseTypeMap.put(200, new GenericType<CreditParentResponse>(){});
    getHistCredParentResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getHistCredParentResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getHistCredParentResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getHistCredParentResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getHistCredParentResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postHistCredParentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postHistCredParentResponseTypeMap.put(200, new GenericType<CreditParentResponse>(){});
    postHistCredParentResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postHistCredParentResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postHistCredParentResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postHistCredParentResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postHistCredParentResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns historical credit parents for the requested id(s).
   * Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 
   * @param ids The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.&lt;p&gt;**Max Ids Limit set to 50 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param asOfDate The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  (optional)
   * @return CreditParentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Credit Parents </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CreditParentResponse getHistCredParent(java.util.List<String> ids, String asOfDate) throws ApiException {
    return getHistCredParentWithHttpInfo(ids, asOfDate).getData();
  }

  /**
   * Returns historical credit parents for the requested id(s).
   * Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 
   * @param ids The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.&lt;p&gt;**Max Ids Limit set to 50 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param asOfDate The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  (optional)
   * @return ApiResponse&lt;CreditParentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Credit Parents </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreditParentResponse> getHistCredParentWithHttpInfo(java.util.List<String> ids, String asOfDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getHistCredParent");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/hist-credit-parent";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asOfDate", asOfDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CreditParentResponse
      
    > apiResponse = apiClient.invokeAPI("HistoricalCreditParentApi.getHistCredParent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getHistCredParentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns historical credit parents for the requested id(s).
   * Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 
   * @param creditParentRequest Request Body to request a list of credit parent objects. (required)
   * @return CreditParentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Credit parent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CreditParentResponse postHistCredParent(CreditParentRequest creditParentRequest) throws ApiException {
    return postHistCredParentWithHttpInfo(creditParentRequest).getData();
  }

  /**
   * Returns historical credit parents for the requested id(s).
   * Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 
   * @param creditParentRequest Request Body to request a list of credit parent objects. (required)
   * @return ApiResponse&lt;CreditParentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Credit parent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreditParentResponse> postHistCredParentWithHttpInfo(CreditParentRequest creditParentRequest) throws ApiException {
    Object localVarPostBody = creditParentRequest;
    
    // verify the required parameter 'creditParentRequest' is set
    if (creditParentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'creditParentRequest' when calling postHistCredParent");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/hist-credit-parent";

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
        
        CreditParentResponse
      
    > apiResponse = apiClient.invokeAPI("HistoricalCreditParentApi.postHistCredParent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postHistCredParentResponseTypeMap, false);

    return apiResponse;

  }
}
