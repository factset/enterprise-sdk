package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNConfiguration.models.ContactCustomFieldDto;
import com.factset.sdk.IRNConfiguration.models.ContactCustomFieldSaveDto;
import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.Operation;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactsCustomFieldsApi {
  private ApiClient apiClient;

  public ContactsCustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsCustomFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createContactCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createContactCustomFieldResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createContactCustomFieldResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createContactCustomFieldResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteContactCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getContactCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactCustomFieldResponseTypeMap.put(200, new GenericType<ContactCustomFieldDto>(){});
    getContactCustomFieldResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactCustomFieldResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactCustomFieldsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactCustomFieldsResponseTypeMap.put(200, new GenericType<java.util.List<ContactCustomFieldDto>>(){});
  }

  private static final Map<Integer, GenericType> patchContactCustomFieldResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a contact custom field
   * 
   * @param contactCustomFieldSaveDto ContactCustomFieldSaveDto object to save (optional)
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
  public NewItemDto createContactCustomField(ContactCustomFieldSaveDto contactCustomFieldSaveDto) throws ApiException {
    return createContactCustomFieldWithHttpInfo(contactCustomFieldSaveDto).getData();
  }

  /**
   * Create a contact custom field
   * 
   * @param contactCustomFieldSaveDto ContactCustomFieldSaveDto object to save (optional)
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
  public ApiResponse<NewItemDto> createContactCustomFieldWithHttpInfo(ContactCustomFieldSaveDto contactCustomFieldSaveDto) throws ApiException {
    Object localVarPostBody = contactCustomFieldSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields";

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
      
    > apiResponse = apiClient.invokeAPI("ContactsCustomFieldsApi.createContactCustomField", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createContactCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a contact custom field
   * 
   * @param contactCustomFieldId contactCustomFieldId to delete associated record (required)
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
  public void deleteContactCustomField(java.util.UUID contactCustomFieldId) throws ApiException {
    deleteContactCustomFieldWithHttpInfo(contactCustomFieldId);
  }

  /**
   * Delete a contact custom field
   * 
   * @param contactCustomFieldId contactCustomFieldId to delete associated record (required)
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
  public ApiResponse<Void> deleteContactCustomFieldWithHttpInfo(java.util.UUID contactCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling deleteContactCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields/{contactCustomFieldId}"
      .replaceAll("\\{" + "contactCustomFieldId" + "\\}", apiClient.escapeString(contactCustomFieldId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsCustomFieldsApi.deleteContactCustomField", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteContactCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a specific Contact custom field&#39;s details
   * 
   * @param contactCustomFieldId contactCustomFieldId to get associated record (required)
   * @return ContactCustomFieldDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ContactCustomFieldDto getContactCustomField(java.util.UUID contactCustomFieldId) throws ApiException {
    return getContactCustomFieldWithHttpInfo(contactCustomFieldId).getData();
  }

  /**
   * Get a specific Contact custom field&#39;s details
   * 
   * @param contactCustomFieldId contactCustomFieldId to get associated record (required)
   * @return ApiResponse&lt;ContactCustomFieldDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ContactCustomFieldDto> getContactCustomFieldWithHttpInfo(java.util.UUID contactCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling getContactCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields/{contactCustomFieldId}"
      .replaceAll("\\{" + "contactCustomFieldId" + "\\}", apiClient.escapeString(contactCustomFieldId.toString()));

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
        
        ContactCustomFieldDto
      
    > apiResponse = apiClient.invokeAPI("ContactsCustomFieldsApi.getContactCustomField", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the contact custom fields
   * 
   * @return java.util.List<ContactCustomFieldDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactCustomFieldDto> getContactCustomFields() throws ApiException {
    return getContactCustomFieldsWithHttpInfo().getData();
  }

  /**
   * Get all the contact custom fields
   * 
   * @return ApiResponse&lt;java.util.List<ContactCustomFieldDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactCustomFieldDto>> getContactCustomFieldsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields";

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
        
        java.util.List<ContactCustomFieldDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsCustomFieldsApi.getContactCustomFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactCustomFieldsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a contact custom field
   * 
   * @param contactCustomFieldId contactCustomFieldId to update associated record (required)
   * @param operation contactCustomFieldUpdateDto object to update (optional)
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
  public void patchContactCustomField(java.util.UUID contactCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    patchContactCustomFieldWithHttpInfo(contactCustomFieldId, operation);
  }

  /**
   * Edit a contact custom field
   * 
   * @param contactCustomFieldId contactCustomFieldId to update associated record (required)
   * @param operation contactCustomFieldUpdateDto object to update (optional)
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
  public ApiResponse<Void> patchContactCustomFieldWithHttpInfo(java.util.UUID contactCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling patchContactCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields/{contactCustomFieldId}"
      .replaceAll("\\{" + "contactCustomFieldId" + "\\}", apiClient.escapeString(contactCustomFieldId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsCustomFieldsApi.patchContactCustomField", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchContactCustomFieldResponseTypeMap, false);

    return apiResponse;

  }
}
