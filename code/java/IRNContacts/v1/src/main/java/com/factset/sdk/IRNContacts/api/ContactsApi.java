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

import com.factset.sdk.IRNContacts.models.ContactDto;
import com.factset.sdk.IRNContacts.models.ContactEventDto;
import com.factset.sdk.IRNContacts.models.ContactRelationshipDto;
import com.factset.sdk.IRNContacts.models.ContactSaveDto;
import com.factset.sdk.IRNContacts.models.ContactSummaryDto;
import com.factset.sdk.IRNContacts.models.NewItemDto;
import com.factset.sdk.IRNContacts.models.Operation;
import com.factset.sdk.IRNContacts.models.ProblemDetails;
import com.factset.sdk.IRNContacts.models.RecordPreviewDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactsApi {
  private ApiClient apiClient;

  public ContactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createContactResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createContactResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createContactResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createContactResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteContactResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getContactResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactResponseTypeMap.put(200, new GenericType<ContactDto>(){});
    getContactResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactEventsResponseTypeMap.put(200, new GenericType<java.util.List<ContactEventDto>>(){});
    getContactEventsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactEventsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactNotesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactNotesResponseTypeMap.put(200, new GenericType<String>(){});
    getContactNotesResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactNotesResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactRecordsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactRecordsResponseTypeMap.put(200, new GenericType<java.util.List<RecordPreviewDto>>(){});
    getContactRecordsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactRecordsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactRelationshipsResponseTypeMap.put(200, new GenericType<java.util.List<ContactRelationshipDto>>(){});
    getContactRelationshipsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getContactRelationshipsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getContactsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getContactsResponseTypeMap.put(200, new GenericType<java.util.List<ContactSummaryDto>>(){});
  }

  private static final Map<Integer, GenericType> patchContactResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a contact
   * 
   * @param contactSaveDto contactSaveDto object to save (optional)
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
  public NewItemDto createContact(ContactSaveDto contactSaveDto) throws ApiException {
    return createContactWithHttpInfo(contactSaveDto).getData();
  }

  /**
   * Create a contact
   * 
   * @param contactSaveDto contactSaveDto object to save (optional)
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
  public ApiResponse<NewItemDto> createContactWithHttpInfo(ContactSaveDto contactSaveDto) throws ApiException {
    Object localVarPostBody = contactSaveDto;
    
    // create path and map variables
    String localVarPath = "/contacts";

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
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.createContact", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createContactResponseTypeMap, true);

    return apiResponse;

  }
  /**
   * Delete a contact
   * 
   * @param contactId contactId to delete associated record (required)
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
  public void deleteContact(java.util.UUID contactId) throws ApiException {
    deleteContactWithHttpInfo(contactId);
  }

  /**
   * Delete a contact
   * 
   * @param contactId contactId to delete associated record (required)
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
  public ApiResponse<Void> deleteContactWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling deleteContact");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsApi.deleteContact", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteContactResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all custom field and standard field details on a specific contact
   * 
   * @param contactId contactId to get associated record (required)
   * @return ContactDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ContactDto getContact(java.util.UUID contactId) throws ApiException {
    return getContactWithHttpInfo(contactId).getData();
  }

  /**
   * Get all custom field and standard field details on a specific contact
   * 
   * @param contactId contactId to get associated record (required)
   * @return ApiResponse&lt;ContactDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ContactDto> getContactWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContact");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
        
        ContactDto
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContact", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a contact’s audit history
   * 
   * @param contactId contactId to get associated records (required)
   * @return java.util.List<ContactEventDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactEventDto> getContactEvents(java.util.UUID contactId) throws ApiException {
    return getContactEventsWithHttpInfo(contactId).getData();
  }

  /**
   * Get a contact’s audit history
   * 
   * @param contactId contactId to get associated records (required)
   * @return ApiResponse&lt;java.util.List<ContactEventDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactEventDto>> getContactEventsWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactEvents");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}/events"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
        
        java.util.List<ContactEventDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContactEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the About field content for a specific contact
   * 
   * @param contactId contactId of associated record (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public String getContactNotes(java.util.UUID contactId) throws ApiException {
    return getContactNotesWithHttpInfo(contactId).getData();
  }

  /**
   * Get the About field content for a specific contact
   * 
   * @param contactId contactId of associated record (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getContactNotesWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactNotes");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}/about"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
        
        String
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContactNotes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactNotesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all notes and meetings where a specific contact was tagged
   * 
   * @param contactId contactId to get associated records (required)
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
  public java.util.List<RecordPreviewDto> getContactRecords(java.util.UUID contactId) throws ApiException {
    return getContactRecordsWithHttpInfo(contactId).getData();
  }

  /**
   * Get all notes and meetings where a specific contact was tagged
   * 
   * @param contactId contactId to get associated records (required)
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
  public ApiResponse<java.util.List<RecordPreviewDto>> getContactRecordsWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactRecords");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}/records"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContactRecords", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactRecordsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of a contact’s relationships
   * 
   * @param contactId contactId to get associated records (required)
   * @return java.util.List<ContactRelationshipDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactRelationshipDto> getContactRelationships(java.util.UUID contactId) throws ApiException {
    return getContactRelationshipsWithHttpInfo(contactId).getData();
  }

  /**
   * Returns a list of a contact’s relationships
   * 
   * @param contactId contactId to get associated records (required)
   * @return ApiResponse&lt;java.util.List<ContactRelationshipDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactRelationshipDto>> getContactRelationshipsWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling getContactRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}/relationships"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
        
        java.util.List<ContactRelationshipDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContactRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get list of all contacts in your group along with some of their standard field data
   * 
   * @param fullName Filter results on fullName (optional)
   * @param emailAddress Filter results on emailAddress (optional)
   * @param identifier Filter results on identifier (optional)
   * @param employerName Filter results on employerName (optional)
   * @param customFieldValues Includes custom field values in response if true (optional, default to false)
   * @param search Filter results on the combination of fullName, emailAddress, identifier and employerName (optional)
   * @param sort  (optional)
   * @param includeLastMeetingDate If true, returns when they were last tagged as an attendee in an IRN meeting (optional, default to false)
   * @param limit Restrict number of records returned (optional, default to 0)
   * @return java.util.List<ContactSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactSummaryDto> getContacts(String fullName, String emailAddress, String identifier, String employerName, Boolean customFieldValues, String search, String sort, Boolean includeLastMeetingDate, Integer limit) throws ApiException {
    return getContactsWithHttpInfo(fullName, emailAddress, identifier, employerName, customFieldValues, search, sort, includeLastMeetingDate, limit).getData();
  }

  /**
   * Get list of all contacts in your group along with some of their standard field data
   * 
   * @param fullName Filter results on fullName (optional)
   * @param emailAddress Filter results on emailAddress (optional)
   * @param identifier Filter results on identifier (optional)
   * @param employerName Filter results on employerName (optional)
   * @param customFieldValues Includes custom field values in response if true (optional, default to false)
   * @param search Filter results on the combination of fullName, emailAddress, identifier and employerName (optional)
   * @param sort  (optional)
   * @param includeLastMeetingDate If true, returns when they were last tagged as an attendee in an IRN meeting (optional, default to false)
   * @param limit Restrict number of records returned (optional, default to 0)
   * @return ApiResponse&lt;java.util.List<ContactSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactSummaryDto>> getContactsWithHttpInfo(String fullName, String emailAddress, String identifier, String employerName, Boolean customFieldValues, String search, String sort, Boolean includeLastMeetingDate, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/contacts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fullName", fullName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "emailAddress", emailAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "employerName", employerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customFieldValues", customFieldValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLastMeetingDate", includeLastMeetingDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<ContactSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsApi.getContacts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getContactsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a contact’s standard field and custom field data
   * 
   * @param contactId contactId to update associated record (required)
   * @param operation contactSaveDtoPatch object to update (optional)
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
  public void patchContact(java.util.UUID contactId, java.util.List<Operation> operation) throws ApiException {
    patchContactWithHttpInfo(contactId, operation);
  }

  /**
   * Edit a contact’s standard field and custom field data
   * 
   * @param contactId contactId to update associated record (required)
   * @param operation contactSaveDtoPatch object to update (optional)
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
  public ApiResponse<Void> patchContactWithHttpInfo(java.util.UUID contactId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling patchContact");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/{contactId}"
      .replaceAll("\\{" + "contactId" + "\\}", apiClient.escapeString(contactId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsApi.patchContact", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchContactResponseTypeMap, false);

    return apiResponse;

  }
}
