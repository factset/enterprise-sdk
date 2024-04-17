package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;
import com.factset.sdk.IRNConfiguration.models.SymbolsRelationShipSaveDto;
import com.factset.sdk.IRNConfiguration.models.SymbolsRelationshipDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolsRelationshipsApi {
  private ApiClient apiClient;

  public CustomSymbolsRelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomSymbolsRelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createSymbolRelationshipTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createSymbolRelationshipTypeResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createSymbolRelationshipTypeResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createSymbolRelationshipTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteSymbolsRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> editSymbolsRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getSymbolsRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSymbolsRelationshipsResponseTypeMap.put(200, new GenericType<java.util.List<SymbolsRelationshipDto>>(){});
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
   * @param symbolsRelationShipSaveDto symbolsRelationshipSaveDto object to save (optional)
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
  public NewItemDto createSymbolRelationshipType(SymbolsRelationShipSaveDto symbolsRelationShipSaveDto) throws ApiException {
    return createSymbolRelationshipTypeWithHttpInfo(symbolsRelationShipSaveDto).getData();
  }

  /**
   * Create a symbol relationship
   * 
   * @param symbolsRelationShipSaveDto symbolsRelationshipSaveDto object to save (optional)
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
  public ApiResponse<NewItemDto> createSymbolRelationshipTypeWithHttpInfo(SymbolsRelationShipSaveDto symbolsRelationShipSaveDto) throws ApiException {
    Object localVarPostBody = symbolsRelationShipSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/symbols-relationships";

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
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.createSymbolRelationshipType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createSymbolRelationshipTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a symbol relationship
   * 
   * @param symbolsRelationshipId symbolsRelationshipId to delete associated record (required)
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
  public void deleteSymbolsRelationship(java.util.UUID symbolsRelationshipId) throws ApiException {
    deleteSymbolsRelationshipWithHttpInfo(symbolsRelationshipId);
  }

  /**
   * Delete a symbol relationship
   * 
   * @param symbolsRelationshipId symbolsRelationshipId to delete associated record (required)
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
  public ApiResponse<Void> deleteSymbolsRelationshipWithHttpInfo(java.util.UUID symbolsRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbolsRelationshipId' is set
    if (symbolsRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'symbolsRelationshipId' when calling deleteSymbolsRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbols-relationships/{symbolsRelationshipId}"
      .replaceAll("\\{" + "symbolsRelationshipId" + "\\}", apiClient.escapeString(symbolsRelationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.deleteSymbolsRelationship", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteSymbolsRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a symbol relationship
   * 
   * @param symbolsRelationshipId symbolsRelationshipId to update associated record (required)
   * @param symbolsRelationShipSaveDto SymbolsRelationShipSaveDto object to update (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void editSymbolsRelationship(java.util.UUID symbolsRelationshipId, SymbolsRelationShipSaveDto symbolsRelationShipSaveDto) throws ApiException {
    editSymbolsRelationshipWithHttpInfo(symbolsRelationshipId, symbolsRelationShipSaveDto);
  }

  /**
   * Edit a symbol relationship
   * 
   * @param symbolsRelationshipId symbolsRelationshipId to update associated record (required)
   * @param symbolsRelationShipSaveDto SymbolsRelationShipSaveDto object to update (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> editSymbolsRelationshipWithHttpInfo(java.util.UUID symbolsRelationshipId, SymbolsRelationShipSaveDto symbolsRelationShipSaveDto) throws ApiException {
    Object localVarPostBody = symbolsRelationShipSaveDto;
    
    // verify the required parameter 'symbolsRelationshipId' is set
    if (symbolsRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'symbolsRelationshipId' when calling editSymbolsRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/symbols-relationships/{symbolsRelationshipId}"
      .replaceAll("\\{" + "symbolsRelationshipId" + "\\}", apiClient.escapeString(symbolsRelationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.editSymbolsRelationship", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, editSymbolsRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the Symbols Relationships
   * 
   * @return java.util.List<SymbolsRelationshipDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<SymbolsRelationshipDto> getSymbolsRelationships() throws ApiException {
    return getSymbolsRelationshipsWithHttpInfo().getData();
  }

  /**
   * Get all the Symbols Relationships
   * 
   * @return ApiResponse&lt;java.util.List<SymbolsRelationshipDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<SymbolsRelationshipDto>> getSymbolsRelationshipsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/symbols-relationships";

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
        
        java.util.List<SymbolsRelationshipDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsRelationshipsApi.getSymbolsRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSymbolsRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
}
