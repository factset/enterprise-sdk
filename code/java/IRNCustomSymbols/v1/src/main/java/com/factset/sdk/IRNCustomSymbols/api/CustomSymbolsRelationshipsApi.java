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

import com.factset.sdk.IRNCustomSymbols.models.ProblemDetails;
import com.factset.sdk.IRNCustomSymbols.models.SymbolRelationshipDto;
import com.factset.sdk.IRNCustomSymbols.models.SymbolRelationshipSaveDto;
import com.factset.sdk.IRNCustomSymbols.models.SymbolRelationshipUpdateDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolsRelationshipsApi {
  private ApiClient apiClient;

  public CustomSymbolsRelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomSymbolsRelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createSymbolRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> deleteSymbolRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> editAndAddSymbolRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getSymbolRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSymbolRelationshipResponseTypeMap.put(200, new GenericType<SymbolRelationshipDto>(){});
    getSymbolRelationshipResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getSymbolRelationshipResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getSymbolRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSymbolRelationshipsResponseTypeMap.put(200, new GenericType<java.util.List<SymbolRelationshipDto>>(){});
    getSymbolRelationshipsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getSymbolRelationshipsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
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
   * Create a symbol relationship
   * 
   * @param symbolRelationshipSaveDto symbolRelationship object to save (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void createSymbolRelationship(java.util.List<SymbolRelationshipSaveDto> symbolRelationshipSaveDto) throws ApiException {
    createSymbolRelationshipWithHttpInfo(symbolRelationshipSaveDto);
  }

  /**
   * Create a symbol relationship
   * 
   * @param symbolRelationshipSaveDto symbolRelationship object to save (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createSymbolRelationshipWithHttpInfo(java.util.List<SymbolRelationshipSaveDto> symbolRelationshipSaveDto) throws ApiException {
    Object localVarPostBody = symbolRelationshipSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/symbol-relationships";

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.createSymbolRelationship", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createSymbolRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a symbol relationship
   * 
   * @param symbolRelationshipId symbolRelationshipId to delete associated record (required)
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
  public void deleteSymbolRelationship(java.util.UUID symbolRelationshipId) throws ApiException {
    deleteSymbolRelationshipWithHttpInfo(symbolRelationshipId);
  }

  /**
   * Delete a symbol relationship
   * 
   * @param symbolRelationshipId symbolRelationshipId to delete associated record (required)
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
  public ApiResponse<Void> deleteSymbolRelationshipWithHttpInfo(java.util.UUID symbolRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbolRelationshipId' is set
    if (symbolRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'symbolRelationshipId' when calling deleteSymbolRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbol-relationships/{symbolRelationshipId}"
      .replaceAll("\\{" + "symbolRelationshipId" + "\\}", apiClient.escapeString(symbolRelationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.deleteSymbolRelationship", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteSymbolRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a symbol relationship
   * 
   * @param symbol  (required)
   * @param symbolRelationshipUpdateDto symbolRelationship object to save (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void editAndAddSymbolRelationship(String symbol, java.util.List<SymbolRelationshipUpdateDto> symbolRelationshipUpdateDto) throws ApiException {
    editAndAddSymbolRelationshipWithHttpInfo(symbol, symbolRelationshipUpdateDto);
  }

  /**
   * Edit a symbol relationship
   * 
   * @param symbol  (required)
   * @param symbolRelationshipUpdateDto symbolRelationship object to save (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> editAndAddSymbolRelationshipWithHttpInfo(String symbol, java.util.List<SymbolRelationshipUpdateDto> symbolRelationshipUpdateDto) throws ApiException {
    Object localVarPostBody = symbolRelationshipUpdateDto;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling editAndAddSymbolRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbol-relationships/{symbol}"
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.editAndAddSymbolRelationship", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, editAndAddSymbolRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details on a specific symbol relationship
   * 
   * @param symbolRelationshipId symbolRelationshipId to get associated record (required)
   * @return SymbolRelationshipDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public SymbolRelationshipDto getSymbolRelationship(java.util.UUID symbolRelationshipId) throws ApiException {
    return getSymbolRelationshipWithHttpInfo(symbolRelationshipId).getData();
  }

  /**
   * Get details on a specific symbol relationship
   * 
   * @param symbolRelationshipId symbolRelationshipId to get associated record (required)
   * @return ApiResponse&lt;SymbolRelationshipDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SymbolRelationshipDto> getSymbolRelationshipWithHttpInfo(java.util.UUID symbolRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbolRelationshipId' is set
    if (symbolRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'symbolRelationshipId' when calling getSymbolRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbol-relationships/{symbolRelationshipId}"
      .replaceAll("\\{" + "symbolRelationshipId" + "\\}", apiClient.escapeString(symbolRelationshipId.toString()));

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
        
        SymbolRelationshipDto
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.getSymbolRelationship", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSymbolRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of a symbol’s relationships
   * 
   * @param symbolId symbolId to get associated records (required)
   * @return java.util.List<SymbolRelationshipDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<SymbolRelationshipDto> getSymbolRelationships(java.util.UUID symbolId) throws ApiException {
    return getSymbolRelationshipsWithHttpInfo(symbolId).getData();
  }

  /**
   * Returns a list of a symbol’s relationships
   * 
   * @param symbolId symbolId to get associated records (required)
   * @return ApiResponse&lt;java.util.List<SymbolRelationshipDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<SymbolRelationshipDto>> getSymbolRelationshipsWithHttpInfo(java.util.UUID symbolId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbolId' is set
    if (symbolId == null) {
      throw new ApiException(400, "Missing the required parameter 'symbolId' when calling getSymbolRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbol-relationships/{symbolId}/relationships"
      .replaceAll("\\{" + "symbolId" + "\\}", apiClient.escapeString(symbolId.toString()));

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
        
        java.util.List<SymbolRelationshipDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.getSymbolRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSymbolRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
}
