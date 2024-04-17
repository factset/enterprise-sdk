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

import com.factset.sdk.IRNConfiguration.models.CreateCustomSymbolCustomFieldDto;
import com.factset.sdk.IRNConfiguration.models.CustomSymbolCustomFieldConfigDto;
import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.Operation;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomSymbolsCustomFieldsApi {
  private ApiClient apiClient;

  public CustomSymbolsCustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomSymbolsCustomFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createCustomSymbolCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCustomSymbolCustomFieldResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createCustomSymbolCustomFieldResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createCustomSymbolCustomFieldResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteCustomSymbolCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getCustomSymbolCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolCustomFieldResponseTypeMap.put(200, new GenericType<CustomSymbolCustomFieldConfigDto>(){});
    getCustomSymbolCustomFieldResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getCustomSymbolCustomFieldResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCustomSymbolCustomFieldsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomSymbolCustomFieldsResponseTypeMap.put(200, new GenericType<java.util.List<CustomSymbolCustomFieldConfigDto>>(){});
  }

  private static final Map<Integer, GenericType> patchCustomSymbolCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a Custom symbol custom field
   * 
   * @param createCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto object to save (optional)
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
  public NewItemDto createCustomSymbolCustomField(CreateCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto) throws ApiException {
    return createCustomSymbolCustomFieldWithHttpInfo(createCustomSymbolCustomFieldDto).getData();
  }

  /**
   * Create a Custom symbol custom field
   * 
   * @param createCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto object to save (optional)
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
  public ApiResponse<NewItemDto> createCustomSymbolCustomFieldWithHttpInfo(CreateCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto) throws ApiException {
    Object localVarPostBody = createCustomSymbolCustomFieldDto;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-custom-fields";

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
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsCustomFieldsApi.createCustomSymbolCustomField", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCustomSymbolCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Custom symbol custom field
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to delete associated record (required)
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
  public void deleteCustomSymbolCustomField(java.util.UUID customSymbolCustomFieldId) throws ApiException {
    deleteCustomSymbolCustomFieldWithHttpInfo(customSymbolCustomFieldId);
  }

  /**
   * Delete a Custom symbol custom field
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to delete associated record (required)
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
  public ApiResponse<Void> deleteCustomSymbolCustomFieldWithHttpInfo(java.util.UUID customSymbolCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolCustomFieldId' is set
    if (customSymbolCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolCustomFieldId' when calling deleteCustomSymbolCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-custom-fields/{customSymbolCustomFieldId}"
      .replaceAll("\\{" + "customSymbolCustomFieldId" + "\\}", apiClient.escapeString(customSymbolCustomFieldId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsCustomFieldsApi.deleteCustomSymbolCustomField", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteCustomSymbolCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a specific Custom symbol custom field&#39;s details
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to get associated record (required)
   * @return CustomSymbolCustomFieldConfigDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public CustomSymbolCustomFieldConfigDto getCustomSymbolCustomField(java.util.UUID customSymbolCustomFieldId) throws ApiException {
    return getCustomSymbolCustomFieldWithHttpInfo(customSymbolCustomFieldId).getData();
  }

  /**
   * Get a specific Custom symbol custom field&#39;s details
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to get associated record (required)
   * @return ApiResponse&lt;CustomSymbolCustomFieldConfigDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomSymbolCustomFieldConfigDto> getCustomSymbolCustomFieldWithHttpInfo(java.util.UUID customSymbolCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customSymbolCustomFieldId' is set
    if (customSymbolCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolCustomFieldId' when calling getCustomSymbolCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-custom-fields/{customSymbolCustomFieldId}"
      .replaceAll("\\{" + "customSymbolCustomFieldId" + "\\}", apiClient.escapeString(customSymbolCustomFieldId.toString()));

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
        
        CustomSymbolCustomFieldConfigDto
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsCustomFieldsApi.getCustomSymbolCustomField", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the Custom symbol custom fields
   * 
   * @return java.util.List<CustomSymbolCustomFieldConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomSymbolCustomFieldConfigDto> getCustomSymbolCustomFields() throws ApiException {
    return getCustomSymbolCustomFieldsWithHttpInfo().getData();
  }

  /**
   * Get all the Custom symbol custom fields
   * 
   * @return ApiResponse&lt;java.util.List<CustomSymbolCustomFieldConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomSymbolCustomFieldConfigDto>> getCustomSymbolCustomFieldsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-custom-fields";

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
      
    > apiResponse = apiClient.invokeAPI("CustomSymbolsCustomFieldsApi.getCustomSymbolCustomFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomSymbolCustomFieldsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a Custom symbol custom field
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to update associated record (required)
   * @param operation customSymbolCustomFieldUpdateDto object to update (optional)
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
  public void patchCustomSymbolCustomField(java.util.UUID customSymbolCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    patchCustomSymbolCustomFieldWithHttpInfo(customSymbolCustomFieldId, operation);
  }

  /**
   * Edit a Custom symbol custom field
   * 
   * @param customSymbolCustomFieldId customSymbolCustomFieldId to update associated record (required)
   * @param operation customSymbolCustomFieldUpdateDto object to update (optional)
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
  public ApiResponse<Void> patchCustomSymbolCustomFieldWithHttpInfo(java.util.UUID customSymbolCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'customSymbolCustomFieldId' is set
    if (customSymbolCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customSymbolCustomFieldId' when calling patchCustomSymbolCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/custom-symbol-custom-fields/{customSymbolCustomFieldId}"
      .replaceAll("\\{" + "customSymbolCustomFieldId" + "\\}", apiClient.escapeString(customSymbolCustomFieldId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CustomSymbolsCustomFieldsApi.patchCustomSymbolCustomField", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchCustomSymbolCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
}
