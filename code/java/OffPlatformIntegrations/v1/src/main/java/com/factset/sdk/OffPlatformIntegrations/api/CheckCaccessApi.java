package com.factset.sdk.OffPlatformIntegrations.api;

import com.factset.sdk.OffPlatformIntegrations.ApiException;
import com.factset.sdk.OffPlatformIntegrations.ApiClient;
import com.factset.sdk.OffPlatformIntegrations.ApiResponse;
import com.factset.sdk.OffPlatformIntegrations.Configuration;
import com.factset.sdk.OffPlatformIntegrations.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OffPlatformIntegrations.models.AccessCheckRequest;
import com.factset.sdk.OffPlatformIntegrations.models.AccessCheckResponse;
import com.factset.sdk.OffPlatformIntegrations.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CheckCaccessApi {
  private ApiClient apiClient;

  public CheckCaccessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CheckCaccessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> checkCACCESSResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    checkCACCESSResponseTypeMap.put(200, new GenericType<AccessCheckResponse>(){});
    checkCACCESSResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    checkCACCESSResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    checkCACCESSResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    checkCACCESSResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    checkCACCESSResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    checkCACCESSResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Check access for a list of encrypted CACCESS codes
   * Accepts an array of up to 25 encrypted CACCESS codes in &#39;data&#39; and returns an array of result objects. On successful decryption of all codes, returns 200 with each result containing the encrypted code and a boolean &#39;hasAccess&#39;. If decryption fails for any code, returns 400 with an &#39;errors&#39; array containing the decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. Returns 400 with an &#39;errors&#39; envelope for malformed input or if more than 25 codes are submitted, and 401 if the user is not authenticated.  Each CACCESS code must be encrypted using **AES-256-CBC** before being sent. To obtain the encryption key and integration guidance, contact [research-integrations-dev@factset.com](mailto:research-integrations-dev@factset.com).
   * @param accessCheckRequest  (required)
   * @return AccessCheckResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All codes decrypted successfully. Returns a list of encrypted CACCESS codes and their access status. </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - either the request body is malformed/missing, more than 25 codes were submitted, or one or more codes could not be decrypted. Validation errors return an &#39;errors&#39; envelope; decryption failures return an &#39;errors&#39; array containing decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - authentication credentials are missing or invalid </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden - authenticated user does not have the required access </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout - the request body took too long to arrive (limit: 10s) </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - request processing timed out (limit: 25s) </td><td>  * api-version -  <br>  </td></tr>
     </table>
   */
  public AccessCheckResponse checkCACCESS(AccessCheckRequest accessCheckRequest) throws ApiException {
    return checkCACCESSWithHttpInfo(accessCheckRequest).getData();
  }

  /**
   * Check access for a list of encrypted CACCESS codes
   * Accepts an array of up to 25 encrypted CACCESS codes in &#39;data&#39; and returns an array of result objects. On successful decryption of all codes, returns 200 with each result containing the encrypted code and a boolean &#39;hasAccess&#39;. If decryption fails for any code, returns 400 with an &#39;errors&#39; array containing the decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. Returns 400 with an &#39;errors&#39; envelope for malformed input or if more than 25 codes are submitted, and 401 if the user is not authenticated.  Each CACCESS code must be encrypted using **AES-256-CBC** before being sent. To obtain the encryption key and integration guidance, contact [research-integrations-dev@factset.com](mailto:research-integrations-dev@factset.com).
   * @param accessCheckRequest  (required)
   * @return ApiResponse&lt;AccessCheckResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All codes decrypted successfully. Returns a list of encrypted CACCESS codes and their access status. </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - either the request body is malformed/missing, more than 25 codes were submitted, or one or more codes could not be decrypted. Validation errors return an &#39;errors&#39; envelope; decryption failures return an &#39;errors&#39; array containing decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - authentication credentials are missing or invalid </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden - authenticated user does not have the required access </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout - the request body took too long to arrive (limit: 10s) </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable - request processing timed out (limit: 25s) </td><td>  * api-version -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<AccessCheckResponse> checkCACCESSWithHttpInfo(AccessCheckRequest accessCheckRequest) throws ApiException {
    Object localVarPostBody = accessCheckRequest;
    
    // verify the required parameter 'accessCheckRequest' is set
    if (accessCheckRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCheckRequest' when calling checkCACCESS");
    }
    
    // create path and map variables
    String localVarPath = "/check-caccess";

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
        
        AccessCheckResponse
      
    > apiResponse = apiClient.invokeAPI("CheckCaccessApi.checkCACCESS", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, checkCACCESSResponseTypeMap, false);

    return apiResponse;

  }
}
