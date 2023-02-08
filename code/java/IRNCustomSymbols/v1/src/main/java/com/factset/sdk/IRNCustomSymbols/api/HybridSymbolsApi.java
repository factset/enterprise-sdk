package com.factset.sdk.IRNCustomSymbols.api;

import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiResponse;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNCustomSymbols.models.CreateStandardSymbolMetadataDto;
import com.factset.sdk.IRNCustomSymbols.models.NewItemDto;
import com.factset.sdk.IRNCustomSymbols.models.Operation;
import com.factset.sdk.IRNCustomSymbols.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HybridSymbolsApi {
  private ApiClient apiClient;

  public HybridSymbolsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HybridSymbolsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createStandardSymbolMetadataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createStandardSymbolMetadataResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createStandardSymbolMetadataResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createStandardSymbolMetadataResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getStandardSymbolMetadataGuidResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStandardSymbolMetadataGuidResponseTypeMap.put(200, new GenericType<java.util.UUID>(){});
    getStandardSymbolMetadataGuidResponseTypeMap.put(404, new GenericType<String>(){});
    getStandardSymbolMetadataGuidResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> patchStandardSymbolResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create standard symbol metadata
   * 
   * @param createStandardSymbolMetadataDto createStandardSymbolMetadataDto object to save (optional)
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
  public NewItemDto createStandardSymbolMetadata(CreateStandardSymbolMetadataDto createStandardSymbolMetadataDto) throws ApiException {
    return createStandardSymbolMetadataWithHttpInfo(createStandardSymbolMetadataDto).getData();
  }

  /**
   * Create standard symbol metadata
   * 
   * @param createStandardSymbolMetadataDto createStandardSymbolMetadataDto object to save (optional)
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
  public ApiResponse<NewItemDto> createStandardSymbolMetadataWithHttpInfo(CreateStandardSymbolMetadataDto createStandardSymbolMetadataDto) throws ApiException {
    Object localVarPostBody = createStandardSymbolMetadataDto;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/standard-symbol-metadata";

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
      
    > apiResponse = apiClient.invokeAPI("HybridSymbolsApi.createStandardSymbolMetadata", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createStandardSymbolMetadataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all custom field and standard field details on a specific standard symbol
   * 
   * @param standardSymbol Standard symbol to get associated customSymbolId (required)
   * @return java.util.UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.UUID getStandardSymbolMetadataGuid(String standardSymbol) throws ApiException {
    return getStandardSymbolMetadataGuidWithHttpInfo(standardSymbol).getData();
  }

  /**
   * Get all custom field and standard field details on a specific standard symbol
   * 
   * @param standardSymbol Standard symbol to get associated customSymbolId (required)
   * @return ApiResponse&lt;java.util.UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.UUID> getStandardSymbolMetadataGuidWithHttpInfo(String standardSymbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'standardSymbol' is set
    if (standardSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'standardSymbol' when calling getStandardSymbolMetadataGuid");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/standard-symbol-metadata/{standardSymbol}"
      .replaceAll("\\{" + "standardSymbol" + "\\}", apiClient.escapeString(standardSymbol.toString()));

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
        
        java.util.UUID
      
    > apiResponse = apiClient.invokeAPI("HybridSymbolsApi.getStandardSymbolMetadataGuid", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStandardSymbolMetadataGuidResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a standard symbol’s standard field and custom field data
   * 
   * @param standardSymbolId standardSymbolId to update associated standard symbol (required)
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
  public void patchStandardSymbol(java.util.UUID standardSymbolId, java.util.List<Operation> operation) throws ApiException {
    patchStandardSymbolWithHttpInfo(standardSymbolId, operation);
  }

  /**
   * Edit a standard symbol’s standard field and custom field data
   * 
   * @param standardSymbolId standardSymbolId to update associated standard symbol (required)
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
  public ApiResponse<Void> patchStandardSymbolWithHttpInfo(java.util.UUID standardSymbolId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'standardSymbolId' is set
    if (standardSymbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'standardSymbolId' when calling patchStandardSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbols/standard-symbol-metadata/{standardSymbolId}"
      .replaceAll("\\{" + "standardSymbolId" + "\\}", apiClient.escapeString(standardSymbolId.toString()));

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
    > apiResponse = apiClient.invokeAPI("HybridSymbolsApi.patchStandardSymbol", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchStandardSymbolResponseTypeMap, false);

    return apiResponse;

  }
}
