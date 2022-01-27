package com.factset.sdk.IRNContacts.api;

import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiResponse;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNContacts.models.ContactRelationshipTwoSidedDto;
import com.factset.sdk.IRNContacts.models.ContactRelationshipTwoSidedSaveDto;
import com.factset.sdk.IRNContacts.models.Operation;
import com.factset.sdk.IRNContacts.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactRelationshipsApi {
  private ApiClient apiClient;

  public ContactRelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactRelationshipsApi(ApiClient apiClient) {
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
  public void v1ContactRelationshipsContactRelationshipIdDelete(java.util.UUID contactRelationshipId) throws ApiException {
    v1ContactRelationshipsContactRelationshipIdDeleteWithHttpInfo(contactRelationshipId);
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
  public ApiResponse<Void> v1ContactRelationshipsContactRelationshipIdDeleteWithHttpInfo(java.util.UUID contactRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling v1ContactRelationshipsContactRelationshipIdDelete");
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

    return apiClient.invokeAPI("ContactRelationshipsApi.v1ContactRelationshipsContactRelationshipIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public ContactRelationshipTwoSidedDto v1ContactRelationshipsContactRelationshipIdGet(java.util.UUID contactRelationshipId) throws ApiException {
    return v1ContactRelationshipsContactRelationshipIdGetWithHttpInfo(contactRelationshipId).getData();
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
  public ApiResponse<ContactRelationshipTwoSidedDto> v1ContactRelationshipsContactRelationshipIdGetWithHttpInfo(java.util.UUID contactRelationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling v1ContactRelationshipsContactRelationshipIdGet");
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

    GenericType<ContactRelationshipTwoSidedDto> localVarReturnType = new GenericType<ContactRelationshipTwoSidedDto>() {};

    return apiClient.invokeAPI("ContactRelationshipsApi.v1ContactRelationshipsContactRelationshipIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1ContactRelationshipsContactRelationshipIdPatch(java.util.UUID contactRelationshipId, java.util.List<Operation> operation) throws ApiException {
    v1ContactRelationshipsContactRelationshipIdPatchWithHttpInfo(contactRelationshipId, operation);
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
  public ApiResponse<Void> v1ContactRelationshipsContactRelationshipIdPatchWithHttpInfo(java.util.UUID contactRelationshipId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'contactRelationshipId' is set
    if (contactRelationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'contactRelationshipId' when calling v1ContactRelationshipsContactRelationshipIdPatch");
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

    return apiClient.invokeAPI("ContactRelationshipsApi.v1ContactRelationshipsContactRelationshipIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
   * 
   * @param symbol  (optional)
   * @param contactId  (optional)
   * @param relationshipId  (optional)
   * @return java.util.List&lt;ContactRelationshipTwoSidedDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<ContactRelationshipTwoSidedDto> v1ContactRelationshipsGet(String symbol, java.util.UUID contactId, java.util.UUID relationshipId) throws ApiException {
    return v1ContactRelationshipsGetWithHttpInfo(symbol, contactId, relationshipId).getData();
  }

  /**
   * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
   * 
   * @param symbol  (optional)
   * @param contactId  (optional)
   * @param relationshipId  (optional)
   * @return ApiResponse&lt;java.util.List&lt;ContactRelationshipTwoSidedDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<ContactRelationshipTwoSidedDto>> v1ContactRelationshipsGetWithHttpInfo(String symbol, java.util.UUID contactId, java.util.UUID relationshipId) throws ApiException {
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

    GenericType<java.util.List<ContactRelationshipTwoSidedDto>> localVarReturnType = new GenericType<java.util.List<ContactRelationshipTwoSidedDto>>() {};

    return apiClient.invokeAPI("ContactRelationshipsApi.v1ContactRelationshipsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a contact relationship
   * 
   * @param contactRelationshipTwoSidedSaveDto contactRelationship object to save (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void v1ContactRelationshipsPost(ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto) throws ApiException {
    v1ContactRelationshipsPostWithHttpInfo(contactRelationshipTwoSidedSaveDto);
  }

  /**
   * Create a contact relationship
   * 
   * @param contactRelationshipTwoSidedSaveDto contactRelationship object to save (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1ContactRelationshipsPostWithHttpInfo(ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto) throws ApiException {
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

    return apiClient.invokeAPI("ContactRelationshipsApi.v1ContactRelationshipsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
