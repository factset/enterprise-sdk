package com.factset.sdk.FactSetOptions.api;

import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiResponse;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOptions.models.ErrorResponse;
import com.factset.sdk.FactSetOptions.models.OptionsDatesRequest;
import com.factset.sdk.FactSetOptions.models.OptionsDatesResponse;
import com.factset.sdk.FactSetOptions.models.OptionsReferencesRequest;
import com.factset.sdk.FactSetOptions.models.OptionsReferencesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReferenceApi {
  private ApiClient apiClient;

  public ReferenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionsDatesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsDatesForListResponseTypeMap.put(200, new GenericType<OptionsDatesResponse>(){});
    getOptionsDatesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsDatesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsDatesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsDatesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsDatesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptionsReferencesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsReferencesForListResponseTypeMap.put(200, new GenericType<OptionsReferencesResponse>(){});
    getOptionsReferencesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsReferencesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsReferencesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsReferencesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsReferencesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns option security dates such as expiration and trade.
   * Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionsDatesRequest  (required)
   * @return OptionsDatesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Dates Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OptionsDatesResponse getOptionsDatesForList(OptionsDatesRequest optionsDatesRequest) throws ApiException {
    return getOptionsDatesForListWithHttpInfo(optionsDatesRequest).getData();
  }

  /**
   * Returns option security dates such as expiration and trade.
   * Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionsDatesRequest  (required)
   * @return ApiResponse&lt;OptionsDatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Dates Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptionsDatesResponse> getOptionsDatesForListWithHttpInfo(OptionsDatesRequest optionsDatesRequest) throws ApiException {
    Object localVarPostBody = optionsDatesRequest;
    
    // verify the required parameter 'optionsDatesRequest' is set
    if (optionsDatesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsDatesRequest' when calling getOptionsDatesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/dates";

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
        
        OptionsDatesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getOptionsDatesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsDatesForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns basic reference details for the options such as currency, exchange, symbols, flags and more
   * Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionsReferencesRequest Options Reference Request Body (required)
   * @return OptionsReferencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Reference Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OptionsReferencesResponse getOptionsReferencesForList(OptionsReferencesRequest optionsReferencesRequest) throws ApiException {
    return getOptionsReferencesForListWithHttpInfo(optionsReferencesRequest).getData();
  }

  /**
   * Returns basic reference details for the options such as currency, exchange, symbols, flags and more
   * Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionsReferencesRequest Options Reference Request Body (required)
   * @return ApiResponse&lt;OptionsReferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Reference Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptionsReferencesResponse> getOptionsReferencesForListWithHttpInfo(OptionsReferencesRequest optionsReferencesRequest) throws ApiException {
    Object localVarPostBody = optionsReferencesRequest;
    
    // verify the required parameter 'optionsReferencesRequest' is set
    if (optionsReferencesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsReferencesRequest' when calling getOptionsReferencesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/references";

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
        
        OptionsReferencesResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getOptionsReferencesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsReferencesForListResponseTypeMap, false);

    return apiResponse;

  }
}
