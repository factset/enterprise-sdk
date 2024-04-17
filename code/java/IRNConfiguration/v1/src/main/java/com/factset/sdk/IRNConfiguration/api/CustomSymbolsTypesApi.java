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

import com.factset.sdk.IRNConfiguration.models.CustomSymbolCustomFieldConfigDto;
import com.factset.sdk.IRNConfiguration.models.CustomSymbolTypeDetailDto;
import com.factset.sdk.IRNConfiguration.models.CustomSymbolTypeDto;
import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;
import com.factset.sdk.IRNConfiguration.models.ReorderCustomSymbolTypeDto;
import com.factset.sdk.IRNConfiguration.models.SaveCustomSymbolTypeDto;
import com.factset.sdk.IRNConfiguration.models.UpdateCustomSymbolTypeDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolsTypesApi {
  private ApiClient apiClient;

  public CustomSymbolsTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomSymbolsTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createCustomSymbolTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCustomSymbolTypeResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createCustomSymbolTypeResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createCustomSymbolTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteCustomSymbolTypeAsyncResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getCustomSymbolTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolTypeResponseTypeMap.put(200, new GenericType<CustomSymbolTypeDetailDto>(){});
    getCustomSymbolTypeResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getCustomSymbolTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCustomSymbolTypesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolTypesResponseTypeMap.put(200, new GenericType<java.util.List<CustomSymbolTypeDto>>(){});
  }

  private static final Map<Integer, GenericType> getSymbolCustomFieldsForCustomSymbolTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSymbolCustomFieldsForCustomSymbolTypeResponseTypeMap.put(200, new GenericType<java.util.List<CustomSymbolCustomFieldConfigDto>>(){});
    getSymbolCustomFieldsForCustomSymbolTypeResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getSymbolCustomFieldsForCustomSymbolTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> updateCustomSymbolTypeResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> updateCustomSymbolTypeOrderResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a Custom symbol type
   * 
   * @param saveCustomSymbolTypeDto saveCustomSymbolTypeDto object to save (optional)
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
  public NewItemDto createCustomSymbolType(SaveCustomSymbolTypeDto saveCustomSymbolTypeDto) throws ApiException {
    return createCustomSymbolTypeWithHttpInfo(saveCustomSymbolTypeDto).getData();
  }

  /**
   * Create a Custom symbol type
   * 
   * @param saveCustomSymbolTypeDto saveCustomSymbolTypeDto object to save (optional)
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
  public ApiResponse<NewItemDto> createCustomSymbolTypeWithHttpInfo(SaveCustomSymbolTypeDto saveCustomSymbolTypeDto) throws ApiException {
    Object localVarPostBody = saveCustomSymbolTypeDto;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types";

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
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.createCustomSymbolType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCustomSymbolTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Custom symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to delete associated record (required)
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
  public void deleteCustomSymbolTypeAsync(java.util.UUID customSymbolTypeId) throws ApiException {
    deleteCustomSymbolTypeAsyncWithHttpInfo(customSymbolTypeId);
  }

  /**
   * Delete a Custom symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to delete associated record (required)
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
  public ApiResponse<Void> deleteCustomSymbolTypeAsyncWithHttpInfo(java.util.UUID customSymbolTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolTypeId' is set
    if (customSymbolTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolTypeId' when calling deleteCustomSymbolTypeAsync");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types/{customSymbolTypeId}"
      .replaceAll("\\{" + "customSymbolTypeId" + "\\}", apiClient.escapeString(customSymbolTypeId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.deleteCustomSymbolTypeAsync", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteCustomSymbolTypeAsyncResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a specific Custom symbol type&#39;s details
   * 
   * @param customSymbolTypeId customSymbolTypeId to get associated record (required)
   * @return CustomSymbolTypeDetailDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public CustomSymbolTypeDetailDto getCustomSymbolType(java.util.UUID customSymbolTypeId) throws ApiException {
    return getCustomSymbolTypeWithHttpInfo(customSymbolTypeId).getData();
  }

  /**
   * Get a specific Custom symbol type&#39;s details
   * 
   * @param customSymbolTypeId customSymbolTypeId to get associated record (required)
   * @return ApiResponse&lt;CustomSymbolTypeDetailDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomSymbolTypeDetailDto> getCustomSymbolTypeWithHttpInfo(java.util.UUID customSymbolTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolTypeId' is set
    if (customSymbolTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolTypeId' when calling getCustomSymbolType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types/{customSymbolTypeId}"
      .replaceAll("\\{" + "customSymbolTypeId" + "\\}", apiClient.escapeString(customSymbolTypeId.toString()));

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
        
        CustomSymbolTypeDetailDto
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.getCustomSymbolType", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the custom symbol types
   * 
   * @return java.util.List<CustomSymbolTypeDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomSymbolTypeDto> getCustomSymbolTypes() throws ApiException {
    return getCustomSymbolTypesWithHttpInfo().getData();
  }

  /**
   * Get all the custom symbol types
   * 
   * @return ApiResponse&lt;java.util.List<CustomSymbolTypeDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomSymbolTypeDto>> getCustomSymbolTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types";

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
        
        java.util.List<CustomSymbolTypeDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.getCustomSymbolTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolTypesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Custom fields for Custom Symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to get associated Custom fileds (required)
   * @return java.util.List<CustomSymbolCustomFieldConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomSymbolCustomFieldConfigDto> getSymbolCustomFieldsForCustomSymbolType(java.util.UUID customSymbolTypeId) throws ApiException {
    return getSymbolCustomFieldsForCustomSymbolTypeWithHttpInfo(customSymbolTypeId).getData();
  }

  /**
   * Get Custom fields for Custom Symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to get associated Custom fileds (required)
   * @return ApiResponse&lt;java.util.List<CustomSymbolCustomFieldConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomSymbolCustomFieldConfigDto>> getSymbolCustomFieldsForCustomSymbolTypeWithHttpInfo(java.util.UUID customSymbolTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolTypeId' is set
    if (customSymbolTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolTypeId' when calling getSymbolCustomFieldsForCustomSymbolType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types/{customSymbolTypeId}/custom-fields"
      .replaceAll("\\{" + "customSymbolTypeId" + "\\}", apiClient.escapeString(customSymbolTypeId.toString()));

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
        
        java.util.List<CustomSymbolCustomFieldConfigDto>
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.getSymbolCustomFieldsForCustomSymbolType", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSymbolCustomFieldsForCustomSymbolTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a Custom symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to update associated record (required)
   * @param updateCustomSymbolTypeDto updateCustomSymbolTypeDto object to update (optional)
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
  public void updateCustomSymbolType(java.util.UUID customSymbolTypeId, UpdateCustomSymbolTypeDto updateCustomSymbolTypeDto) throws ApiException {
    updateCustomSymbolTypeWithHttpInfo(customSymbolTypeId, updateCustomSymbolTypeDto);
  }

  /**
   * Edit a Custom symbol type
   * 
   * @param customSymbolTypeId customSymbolTypeId to update associated record (required)
   * @param updateCustomSymbolTypeDto updateCustomSymbolTypeDto object to update (optional)
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
  public ApiResponse<Void> updateCustomSymbolTypeWithHttpInfo(java.util.UUID customSymbolTypeId, UpdateCustomSymbolTypeDto updateCustomSymbolTypeDto) throws ApiException {
    Object localVarPostBody = updateCustomSymbolTypeDto;
    
    // verify the required parameter 'customSymbolTypeId' is set
    if (customSymbolTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolTypeId' when calling updateCustomSymbolType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types/{customSymbolTypeId}"
      .replaceAll("\\{" + "customSymbolTypeId" + "\\}", apiClient.escapeString(customSymbolTypeId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.updateCustomSymbolType", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateCustomSymbolTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * 
   * @param reorderCustomSymbolTypeDto  (optional)
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
  public void updateCustomSymbolTypeOrder(ReorderCustomSymbolTypeDto reorderCustomSymbolTypeDto) throws ApiException {
    updateCustomSymbolTypeOrderWithHttpInfo(reorderCustomSymbolTypeDto);
  }

  /**
   * 
   * 
   * @param reorderCustomSymbolTypeDto  (optional)
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
  public ApiResponse<Void> updateCustomSymbolTypeOrderWithHttpInfo(ReorderCustomSymbolTypeDto reorderCustomSymbolTypeDto) throws ApiException {
    Object localVarPostBody = reorderCustomSymbolTypeDto;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-types/reorder";

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsTypesApi.updateCustomSymbolTypeOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateCustomSymbolTypeOrderResponseTypeMap, false);

    return apiResponse;

  }
}
