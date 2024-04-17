package com.factset.sdk.IRNCustomSymbols.api;

import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiResponse;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNCustomSymbols.models.CreateCustomSymbolDto;
import com.factset.sdk.IRNCustomSymbols.models.CustomSymbolDto;
import com.factset.sdk.IRNCustomSymbols.models.NewItemDto;
import com.factset.sdk.IRNCustomSymbols.models.Operation;
import com.factset.sdk.IRNCustomSymbols.models.ProblemDetails;
import com.factset.sdk.IRNCustomSymbols.models.RecordPreviewDto;
import com.factset.sdk.IRNCustomSymbols.models.StandardSymbolDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolsApi {
  private ApiClient apiClient;

  public CustomSymbolsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomSymbolsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createCustomSymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCustomSymbolResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createCustomSymbolResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createCustomSymbolResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteCustomSymbolResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getCustomSymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolResponseTypeMap.put(200, new GenericType<CustomSymbolDto>(){});
  }

  private static final Map<Integer, GenericType> getCustomSymbolRecordsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolRecordsResponseTypeMap.put(200, new GenericType<java.util.List<RecordPreviewDto>>(){});
    getCustomSymbolRecordsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getCustomSymbolRecordsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCustomSymbolsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolsResponseTypeMap.put(200, new GenericType<java.util.List<CustomSymbolDto>>(){});
    getCustomSymbolsResponseTypeMap.put(404, new GenericType<String>(){});
    getCustomSymbolsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> linkCustomSymbolToStandardSymbolResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> patchCustomSymbolResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a custom symbol
   * 
   * @param createCustomSymbolDto createCustomSymbolDto object to save (optional)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createCustomSymbol(CreateCustomSymbolDto createCustomSymbolDto) throws ApiException {
    return createCustomSymbolWithHttpInfo(createCustomSymbolDto).getData();
  }

  /**
   * Create a custom symbol
   * 
   * @param createCustomSymbolDto createCustomSymbolDto object to save (optional)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createCustomSymbolWithHttpInfo(CreateCustomSymbolDto createCustomSymbolDto) throws ApiException {
    Object localVarPostBody = createCustomSymbolDto;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols";

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NewItemDto
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.createCustomSymbol", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCustomSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a custom symbol
   * 
   * @param customSymbolId customSymbolId to delete associated custom symbol (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCustomSymbol(java.util.UUID customSymbolId) throws ApiException {
    deleteCustomSymbolWithHttpInfo(customSymbolId);
  }

  /**
   * Delete a custom symbol
   * 
   * @param customSymbolId customSymbolId to delete associated custom symbol (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomSymbolWithHttpInfo(java.util.UUID customSymbolId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolId' is set
    if (customSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolId' when calling deleteCustomSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/{customSymbolId}"
      .replaceAll("\\{" + "customSymbolId" + "\\}", apiClient.escapeString(customSymbolId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.deleteCustomSymbol", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteCustomSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all custom field and standard field details on a specific custom symbol
   * 
   * @param customSymbolId customSymbolId to get associated custom symbol (required)
   * @param includeEvent Whether or not to include event (optional, default to false)
   * @return CustomSymbolDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomSymbolDto getCustomSymbol(java.util.UUID customSymbolId, Boolean includeEvent) throws ApiException {
    return getCustomSymbolWithHttpInfo(customSymbolId, includeEvent).getData();
  }

  /**
   * Get all custom field and standard field details on a specific custom symbol
   * 
   * @param customSymbolId customSymbolId to get associated custom symbol (required)
   * @param includeEvent Whether or not to include event (optional, default to false)
   * @return ApiResponse&lt;CustomSymbolDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomSymbolDto> getCustomSymbolWithHttpInfo(java.util.UUID customSymbolId, Boolean includeEvent) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolId' is set
    if (customSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolId' when calling getCustomSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/{customSymbolId}"
      .replaceAll("\\{" + "customSymbolId" + "\\}", apiClient.escapeString(customSymbolId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeEvent", includeEvent));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CustomSymbolDto
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.getCustomSymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
   * 
   * @param customSymbolId CustomSymbolId to get associated records (required)
   * @return java.util.List<RecordPreviewDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RecordPreviewDto> getCustomSymbolRecords(java.util.UUID customSymbolId) throws ApiException {
    return getCustomSymbolRecordsWithHttpInfo(customSymbolId).getData();
  }

  /**
   * Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
   * 
   * @param customSymbolId CustomSymbolId to get associated records (required)
   * @return ApiResponse&lt;java.util.List<RecordPreviewDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RecordPreviewDto>> getCustomSymbolRecordsWithHttpInfo(java.util.UUID customSymbolId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolId' is set
    if (customSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolId' when calling getCustomSymbolRecords");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/{customSymbolId}/records"
      .replaceAll("\\{" + "customSymbolId" + "\\}", apiClient.escapeString(customSymbolId.toString()));

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
        
        java.util.List<RecordPreviewDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.getCustomSymbolRecords", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolRecordsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get list of all custom symbols in your group along with some of their standard field and custom fields data
   * 
   * @param typeName filter custom symbols based on custom symbol type (optional)
   * @param query filter custom symbols based on custom symbol code or name (optional)
   * @param includeCustomFieldValues Whether or not to include customFieldValues (optional, default to false)
   * @param excludeLinkedCustomSymbol Whether or not to exclude linked custom symbol (optional, default to false)
   * @param includeEvent Whether or not to include event (optional, default to true)
   * @return java.util.List<CustomSymbolDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomSymbolDto> getCustomSymbols(String typeName, String query, Boolean includeCustomFieldValues, Boolean excludeLinkedCustomSymbol, Boolean includeEvent) throws ApiException {
    return getCustomSymbolsWithHttpInfo(typeName, query, includeCustomFieldValues, excludeLinkedCustomSymbol, includeEvent).getData();
  }

  /**
   * Get list of all custom symbols in your group along with some of their standard field and custom fields data
   * 
   * @param typeName filter custom symbols based on custom symbol type (optional)
   * @param query filter custom symbols based on custom symbol code or name (optional)
   * @param includeCustomFieldValues Whether or not to include customFieldValues (optional, default to false)
   * @param excludeLinkedCustomSymbol Whether or not to exclude linked custom symbol (optional, default to false)
   * @param includeEvent Whether or not to include event (optional, default to true)
   * @return ApiResponse&lt;java.util.List<CustomSymbolDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomSymbolDto>> getCustomSymbolsWithHttpInfo(String typeName, String query, Boolean includeCustomFieldValues, Boolean excludeLinkedCustomSymbol, Boolean includeEvent) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeName", typeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCustomFieldValues", includeCustomFieldValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeLinkedCustomSymbol", excludeLinkedCustomSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeEvent", includeEvent));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<CustomSymbolDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.getCustomSymbols", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Link custom symbol to standard symbol
   * 
   * @param customSymbolId customSymbolId associated with custom symbol (required)
   * @param standardSymbolDto standard symbol name (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void linkCustomSymbolToStandardSymbol(java.util.UUID customSymbolId, StandardSymbolDto standardSymbolDto) throws ApiException {
    linkCustomSymbolToStandardSymbolWithHttpInfo(customSymbolId, standardSymbolDto);
  }

  /**
   * Link custom symbol to standard symbol
   * 
   * @param customSymbolId customSymbolId associated with custom symbol (required)
   * @param standardSymbolDto standard symbol name (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> linkCustomSymbolToStandardSymbolWithHttpInfo(java.util.UUID customSymbolId, StandardSymbolDto standardSymbolDto) throws ApiException {
    Object localVarPostBody = standardSymbolDto;
    
    // verify the required parameter 'customSymbolId' is set
    if (customSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolId' when calling linkCustomSymbolToStandardSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/{customSymbolId}/link-standard-symbol"
      .replaceAll("\\{" + "customSymbolId" + "\\}", apiClient.escapeString(customSymbolId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.linkCustomSymbolToStandardSymbol", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, linkCustomSymbolToStandardSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a custom symbol’s standard field and custom field data
   * 
   * @param customSymbolId customSymbolId to update associated custom symbol (required)
   * @param operation updateCustomSymbolDto object to update (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void patchCustomSymbol(java.util.UUID customSymbolId, java.util.List<Operation> operation) throws ApiException {
    patchCustomSymbolWithHttpInfo(customSymbolId, operation);
  }

  /**
   * Edit a custom symbol’s standard field and custom field data
   * 
   * @param customSymbolId customSymbolId to update associated custom symbol (required)
   * @param operation updateCustomSymbolDto object to update (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> patchCustomSymbolWithHttpInfo(java.util.UUID customSymbolId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'customSymbolId' is set
    if (customSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolId' when calling patchCustomSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/{customSymbolId}"
      .replaceAll("\\{" + "customSymbolId" + "\\}", apiClient.escapeString(customSymbolId.toString()));

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("CustomSymbolsApi.patchCustomSymbol", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchCustomSymbolResponseTypeMap, false);

    return apiResponse;

  }
}
