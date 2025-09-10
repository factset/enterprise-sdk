package com.factset.sdk.FactSetFunds.api;

import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiResponse;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFunds.models.ContentSetsResponse;
import com.factset.sdk.FactSetFunds.models.CreateContentSetRequest;
import com.factset.sdk.FactSetFunds.models.CreateContentSetResponse;
import com.factset.sdk.FactSetFunds.models.DistinctCountRequest;
import com.factset.sdk.FactSetFunds.models.DistinctCountResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponseScreener;
import com.factset.sdk.FactSetFunds.models.FieldsResponse;
import com.factset.sdk.FactSetFunds.models.SearchRequest;
import com.factset.sdk.FactSetFunds.models.SearchResponse;
import com.factset.sdk.FactSetFunds.models.StatisticsRequest;
import com.factset.sdk.FactSetFunds.models.StatisticsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScreeningOperationsApi {
  private ApiClient apiClient;

  public ScreeningOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreeningOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createContentSetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createContentSetResponseTypeMap.put(201, new GenericType<CreateContentSetResponse>(){});
    createContentSetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    createContentSetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    createContentSetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    createContentSetResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    createContentSetResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    createContentSetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> deleteContentSetResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getContentSetsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContentSetsResponseTypeMap.put(200, new GenericType<ContentSetsResponse>(){});
    getContentSetsResponseTypeMap.put(400, new GenericType<ErrorResponseScreener>(){});
    getContentSetsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getContentSetsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getContentSetsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getContentSetsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getContentSetsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDistinctCountResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDistinctCountResponseTypeMap.put(200, new GenericType<DistinctCountResponse>(){});
    getDistinctCountResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDistinctCountResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDistinctCountResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDistinctCountResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDistinctCountResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDistinctCountResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFieldsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFieldsResponseTypeMap.put(200, new GenericType<FieldsResponse>(){});
    getFieldsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFieldsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFieldsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFieldsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFieldsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFieldsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getScreenerDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getScreenerDataResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    getScreenerDataResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getScreenerDataResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getScreenerDataResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getScreenerDataResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getScreenerDataResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getScreenerDataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getStatisticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStatisticsResponseTypeMap.put(200, new GenericType<StatisticsResponse>(){});
    getStatisticsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getStatisticsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getStatisticsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getStatisticsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getStatisticsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getStatisticsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Create a new custom content set with required fields from the default content sets.
   * Create a custom content set with the required set of fields. These fields are taken from the default content sets provided in the request.  The name for a custom content-set must be unique. The list of displayNames within each custom content-set must also be unique. Display names can be used as fieldName in other endpoints to perform screening operations.  The &#x60;/screener/content-sets&#x60; and &#x60;/screener/fields&#x60; endpoints provide the authoritative lists of available content sets and fields. Use these endpoints to construct custom content sets and ensure that all content set names and displayName values are unique. 
   * @param createContentSetRequest Request object for create content-set endpoint. (required)
   * @return CreateContentSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Response object for create content-set endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CreateContentSetResponse createContentSet(CreateContentSetRequest createContentSetRequest) throws ApiException {
    return createContentSetWithHttpInfo(createContentSetRequest).getData();
  }

  /**
   * Create a new custom content set with required fields from the default content sets.
   * Create a custom content set with the required set of fields. These fields are taken from the default content sets provided in the request.  The name for a custom content-set must be unique. The list of displayNames within each custom content-set must also be unique. Display names can be used as fieldName in other endpoints to perform screening operations.  The &#x60;/screener/content-sets&#x60; and &#x60;/screener/fields&#x60; endpoints provide the authoritative lists of available content sets and fields. Use these endpoints to construct custom content sets and ensure that all content set names and displayName values are unique. 
   * @param createContentSetRequest Request object for create content-set endpoint. (required)
   * @return ApiResponse&lt;CreateContentSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Response object for create content-set endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateContentSetResponse> createContentSetWithHttpInfo(CreateContentSetRequest createContentSetRequest) throws ApiException {
    Object localVarPostBody = createContentSetRequest;
    
    // verify the required parameter 'createContentSetRequest' is set
    if (createContentSetRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createContentSetRequest' when calling createContentSet");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/content-sets/create";

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
        
        CreateContentSetResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.createContentSet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createContentSetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a custom content set.
   * Delete a custom content set by providing the content set name.
   * @param name The name of the content set to be deleted. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The content set has been deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request occurs when the content set name is not provided or is invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteContentSet(String name) throws ApiException {
    deleteContentSetWithHttpInfo(name);
  }

  /**
   * Delete a custom content set.
   * Delete a custom content set by providing the content set name.
   * @param name The name of the content set to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The content set has been deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request occurs when the content set name is not provided or is invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteContentSetWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteContentSet");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/content-sets/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.deleteContentSet", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteContentSetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the content sets that are permissioned for the user.
   * Gets the content sets that are permissioned for the user. for example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc. 
   * @return ContentSetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The content-sets response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ContentSetsResponse getContentSets() throws ApiException {
    return getContentSetsWithHttpInfo().getData();
  }

  /**
   * Get the content sets that are permissioned for the user.
   * Gets the content sets that are permissioned for the user. for example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc. 
   * @return ApiResponse&lt;ContentSetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The content-sets response object. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ContentSetsResponse> getContentSetsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/content-sets";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ContentSetsResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getContentSets", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContentSetsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the number of records for a given field spread across all possible values.
   * Returns the number of records for a given field spread across all possible values that match the given criteria. Only string fields are supported. 
   * @param distinctCountRequest Request object for &#x60;distinct-count&#x60;. (required)
   * @return DistinctCountResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for distinct-count. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DistinctCountResponse getDistinctCount(DistinctCountRequest distinctCountRequest) throws ApiException {
    return getDistinctCountWithHttpInfo(distinctCountRequest).getData();
  }

  /**
   * Returns the number of records for a given field spread across all possible values.
   * Returns the number of records for a given field spread across all possible values that match the given criteria. Only string fields are supported. 
   * @param distinctCountRequest Request object for &#x60;distinct-count&#x60;. (required)
   * @return ApiResponse&lt;DistinctCountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for distinct-count. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DistinctCountResponse> getDistinctCountWithHttpInfo(DistinctCountRequest distinctCountRequest) throws ApiException {
    Object localVarPostBody = distinctCountRequest;
    
    // verify the required parameter 'distinctCountRequest' is set
    if (distinctCountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'distinctCountRequest' when calling getDistinctCount");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/distinct-count";

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
        
        DistinctCountResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getDistinctCount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDistinctCountResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the list of fields available for given content set.
   * Gets the list of fields available for a given content set (or combination of content sets). For example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc.  Both default and custom content sets are supported. 
   * @param contentSets The content sets from which the fields are requested. For example: &#x60;Factset Fundamentals&#x60;,  &#x60;Factset Funds&#x60;, etc.  (required)
   * @return FieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fields response object for the given content set(s). </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FieldsResponse getFields(java.util.List<String> contentSets) throws ApiException {
    return getFieldsWithHttpInfo(contentSets).getData();
  }

  /**
   * Get the list of fields available for given content set.
   * Gets the list of fields available for a given content set (or combination of content sets). For example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc.  Both default and custom content sets are supported. 
   * @param contentSets The content sets from which the fields are requested. For example: &#x60;Factset Fundamentals&#x60;,  &#x60;Factset Funds&#x60;, etc.  (required)
   * @return ApiResponse&lt;FieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Fields response object for the given content set(s). </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FieldsResponse> getFieldsWithHttpInfo(java.util.List<String> contentSets) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentSets' is set
    if (contentSets == null) {
      throw new ApiException(400, "Missing the required parameter 'contentSets' when calling getFields");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/fields";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contentSets", contentSets));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFieldsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all the records that match the given criteria.
   * Returns the records that match the given criteria. The request object for &#x60;Search&#x60; allows the user to get back data for fields of their choosing. Along with the fields requested, a unique identifier such as the ticker symbol will be returned in the response.  Custom search of fields actually uses &#x60;displayName&#x60;. 
   * @param searchRequest Request object for &#x60;Search&#x60;. (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for search endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse getScreenerData(SearchRequest searchRequest) throws ApiException {
    return getScreenerDataWithHttpInfo(searchRequest).getData();
  }

  /**
   * Returns all the records that match the given criteria.
   * Returns the records that match the given criteria. The request object for &#x60;Search&#x60; allows the user to get back data for fields of their choosing. Along with the fields requested, a unique identifier such as the ticker symbol will be returned in the response.  Custom search of fields actually uses &#x60;displayName&#x60;. 
   * @param searchRequest Request object for &#x60;Search&#x60;. (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for search endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getScreenerDataWithHttpInfo(SearchRequest searchRequest) throws ApiException {
    Object localVarPostBody = searchRequest;
    
    // verify the required parameter 'searchRequest' is set
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling getScreenerData");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/search";

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
        
        SearchResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getScreenerData", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getScreenerDataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the statistics and histogram data for a given field within the specified content sets.
   * Returns the statistics for a given field within the specified content sets. Only numerical fields are supported. If histogram flag is set to true, histogram data is also returned. 
   * @param statisticsRequest Request object for &#x60;Statistics&#x60;. (required)
   * @return StatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for statistics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public StatisticsResponse getStatistics(StatisticsRequest statisticsRequest) throws ApiException {
    return getStatisticsWithHttpInfo(statisticsRequest).getData();
  }

  /**
   * Returns the statistics and histogram data for a given field within the specified content sets.
   * Returns the statistics for a given field within the specified content sets. Only numerical fields are supported. If histogram flag is set to true, histogram data is also returned. 
   * @param statisticsRequest Request object for &#x60;Statistics&#x60;. (required)
   * @return ApiResponse&lt;StatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for statistics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StatisticsResponse> getStatisticsWithHttpInfo(StatisticsRequest statisticsRequest) throws ApiException {
    Object localVarPostBody = statisticsRequest;
    
    // verify the required parameter 'statisticsRequest' is set
    if (statisticsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'statisticsRequest' when calling getStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/screener/statistics";

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
        
        StatisticsResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getStatistics", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStatisticsResponseTypeMap, false);

    return apiResponse;

  }
}
