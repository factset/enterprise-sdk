package com.factset.sdk.IRNContacts.api;

import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiResponse;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNContacts.models.ContactDto;
import com.factset.sdk.IRNContacts.models.ContactEventDto;
import com.factset.sdk.IRNContacts.models.ContactRelationshipDto;
import com.factset.sdk.IRNContacts.models.ContactSaveDto;
import com.factset.sdk.IRNContacts.models.ContactSummaryDto;
import com.factset.sdk.IRNContacts.models.Operation;
import com.factset.sdk.IRNContacts.models.ProblemDetails;
import com.factset.sdk.IRNContacts.models.RecordPreviewDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactsApi {
  private ApiClient apiClient;

  public ContactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
  public String v1ContactsContactIdAboutGet(java.util.UUID contactId) throws ApiException {
    return v1ContactsContactIdAboutGetWithHttpInfo(contactId).getData();
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
  public ApiResponse<String> v1ContactsContactIdAboutGetWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdAboutGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}/about"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdAboutGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1ContactsContactIdDelete(java.util.UUID contactId) throws ApiException {
    v1ContactsContactIdDeleteWithHttpInfo(contactId);
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
  public ApiResponse<Void> v1ContactsContactIdDeleteWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}"
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

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get a contact’s audit history
   * 
   * @param contactId contactId to get associated records (required)
   * @return java.util.List&lt;ContactEventDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactEventDto> v1ContactsContactIdEventsGet(java.util.UUID contactId) throws ApiException {
    return v1ContactsContactIdEventsGetWithHttpInfo(contactId).getData();
  }

  /**
   * Get a contact’s audit history
   * 
   * @param contactId contactId to get associated records (required)
   * @return ApiResponse&lt;java.util.List&lt;ContactEventDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactEventDto>> v1ContactsContactIdEventsGetWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdEventsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}/events"
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

    GenericType<java.util.List<ContactEventDto>> localVarReturnType = new GenericType<java.util.List<ContactEventDto>>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdEventsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public ContactDto v1ContactsContactIdGet(java.util.UUID contactId) throws ApiException {
    return v1ContactsContactIdGetWithHttpInfo(contactId).getData();
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
  public ApiResponse<ContactDto> v1ContactsContactIdGetWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}"
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

    GenericType<ContactDto> localVarReturnType = new GenericType<ContactDto>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1ContactsContactIdPatch(java.util.UUID contactId, java.util.List<Operation> operation) throws ApiException {
    v1ContactsContactIdPatchWithHttpInfo(contactId, operation);
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
  public ApiResponse<Void> v1ContactsContactIdPatchWithHttpInfo(java.util.UUID contactId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}"
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

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all notes and meetings where a specific contact was tagged
   * 
   * @param contactId contactId to get associated records (required)
   * @return java.util.List&lt;RecordPreviewDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RecordPreviewDto> v1ContactsContactIdRecordsGet(java.util.UUID contactId) throws ApiException {
    return v1ContactsContactIdRecordsGetWithHttpInfo(contactId).getData();
  }

  /**
   * Get all notes and meetings where a specific contact was tagged
   * 
   * @param contactId contactId to get associated records (required)
   * @return ApiResponse&lt;java.util.List&lt;RecordPreviewDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RecordPreviewDto>> v1ContactsContactIdRecordsGetWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdRecordsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}/records"
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

    GenericType<java.util.List<RecordPreviewDto>> localVarReturnType = new GenericType<java.util.List<RecordPreviewDto>>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdRecordsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns a list of a contact’s relationships
   * 
   * @param contactId contactId to get associated records (required)
   * @return java.util.List&lt;ContactRelationshipDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactRelationshipDto> v1ContactsContactIdRelationshipsGet(java.util.UUID contactId) throws ApiException {
    return v1ContactsContactIdRelationshipsGetWithHttpInfo(contactId).getData();
  }

  /**
   * Returns a list of a contact’s relationships
   * 
   * @param contactId contactId to get associated records (required)
   * @return ApiResponse&lt;java.util.List&lt;ContactRelationshipDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactRelationshipDto>> v1ContactsContactIdRelationshipsGetWithHttpInfo(java.util.UUID contactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactId' when calling v1ContactsContactIdRelationshipsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/contacts/{contactId}/relationships"
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

    GenericType<java.util.List<ContactRelationshipDto>> localVarReturnType = new GenericType<java.util.List<ContactRelationshipDto>>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsContactIdRelationshipsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
   * @return java.util.List&lt;ContactSummaryDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactSummaryDto> v1ContactsGet(String fullName, String emailAddress, String identifier, String employerName, Boolean customFieldValues, String search, String sort, Boolean includeLastMeetingDate, Integer limit) throws ApiException {
    return v1ContactsGetWithHttpInfo(fullName, emailAddress, identifier, employerName, customFieldValues, search, sort, includeLastMeetingDate, limit).getData();
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
   * @return ApiResponse&lt;java.util.List&lt;ContactSummaryDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactSummaryDto>> v1ContactsGetWithHttpInfo(String fullName, String emailAddress, String identifier, String employerName, Boolean customFieldValues, String search, String sort, Boolean includeLastMeetingDate, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/contacts";

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

    GenericType<java.util.List<ContactSummaryDto>> localVarReturnType = new GenericType<java.util.List<ContactSummaryDto>>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a contact
   * 
   * @param contactSaveDto contactSaveDto object to save (optional)
   * @return java.util.UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.UUID v1ContactsPost(ContactSaveDto contactSaveDto) throws ApiException {
    return v1ContactsPostWithHttpInfo(contactSaveDto).getData();
  }

  /**
   * Create a contact
   * 
   * @param contactSaveDto contactSaveDto object to save (optional)
   * @return ApiResponse&lt;java.util.UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.UUID> v1ContactsPostWithHttpInfo(ContactSaveDto contactSaveDto) throws ApiException {
    Object localVarPostBody = contactSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/contacts";

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

    GenericType<java.util.UUID> localVarReturnType = new GenericType<java.util.UUID>() {};

    return apiClient.invokeAPI("ContactsApi.v1ContactsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
