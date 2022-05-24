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

import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;
import com.factset.sdk.IRNConfiguration.models.RelationshipDto;
import com.factset.sdk.IRNConfiguration.models.RelationshipSaveDto;
import com.factset.sdk.IRNConfiguration.models.RelationshipType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactsRelationshipsApi {
  private ApiClient apiClient;

  public ContactsRelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsRelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> createContactRelationshipTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createContactRelationshipTypeResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createContactRelationshipTypeResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createContactRelationshipTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }
  private static final Map<Integer, GenericType> deleteRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> editRelationshipResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> getRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelationshipsResponseTypeMap.put(200, new GenericType<java.util.List<RelationshipDto>>(){});
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
   * Create a relationship type
   * 
   * @param relationshipSaveDto RelationshipSaveDto object to save (optional)
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
  public NewItemDto createContactRelationshipType(RelationshipSaveDto relationshipSaveDto) throws ApiException {
    return createContactRelationshipTypeWithHttpInfo(relationshipSaveDto).getData();
  }

  /**
   * Create a relationship type
   * 
   * @param relationshipSaveDto RelationshipSaveDto object to save (optional)
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
  public ApiResponse<NewItemDto> createContactRelationshipTypeWithHttpInfo(RelationshipSaveDto relationshipSaveDto) throws ApiException {
    Object localVarPostBody = relationshipSaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/relationships";

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
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.createContactRelationshipType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createContactRelationshipTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a relationship type
   * 
   * @param relationshipId relationshipId to delete associated record (required)
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
  public void deleteRelationship(java.util.UUID relationshipId) throws ApiException {
    deleteRelationshipWithHttpInfo(relationshipId);
  }

  /**
   * Delete a relationship type
   * 
   * @param relationshipId relationshipId to delete associated record (required)
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
  public ApiResponse<Void> deleteRelationshipWithHttpInfo(java.util.UUID relationshipId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipId' when calling deleteRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/relationships/{relationshipId}"
      .replaceAll("\\{" + "relationshipId" + "\\}", apiClient.escapeString(relationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.deleteRelationship", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a relationship type
   * 
   * @param relationshipId relationshipId to update associated record (required)
   * @param relationshipSaveDto RelationshipSaveDto object to update (optional)
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
  public void editRelationship(java.util.UUID relationshipId, RelationshipSaveDto relationshipSaveDto) throws ApiException {
    editRelationshipWithHttpInfo(relationshipId, relationshipSaveDto);
  }

  /**
   * Edit a relationship type
   * 
   * @param relationshipId relationshipId to update associated record (required)
   * @param relationshipSaveDto RelationshipSaveDto object to update (optional)
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
  public ApiResponse<Void> editRelationshipWithHttpInfo(java.util.UUID relationshipId, RelationshipSaveDto relationshipSaveDto) throws ApiException {
    Object localVarPostBody = relationshipSaveDto;
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipId' when calling editRelationship");
    }
    
    // create path and map variables
    String localVarPath = "/v1/relationships/{relationshipId}"
      .replaceAll("\\{" + "relationshipId" + "\\}", apiClient.escapeString(relationshipId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.editRelationship", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, editRelationshipResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get list of the relationships configured in your group
   * 
   * @param type  (optional)
   * @return java.util.List<RelationshipDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RelationshipDto> getRelationships(RelationshipType type) throws ApiException {
    return getRelationshipsWithHttpInfo(type).getData();
  }

  /**
   * Get list of the relationships configured in your group
   * 
   * @param type  (optional)
   * @return ApiResponse&lt;java.util.List<RelationshipDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RelationshipDto>> getRelationshipsWithHttpInfo(RelationshipType type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/relationships";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<RelationshipDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipsApi.getRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
}
