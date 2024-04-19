package com.factset.sdk.ProcuretoPayAPISCIM.api;

import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiResponse;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProcuretoPayAPISCIM.models.Error;
import com.factset.sdk.ProcuretoPayAPISCIM.models.FirmDescriptionResource;
import com.factset.sdk.ProcuretoPayAPISCIM.models.FirmDescriptionResourceList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FirmDescriptionsApi {
  private ApiClient apiClient;

  public FirmDescriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FirmDescriptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> firmDescriptionsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    firmDescriptionsGetResponseTypeMap.put(200, new GenericType<FirmDescriptionResourceList>(){});
    firmDescriptionsGetResponseTypeMap.put(400, new GenericType<Error>(){});
    firmDescriptionsGetResponseTypeMap.put(401, new GenericType<Error>(){});
    firmDescriptionsGetResponseTypeMap.put(403, new GenericType<Error>(){});
    firmDescriptionsGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> firmDescriptionsIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    firmDescriptionsIdGetResponseTypeMap.put(200, new GenericType<FirmDescriptionResource>(){});
    firmDescriptionsIdGetResponseTypeMap.put(401, new GenericType<Error>(){});
    firmDescriptionsIdGetResponseTypeMap.put(403, new GenericType<Error>(){});
    firmDescriptionsIdGetResponseTypeMap.put(404, new GenericType<Error>(){});
    firmDescriptionsIdGetResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get a list of firm descriptions.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return FirmDescriptionResourceList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public FirmDescriptionResourceList firmDescriptionsGet(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    return firmDescriptionsGetWithHttpInfo(filter, startIndex, count, attributes, excludedAttributes).getData();
  }

  /**
   * Get a list of firm descriptions.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return ApiResponse&lt;FirmDescriptionResourceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FirmDescriptionResourceList> firmDescriptionsGetWithHttpInfo(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/FirmDescriptions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludedAttributes", excludedAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FirmDescriptionResourceList
      
    > apiResponse = apiClient.invokeAPI("FirmDescriptionsApi.firmDescriptionsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, firmDescriptionsGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a firm description.
   * 
   * @param id ID of resource. (required)
   * @return FirmDescriptionResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Firm description not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public FirmDescriptionResource firmDescriptionsIdGet(String id) throws ApiException {
    return firmDescriptionsIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get a firm description.
   * 
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;FirmDescriptionResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Firm description not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FirmDescriptionResource> firmDescriptionsIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling firmDescriptionsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/FirmDescriptions/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FirmDescriptionResource
      
    > apiResponse = apiClient.invokeAPI("FirmDescriptionsApi.firmDescriptionsIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, firmDescriptionsIdGetResponseTypeMap, false);

    return apiResponse;

  }
}
