package com.factset.sdk.IRNContacts.api;

import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiResponse;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNContacts.models.ContactRelationshipTwoSidedDto;
import com.factset.sdk.IRNContacts.models.ContactRelationshipTwoSidedSaveDto;
import com.factset.sdk.IRNContacts.models.NewItemDto;
import com.factset.sdk.IRNContacts.models.Operation;
import com.factset.sdk.IRNContacts.models.ProblemDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactsRelationshipsApi {
  private ApiClient apiClient;

  public ContactsRelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsRelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createContactRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createContactRelationshipResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createContactRelationshipResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createContactRelationshipResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteContactRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getAllRelationshipsTaggingAContactResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllRelationshipsTaggingAContactResponseTypeMap.put(200, new GenericType<java.util.List<ContactRelationshipTwoSidedDto>>(){});
    getAllRelationshipsTaggingAContactResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactRelationshipResponseTypeMap.put(200, new GenericType<ContactRelationshipTwoSidedDto>(){});
    getContactRelationshipResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactRelationshipResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> patchContactRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a contact relationship
   * 
   * @param contactRelationshipTwoSidedSaveDto contactRelationship object to save (optional)
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
  public NewItemDto createContactRelationship(ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto) throws ApiException {
    return createContactRelationshipWithHttpInfo(contactRelationshipTwoSidedSaveDto).getData();
  }

  /**
   * Create a contact relationship
   * 
   * @param contactRelationshipTwoSidedSaveDto contactRelationship object to save (optional)
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
  public ApiResponse<NewItemDto> createContactRelationshipWithHttpInfo(ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto) throws ApiException {
    Object localVarPostBody = contactRelationshipTwoSidedSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/contact-relationships";

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
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.createContactRelationship", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createContactRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to delete associated record (required)
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
  public void deleteContactRelationship(java.util.UUID contactRelationshipId) throws ApiException {
    deleteContactRelationshipWithHttpInfo(contactRelationshipId);
  }

  /**
   * Delete a contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to delete associated record (required)
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
  public ApiResponse<Void> deleteContactRelationshipWithHttpInfo(java.util.UUID contactRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling deleteContactRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-relationships/{contactRelationshipId}"
      .replaceAll("\\{" + "contactRelationshipId" + "\\}", apiClient.escapeString(contactRelationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.deleteContactRelationship", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteContactRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
   * 
   * @param symbol  (optional)
   * @param contactId  (optional)
   * @param relationshipId  (optional)
   * @return java.util.List<ContactRelationshipTwoSidedDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactRelationshipTwoSidedDto> getAllRelationshipsTaggingAContact(String symbol, java.util.UUID contactId, java.util.UUID relationshipId) throws ApiException {
    return getAllRelationshipsTaggingAContactWithHttpInfo(symbol, contactId, relationshipId).getData();
  }

  /**
   * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
   * 
   * @param symbol  (optional)
   * @param contactId  (optional)
   * @param relationshipId  (optional)
   * @return ApiResponse&lt;java.util.List<ContactRelationshipTwoSidedDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactRelationshipTwoSidedDto>> getAllRelationshipsTaggingAContactWithHttpInfo(String symbol, java.util.UUID contactId, java.util.UUID relationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/contact-relationships";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contactId", contactId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationshipId", relationshipId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<ContactRelationshipTwoSidedDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.getAllRelationshipsTaggingAContact", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllRelationshipsTaggingAContactResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details on a specific contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to get associated record (required)
   * @return ContactRelationshipTwoSidedDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ContactRelationshipTwoSidedDto getContactRelationship(java.util.UUID contactRelationshipId) throws ApiException {
    return getContactRelationshipWithHttpInfo(contactRelationshipId).getData();
  }

  /**
   * Get details on a specific contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to get associated record (required)
   * @return ApiResponse&lt;ContactRelationshipTwoSidedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ContactRelationshipTwoSidedDto> getContactRelationshipWithHttpInfo(java.util.UUID contactRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling getContactRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-relationships/{contactRelationshipId}"
      .replaceAll("\\{" + "contactRelationshipId" + "\\}", apiClient.escapeString(contactRelationshipId.toString()));

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
        
        ContactRelationshipTwoSidedDto
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.getContactRelationship", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update a contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to update associated record (required)
   * @param operation contactRelationshipPatch object to update (optional)
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
  public void patchContactRelationship(java.util.UUID contactRelationshipId, java.util.List<Operation> operation) throws ApiException {
    patchContactRelationshipWithHttpInfo(contactRelationshipId, operation);
  }

  /**
   * Update a contact relationship
   * 
   * @param contactRelationshipId contactRelationshipId to update associated record (required)
   * @param operation contactRelationshipPatch object to update (optional)
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
  public ApiResponse<Void> patchContactRelationshipWithHttpInfo(java.util.UUID contactRelationshipId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling patchContactRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contact-relationships/{contactRelationshipId}"
      .replaceAll("\\{" + "contactRelationshipId" + "\\}", apiClient.escapeString(contactRelationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.patchContactRelationship", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchContactRelationshipResponseTypeMap, false);

    return apiResponse;

  }
}
