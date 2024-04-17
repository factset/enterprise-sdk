package com.factset.sdk.FactSetTermsandConditions.api;

import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiResponse;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTermsandConditions.models.ConvertibleDetailsResponse;
import com.factset.sdk.FactSetTermsandConditions.models.ConvertibleHistoryResponse;
import com.factset.sdk.FactSetTermsandConditions.models.ConvertibleTriggersResponse;
import com.factset.sdk.FactSetTermsandConditions.models.ErrorResponse;
import com.factset.sdk.FactSetTermsandConditions.models.TermsAndConditionsScalarRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConvertiblesApi {
  private ApiClient apiClient;

  public ConvertiblesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConvertiblesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getConvertibleDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleDetailsResponseTypeMap.put(200, new GenericType<ConvertibleDetailsResponse>(){});
    getConvertibleDetailsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConvertibleDetailsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleDetailsForListResponseTypeMap.put(200, new GenericType<ConvertibleDetailsResponse>(){});
    getConvertibleDetailsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleDetailsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConvertibleHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleHistoryResponseTypeMap.put(200, new GenericType<ConvertibleHistoryResponse>(){});
    getConvertibleHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConvertibleHistoryForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleHistoryForListResponseTypeMap.put(200, new GenericType<ConvertibleHistoryResponse>(){});
    getConvertibleHistoryForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleHistoryForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConvertibleTriggersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleTriggersResponseTypeMap.put(200, new GenericType<ConvertibleTriggersResponse>(){});
    getConvertibleTriggersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConvertibleTriggersForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConvertibleTriggersForListResponseTypeMap.put(200, new GenericType<ConvertibleTriggersResponse>(){});
    getConvertibleTriggersForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConvertibleTriggersForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Return Convertible Details for a list of Convertible Fixed Income securities.
   * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ConvertibleDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Details Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleDetailsResponse getConvertibleDetails(java.util.List<String> ids) throws ApiException {
    return getConvertibleDetailsWithHttpInfo(ids).getData();
  }

  /**
   * Return Convertible Details for a list of Convertible Fixed Income securities.
   * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ApiResponse&lt;ConvertibleDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Details Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleDetailsResponse> getConvertibleDetailsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getConvertibleDetails");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-details";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ConvertibleDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleDetailsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Convertible Details data for a large list of Fixed Income securities.
   * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Convertible Details. (required)
   * @return ConvertibleDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Details Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleDetailsResponse getConvertibleDetailsForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    return getConvertibleDetailsForListWithHttpInfo(termsAndConditionsScalarRequest).getData();
  }

  /**
   * Return Convertible Details data for a large list of Fixed Income securities.
   * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Convertible Details. (required)
   * @return ApiResponse&lt;ConvertibleDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Details Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleDetailsResponse> getConvertibleDetailsForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    Object localVarPostBody = termsAndConditionsScalarRequest;
    
    // verify the required parameter 'termsAndConditionsScalarRequest' is set
    if (termsAndConditionsScalarRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleDetailsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-details";

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
        
        ConvertibleDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleDetailsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleDetailsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Convertible History data for a list of Fixed Income securities.
   * Returns Convertible History data for the Fixed Income security, including - * Convertibles Price * Convertibles Effective Date 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ConvertibleHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible History Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleHistoryResponse getConvertibleHistory(java.util.List<String> ids) throws ApiException {
    return getConvertibleHistoryWithHttpInfo(ids).getData();
  }

  /**
   * Return Convertible History data for a list of Fixed Income securities.
   * Returns Convertible History data for the Fixed Income security, including - * Convertibles Price * Convertibles Effective Date 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ApiResponse&lt;ConvertibleHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible History Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleHistoryResponse> getConvertibleHistoryWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getConvertibleHistory");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ConvertibleHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Convertible History data for a large list of Fixed Income securities.
   * Returns Convertible History data for a list of Fixed Income securities. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Issue Size. (required)
   * @return ConvertibleHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible History Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleHistoryResponse getConvertibleHistoryForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    return getConvertibleHistoryForListWithHttpInfo(termsAndConditionsScalarRequest).getData();
  }

  /**
   * Return Convertible History data for a large list of Fixed Income securities.
   * Returns Convertible History data for a list of Fixed Income securities. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Issue Size. (required)
   * @return ApiResponse&lt;ConvertibleHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible History Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleHistoryResponse> getConvertibleHistoryForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    Object localVarPostBody = termsAndConditionsScalarRequest;
    
    // verify the required parameter 'termsAndConditionsScalarRequest' is set
    if (termsAndConditionsScalarRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleHistoryForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-history";

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
        
        ConvertibleHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleHistoryForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleHistoryForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Convertible Triggers data for a list of Fixed Income securities.
   * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ConvertibleTriggersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Triggers Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleTriggersResponse getConvertibleTriggers(java.util.List<String> ids) throws ApiException {
    return getConvertibleTriggersWithHttpInfo(ids).getData();
  }

  /**
   * Return Convertible Triggers data for a list of Fixed Income securities.
   * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
   * @param ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  (required)
   * @return ApiResponse&lt;ConvertibleTriggersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Triggers Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleTriggersResponse> getConvertibleTriggersWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getConvertibleTriggers");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-triggers";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ConvertibleTriggersResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleTriggers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleTriggersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Return Convertible Trigger data for a large list of Fixed Income securities.
   * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Issue Size. (required)
   * @return ConvertibleTriggersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Triggers Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConvertibleTriggersResponse getConvertibleTriggersForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    return getConvertibleTriggersForListWithHttpInfo(termsAndConditionsScalarRequest).getData();
  }

  /**
   * Return Convertible Trigger data for a large list of Fixed Income securities.
   * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
   * @param termsAndConditionsScalarRequest Request object for Fixed Income Issue Size. (required)
   * @return ApiResponse&lt;ConvertibleTriggersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Convertible Triggers Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConvertibleTriggersResponse> getConvertibleTriggersForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest) throws ApiException {
    Object localVarPostBody = termsAndConditionsScalarRequest;
    
    // verify the required parameter 'termsAndConditionsScalarRequest' is set
    if (termsAndConditionsScalarRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleTriggersForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-terms-and-conditions/v1/convertible-triggers";

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
        
        ConvertibleTriggersResponse
      
    > apiResponse = apiClient.invokeAPI("ConvertiblesApi.getConvertibleTriggersForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConvertibleTriggersForListResponseTypeMap, false);

    return apiResponse;

  }
}
