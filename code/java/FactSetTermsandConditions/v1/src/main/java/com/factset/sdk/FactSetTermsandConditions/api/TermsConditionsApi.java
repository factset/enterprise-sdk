package com.factset.sdk.FactSetTermsandConditions.api;

import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiResponse;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTermsandConditions.models.ErrorResponse;
import com.factset.sdk.FactSetTermsandConditions.models.FieldsResponse;
import com.factset.sdk.FactSetTermsandConditions.models.TermsAndConditionsRequest;
import com.factset.sdk.FactSetTermsandConditions.models.TermsAndConditionsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TermsConditionsApi {
  private ApiClient apiClient;

  public TermsConditionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TermsConditionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getTermsAndConditionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTermsAndConditionsResponseTypeMap.put(200, new GenericType<TermsAndConditionsResponse>(){});
    getTermsAndConditionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getTermsAndConditionsFieldsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTermsAndConditionsFieldsResponseTypeMap.put(200, new GenericType<FieldsResponse>(){});
    getTermsAndConditionsFieldsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsFieldsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsFieldsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsFieldsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsFieldsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getTermsAndConditionsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTermsAndConditionsForListResponseTypeMap.put(200, new GenericType<TermsAndConditionsResponse>(){});
    getTermsAndConditionsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTermsAndConditionsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Return select Terms and Conditions items for a Fixed Income security.
   * Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @param fields List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. (optional)
   * @param categories Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  (optional)
   * @return TermsAndConditionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms And Conditions Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TermsAndConditionsResponse getTermsAndConditions(java.util.List<String> ids, java.util.List<String> fields, java.util.List<String> categories) throws ApiException {
    return getTermsAndConditionsWithHttpInfo(ids, fields, categories).getData();
  }

  /**
   * Return select Terms and Conditions items for a Fixed Income security.
   * Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @param fields List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. (optional)
   * @param categories Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  (optional)
   * @return ApiResponse&lt;TermsAndConditionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms And Conditions Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TermsAndConditionsResponse> getTermsAndConditionsWithHttpInfo(java.util.List<String> ids, java.util.List<String> fields, java.util.List<String> categories) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTermsAndConditions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/terms-and-conditions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TermsAndConditionsResponse
      
    > apiResponse = apiClient.invokeAPI("TermsConditionsApi.getTermsAndConditions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTermsAndConditionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Available fields for /terms-and-conditions endpoint
   * Returns a list of available fields that can be used in the &#x60;fields&#x60; parameter of the **_/terms-and-conditions** endpoint. Leave _category_ blank to request all available items. Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints. 
   * @param category Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  (optional)
   * @return FieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms And Conditions Fields Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FieldsResponse getTermsAndConditionsFields(String category) throws ApiException {
    return getTermsAndConditionsFieldsWithHttpInfo(category).getData();
  }

  /**
   * Available fields for /terms-and-conditions endpoint
   * Returns a list of available fields that can be used in the &#x60;fields&#x60; parameter of the **_/terms-and-conditions** endpoint. Leave _category_ blank to request all available items. Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints. 
   * @param category Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  (optional)
   * @return ApiResponse&lt;FieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms And Conditions Fields Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FieldsResponse> getTermsAndConditionsFieldsWithHttpInfo(String category) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/fields";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FieldsResponse
      
    > apiResponse = apiClient.invokeAPI("TermsConditionsApi.getTermsAndConditionsFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTermsAndConditionsFieldsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Terms and Conditions for a list of Fixed Income securities.
   * Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 
   * @param termsAndConditionsRequest Request object for Terms And Conditions (required)
   * @return TermsAndConditionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms and Conditions Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TermsAndConditionsResponse getTermsAndConditionsForList(TermsAndConditionsRequest termsAndConditionsRequest) throws ApiException {
    return getTermsAndConditionsForListWithHttpInfo(termsAndConditionsRequest).getData();
  }

  /**
   * Return Terms and Conditions for a list of Fixed Income securities.
   * Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 
   * @param termsAndConditionsRequest Request object for Terms And Conditions (required)
   * @return ApiResponse&lt;TermsAndConditionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Terms and Conditions Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TermsAndConditionsResponse> getTermsAndConditionsForListWithHttpInfo(TermsAndConditionsRequest termsAndConditionsRequest) throws ApiException {
    Object localVarPostBody = termsAndConditionsRequest;
    
    // verify the required parameter 'termsAndConditionsRequest' is set
    if (termsAndConditionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'termsAndConditionsRequest' when calling getTermsAndConditionsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/terms-and-conditions";

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
        
        TermsAndConditionsResponse
      
    > apiResponse = apiClient.invokeAPI("TermsConditionsApi.getTermsAndConditionsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTermsAndConditionsForListResponseTypeMap, false);

    return apiResponse;

  }
}
