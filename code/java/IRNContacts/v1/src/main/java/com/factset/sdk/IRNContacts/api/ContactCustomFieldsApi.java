package com.factset.sdk.IRNContacts.api;

import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiResponse;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNContacts.models.ContactCustomFieldDto;
import com.factset.sdk.IRNContacts.models.ContactCustomFieldListDto;
import com.factset.sdk.IRNContacts.models.ContactCustomFieldSaveDto;
import com.factset.sdk.IRNContacts.models.Operation;
import com.factset.sdk.IRNContacts.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactCustomFieldsApi {
  private ApiClient apiClient;

  public ContactCustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactCustomFieldsApi(ApiClient apiClient) {
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
  public void v1ContactCustomFieldsContactCustomFieldIdDelete(java.util.UUID contactCustomFieldId) throws ApiException {
    v1ContactCustomFieldsContactCustomFieldIdDeleteWithHttpInfo(contactCustomFieldId);
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
  public ApiResponse<Void> v1ContactCustomFieldsContactCustomFieldIdDeleteWithHttpInfo(java.util.UUID contactCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling v1ContactCustomFieldsContactCustomFieldIdDelete");
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

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsContactCustomFieldIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public ContactCustomFieldDto v1ContactCustomFieldsContactCustomFieldIdGet(java.util.UUID contactCustomFieldId) throws ApiException {
    return v1ContactCustomFieldsContactCustomFieldIdGetWithHttpInfo(contactCustomFieldId).getData();
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
  public ApiResponse<ContactCustomFieldDto> v1ContactCustomFieldsContactCustomFieldIdGetWithHttpInfo(java.util.UUID contactCustomFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling v1ContactCustomFieldsContactCustomFieldIdGet");
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

    GenericType<ContactCustomFieldDto> localVarReturnType = new GenericType<ContactCustomFieldDto>() {};

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsContactCustomFieldIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1ContactCustomFieldsContactCustomFieldIdPatch(java.util.UUID contactCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    v1ContactCustomFieldsContactCustomFieldIdPatchWithHttpInfo(contactCustomFieldId, operation);
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
  public ApiResponse<Void> v1ContactCustomFieldsContactCustomFieldIdPatchWithHttpInfo(java.util.UUID contactCustomFieldId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactCustomFieldId' is set
    if (contactCustomFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactCustomFieldId' when calling v1ContactCustomFieldsContactCustomFieldIdPatch");
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

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsContactCustomFieldIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all the contact custom fields
   * 
   * @return java.util.List&lt;ContactCustomFieldDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactCustomFieldDto> v1ContactCustomFieldsGet() throws ApiException {
    return v1ContactCustomFieldsGetWithHttpInfo().getData();
  }

  /**
   * Get all the contact custom fields
   * 
   * @return ApiResponse&lt;java.util.List&lt;ContactCustomFieldDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactCustomFieldDto>> v1ContactCustomFieldsGetWithHttpInfo() throws ApiException {
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

    GenericType<java.util.List<ContactCustomFieldDto>> localVarReturnType = new GenericType<java.util.List<ContactCustomFieldDto>>() {};

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a contact custom field
   * 
   * @param contactCustomFieldSaveDto ContactCustomFieldSaveDto object to save (optional)
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
  public java.util.UUID v1ContactCustomFieldsPost(ContactCustomFieldSaveDto contactCustomFieldSaveDto) throws ApiException {
    return v1ContactCustomFieldsPostWithHttpInfo(contactCustomFieldSaveDto).getData();
  }

  /**
   * Create a contact custom field
   * 
   * @param contactCustomFieldSaveDto ContactCustomFieldSaveDto object to save (optional)
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
  public ApiResponse<java.util.UUID> v1ContactCustomFieldsPostWithHttpInfo(ContactCustomFieldSaveDto contactCustomFieldSaveDto) throws ApiException {
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

    GenericType<java.util.UUID> localVarReturnType = new GenericType<java.util.UUID>() {};

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Reorder contact custom fields
   * 
   * @param contactCustomFieldListDto List of Guid (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void v1ContactCustomFieldsReorderPost(ContactCustomFieldListDto contactCustomFieldListDto) throws ApiException {
    v1ContactCustomFieldsReorderPostWithHttpInfo(contactCustomFieldListDto);
  }

  /**
   * Reorder contact custom fields
   * 
   * @param contactCustomFieldListDto List of Guid (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1ContactCustomFieldsReorderPostWithHttpInfo(ContactCustomFieldListDto contactCustomFieldListDto) throws ApiException {
    Object localVarPostBody = contactCustomFieldListDto;
    
    // create path and map variables
    String localVarPath = "/v1/contact-custom-fields/reorder";

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

    return apiClient.invokeAPI("ContactCustomFieldsApi.v1ContactCustomFieldsReorderPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
