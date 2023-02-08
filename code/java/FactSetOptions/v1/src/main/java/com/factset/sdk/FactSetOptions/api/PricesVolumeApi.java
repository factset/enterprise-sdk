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
import com.factset.sdk.FactSetOptions.models.OptionsPricesRequest;
import com.factset.sdk.FactSetOptions.models.OptionsPricesResponse;
import com.factset.sdk.FactSetOptions.models.OptionsVolumeRequest;
import com.factset.sdk.FactSetOptions.models.OptionsVolumeResponse;
import com.factset.sdk.FactSetOptions.models.UnderlyingVolumeRequest;
import com.factset.sdk.FactSetOptions.models.UnderlyingVolumeResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricesVolumeApi {
  private ApiClient apiClient;

  public PricesVolumeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesVolumeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionsPricesForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsPricesForListResponseTypeMap.put(200, new GenericType<OptionsPricesResponse>(){});
    getOptionsPricesForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsPricesForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsPricesForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsPricesForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsPricesForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptionsVolumeForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsVolumeForListResponseTypeMap.put(200, new GenericType<OptionsVolumeResponse>(){});
    getOptionsVolumeForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsVolumeForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsVolumeForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsVolumeForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsVolumeForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUnderlyingVolumeForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUnderlyingVolumeForListResponseTypeMap.put(200, new GenericType<UnderlyingVolumeResponse>(){});
    getUnderlyingVolumeForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUnderlyingVolumeForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUnderlyingVolumeForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUnderlyingVolumeForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUnderlyingVolumeForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the pricing related information for the specified option identifier
   * Returns the pricing related information for the specified option identifier. Items include -  * Ask * Bid * Mid * Mid Bid Ask * Settlement * Last Price Type (Settlement or MidBidAsk) * Last Price * Strike Price * Underlying Security Price * 52 Week High/Low * Open, High, Low for day. Note securities must be trading for day requested.    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param optionsPricesRequest Options Prices Request Body (required)
   * @return OptionsPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Prices Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OptionsPricesResponse getOptionsPricesForList(OptionsPricesRequest optionsPricesRequest) throws ApiException {
    return getOptionsPricesForListWithHttpInfo(optionsPricesRequest).getData();
  }

  /**
   * Returns the pricing related information for the specified option identifier
   * Returns the pricing related information for the specified option identifier. Items include -  * Ask * Bid * Mid * Mid Bid Ask * Settlement * Last Price Type (Settlement or MidBidAsk) * Last Price * Strike Price * Underlying Security Price * 52 Week High/Low * Open, High, Low for day. Note securities must be trading for day requested.    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param optionsPricesRequest Options Prices Request Body (required)
   * @return ApiResponse&lt;OptionsPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Prices Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptionsPricesResponse> getOptionsPricesForListWithHttpInfo(OptionsPricesRequest optionsPricesRequest) throws ApiException {
    Object localVarPostBody = optionsPricesRequest;
    
    // verify the required parameter 'optionsPricesRequest' is set
    if (optionsPricesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsPricesRequest' when calling getOptionsPricesForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/prices";

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
        
        OptionsPricesResponse
      
    > apiResponse = apiClient.invokeAPI("PricesVolumeApi.getOptionsPricesForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsPricesForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the volume details for the specified option identifier
   * Returns the volume details for the specified option identifier for a specified exchange. Data items include -  * Open Interest * Volume    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param optionsVolumeRequest Volume Request Object (required)
   * @return OptionsVolumeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Volume Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OptionsVolumeResponse getOptionsVolumeForList(OptionsVolumeRequest optionsVolumeRequest) throws ApiException {
    return getOptionsVolumeForListWithHttpInfo(optionsVolumeRequest).getData();
  }

  /**
   * Returns the volume details for the specified option identifier
   * Returns the volume details for the specified option identifier for a specified exchange. Data items include -  * Open Interest * Volume    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param optionsVolumeRequest Volume Request Object (required)
   * @return ApiResponse&lt;OptionsVolumeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Volume Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptionsVolumeResponse> getOptionsVolumeForListWithHttpInfo(OptionsVolumeRequest optionsVolumeRequest) throws ApiException {
    Object localVarPostBody = optionsVolumeRequest;
    
    // verify the required parameter 'optionsVolumeRequest' is set
    if (optionsVolumeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsVolumeRequest' when calling getOptionsVolumeForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/volume";

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
        
        OptionsVolumeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesVolumeApi.getOptionsVolumeForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsVolumeForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the aggregate volume and open interest for the list of the options under the specified security identifier
   * Return the Volume and Open Interest details for list of the options for the specified underlying security identifier. The data is aggregated for all options contracts associated to the underlying id, or specifify in the request only the contracts listed on a specific exchange. Data Includes -  * Put Call Ratio  * Total Put Volume &amp; Open Interest * Total Call Volume &amp; Open Interest * Total Put &amp; Call Volume &amp; Open Interest    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param underlyingVolumeRequest Underlying Volume Request Body (required)
   * @return UnderlyingVolumeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Underlying Volume and Open Interest Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public UnderlyingVolumeResponse getUnderlyingVolumeForList(UnderlyingVolumeRequest underlyingVolumeRequest) throws ApiException {
    return getUnderlyingVolumeForListWithHttpInfo(underlyingVolumeRequest).getData();
  }

  /**
   * Returns the aggregate volume and open interest for the list of the options under the specified security identifier
   * Return the Volume and Open Interest details for list of the options for the specified underlying security identifier. The data is aggregated for all options contracts associated to the underlying id, or specifify in the request only the contracts listed on a specific exchange. Data Includes -  * Put Call Ratio  * Total Put Volume &amp; Open Interest * Total Call Volume &amp; Open Interest * Total Put &amp; Call Volume &amp; Open Interest    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
   * @param underlyingVolumeRequest Underlying Volume Request Body (required)
   * @return ApiResponse&lt;UnderlyingVolumeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Underlying Volume and Open Interest Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UnderlyingVolumeResponse> getUnderlyingVolumeForListWithHttpInfo(UnderlyingVolumeRequest underlyingVolumeRequest) throws ApiException {
    Object localVarPostBody = underlyingVolumeRequest;
    
    // verify the required parameter 'underlyingVolumeRequest' is set
    if (underlyingVolumeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'underlyingVolumeRequest' when calling getUnderlyingVolumeForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/underlying-volume";

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
        
        UnderlyingVolumeResponse
      
    > apiResponse = apiClient.invokeAPI("PricesVolumeApi.getUnderlyingVolumeForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUnderlyingVolumeForListResponseTypeMap, false);

    return apiResponse;

  }
}
