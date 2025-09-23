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
import com.factset.sdk.ProcuretoPayAPISCIM.models.InlineResponse429;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FirmDescriptionsApi {
  private ApiClient apiClient;

  public FirmDescriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FirmDescriptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFirmDescriptionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFirmDescriptionResponseTypeMap.put(200, new GenericType<FirmDescriptionResource>(){});
    getFirmDescriptionResponseTypeMap.put(401, new GenericType<Error>(){});
    getFirmDescriptionResponseTypeMap.put(403, new GenericType<Error>(){});
    getFirmDescriptionResponseTypeMap.put(404, new GenericType<Error>(){});
    getFirmDescriptionResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getFirmDescriptionResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getFirmDescriptionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFirmDescriptionsResponseTypeMap.put(200, new GenericType<FirmDescriptionResourceList>(){});
    getFirmDescriptionsResponseTypeMap.put(400, new GenericType<Error>(){});
    getFirmDescriptionsResponseTypeMap.put(401, new GenericType<Error>(){});
    getFirmDescriptionsResponseTypeMap.put(403, new GenericType<Error>(){});
    getFirmDescriptionsResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getFirmDescriptionsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get a firm description.
   * Get a specific firm description resource.
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return FirmDescriptionResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Firm description not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public FirmDescriptionResource getFirmDescription(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return getFirmDescriptionWithHttpInfo(id, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Get a firm description.
   * Get a specific firm description resource.
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;FirmDescriptionResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Firm description not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FirmDescriptionResource> getFirmDescriptionWithHttpInfo(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFirmDescription");
    }
    
    // create path and map variables
    String localVarPath = "/FirmDescriptions/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FirmDescriptionResource
      
    > apiResponse = apiClient.invokeAPI("FirmDescriptionsApi.getFirmDescription", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFirmDescriptionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of firm descriptions.
   * Get a list of firm description resources.
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. (optional)
   * @param sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional)
   * @param sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return FirmDescriptionResourceList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public FirmDescriptionResourceList getFirmDescriptions(String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return getFirmDescriptionsWithHttpInfo(filter, sortBy, sortOrder, startIndex, count, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Get a list of firm descriptions.
   * Get a list of firm description resources.
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. (optional)
   * @param sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional)
   * @param sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;FirmDescriptionResourceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FirmDescriptionResourceList> getFirmDescriptionsWithHttpInfo(String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/FirmDescriptions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FirmDescriptionResourceList
      
    > apiResponse = apiClient.invokeAPI("FirmDescriptionsApi.getFirmDescriptions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFirmDescriptionsResponseTypeMap, false);

    return apiResponse;

  }
}
