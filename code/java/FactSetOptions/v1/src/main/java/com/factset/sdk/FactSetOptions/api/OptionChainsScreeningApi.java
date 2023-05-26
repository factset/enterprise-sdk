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

import com.factset.sdk.FactSetOptions.models.ChainsRequest;
import com.factset.sdk.FactSetOptions.models.ChainsResponse;
import com.factset.sdk.FactSetOptions.models.ErrorResponse;
import com.factset.sdk.FactSetOptions.models.OptionScreeningRequest;
import com.factset.sdk.FactSetOptions.models.OptionScreeningResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptionChainsScreeningApi {
  private ApiClient apiClient;

  public OptionChainsScreeningApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OptionChainsScreeningApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionsChainsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsChainsForListResponseTypeMap.put(200, new GenericType<ChainsResponse>(){});
    getOptionsChainsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsChainsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsChainsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsChainsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsChainsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptionsScreeningForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsScreeningForListResponseTypeMap.put(200, new GenericType<OptionScreeningResponse>(){});
    getOptionsScreeningForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsScreeningForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsScreeningForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsScreeningForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsScreeningForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns all the underlying option identifiers for the specified underlying Security identifier
   * Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id.     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param chainsRequest Options Chains Request Object (required)
   * @return ChainsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Chain Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ChainsResponse getOptionsChainsForList(ChainsRequest chainsRequest) throws ApiException {
    return getOptionsChainsForListWithHttpInfo(chainsRequest).getData();
  }

  /**
   * Returns all the underlying option identifiers for the specified underlying Security identifier
   * Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id.     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param chainsRequest Options Chains Request Object (required)
   * @return ApiResponse&lt;ChainsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Chain Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChainsResponse> getOptionsChainsForListWithHttpInfo(ChainsRequest chainsRequest) throws ApiException {
    Object localVarPostBody = chainsRequest;
    
    // verify the required parameter 'chainsRequest' is set
    if (chainsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chainsRequest' when calling getOptionsChainsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/chains";

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
        
        ChainsResponse
      
    > apiResponse = apiClient.invokeAPI("OptionChainsScreeningApi.getOptionsChainsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsChainsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all the option identifiers based on the conditions provided as input in the request
   * Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow \&quot;AND\&quot; logic if more than one condition is applied and allows up to **three conditions** using AND Logic.If a condition is used the accompanying value MUST be used -  |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1&#x3D; Equity, 2&#x3D;Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0&#x3D;Call, 1&#x3D;Put)|    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionScreeningRequest Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   (required)
   * @return OptionScreeningResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Option Screening Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OptionScreeningResponse getOptionsScreeningForList(OptionScreeningRequest optionScreeningRequest) throws ApiException {
    return getOptionsScreeningForListWithHttpInfo(optionScreeningRequest).getData();
  }

  /**
   * Returns all the option identifiers based on the conditions provided as input in the request
   * Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow \&quot;AND\&quot; logic if more than one condition is applied and allows up to **three conditions** using AND Logic.If a condition is used the accompanying value MUST be used -  |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1&#x3D; Equity, 2&#x3D;Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0&#x3D;Call, 1&#x3D;Put)|    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param optionScreeningRequest Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   (required)
   * @return ApiResponse&lt;OptionScreeningResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Option Screening Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OptionScreeningResponse> getOptionsScreeningForListWithHttpInfo(OptionScreeningRequest optionScreeningRequest) throws ApiException {
    Object localVarPostBody = optionScreeningRequest;
    
    // verify the required parameter 'optionScreeningRequest' is set
    if (optionScreeningRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionScreeningRequest' when calling getOptionsScreeningForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/option-screening";

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
        
        OptionScreeningResponse
      
    > apiResponse = apiClient.invokeAPI("OptionChainsScreeningApi.getOptionsScreeningForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsScreeningForListResponseTypeMap, false);

    return apiResponse;

  }
}
