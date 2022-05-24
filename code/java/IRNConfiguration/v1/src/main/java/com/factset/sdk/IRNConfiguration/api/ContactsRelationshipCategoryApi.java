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
import com.factset.sdk.IRNConfiguration.models.RelationshipCategoryDto;
import com.factset.sdk.IRNConfiguration.models.RelationshipCategoryListDto;
import com.factset.sdk.IRNConfiguration.models.RelationshipCategorySaveDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactsRelationshipCategoryApi {
  private ApiClient apiClient;

  public ContactsRelationshipCategoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsRelationshipCategoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> createRelationshipCategoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createRelationshipCategoryResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createRelationshipCategoryResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createRelationshipCategoryResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }
  private static final Map<Integer, GenericType> deleteRelationshipCategoryResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> editRelationshipCategoryResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> getRelationshipCategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelationshipCategoriesResponseTypeMap.put(200, new GenericType<java.util.List<RelationshipCategoryDto>>(){});
  }
  private static final Map<Integer, GenericType> updateRelationshipCategoryOrderResponseTypeMap = new HashMap<Integer, GenericType>();

   


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
   * Create a relationship category
   * 
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to save (optional)
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
  public NewItemDto createRelationshipCategory(RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    return createRelationshipCategoryWithHttpInfo(relationshipCategorySaveDto).getData();
  }

  /**
   * Create a relationship category
   * 
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to save (optional)
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
  public ApiResponse<NewItemDto> createRelationshipCategoryWithHttpInfo(RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    Object localVarPostBody = relationshipCategorySaveDto;
    
    // create path and map variables
    String localVarPath = "/v1/relationship-categories";

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
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipCategoryApi.createRelationshipCategory", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createRelationshipCategoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a relationship category
   * 
   * @param relationshipCategoryId relationshipCategoryId to delete associated record (required)
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
  public void deleteRelationshipCategory(java.util.UUID relationshipCategoryId) throws ApiException {
    deleteRelationshipCategoryWithHttpInfo(relationshipCategoryId);
  }

  /**
   * Delete a relationship category
   * 
   * @param relationshipCategoryId relationshipCategoryId to delete associated record (required)
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
  public ApiResponse<Void> deleteRelationshipCategoryWithHttpInfo(java.util.UUID relationshipCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'relationshipCategoryId' is set
    if (relationshipCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipCategoryId' when calling deleteRelationshipCategory");
    }
    
    // create path and map variables
    String localVarPath = "/v1/relationship-categories/{relationshipCategoryId}"
      .replaceAll("\\{" + "relationshipCategoryId" + "\\}", apiClient.escapeString(relationshipCategoryId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipCategoryApi.deleteRelationshipCategory", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteRelationshipCategoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a relationship category
   * 
   * @param relationshipCategoryId relationshipCategoryId to update associated record (required)
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to update (optional)
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
  public void editRelationshipCategory(java.util.UUID relationshipCategoryId, RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    editRelationshipCategoryWithHttpInfo(relationshipCategoryId, relationshipCategorySaveDto);
  }

  /**
   * Edit a relationship category
   * 
   * @param relationshipCategoryId relationshipCategoryId to update associated record (required)
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to update (optional)
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
  public ApiResponse<Void> editRelationshipCategoryWithHttpInfo(java.util.UUID relationshipCategoryId, RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    Object localVarPostBody = relationshipCategorySaveDto;
    
    // verify the required parameter 'relationshipCategoryId' is set
    if (relationshipCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipCategoryId' when calling editRelationshipCategory");
    }
    
    // create path and map variables
    String localVarPath = "/v1/relationship-categories/{relationshipCategoryId}"
      .replaceAll("\\{" + "relationshipCategoryId" + "\\}", apiClient.escapeString(relationshipCategoryId.toString()));

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipCategoryApi.editRelationshipCategory", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, editRelationshipCategoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get list of the relationship categories configured in your group
   * 
   * @return java.util.List<RelationshipCategoryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RelationshipCategoryDto> getRelationshipCategories() throws ApiException {
    return getRelationshipCategoriesWithHttpInfo().getData();
  }

  /**
   * Get list of the relationship categories configured in your group
   * 
   * @return ApiResponse&lt;java.util.List<RelationshipCategoryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RelationshipCategoryDto>> getRelationshipCategoriesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/relationship-categories";

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
        
        java.util.List<RelationshipCategoryDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipCategoryApi.getRelationshipCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelationshipCategoriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Reorder relationship categories
   * 
   * @param relationshipCategoryListDto List of Guid (optional)
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
  public void updateRelationshipCategoryOrder(RelationshipCategoryListDto relationshipCategoryListDto) throws ApiException {
    updateRelationshipCategoryOrderWithHttpInfo(relationshipCategoryListDto);
  }

  /**
   * Reorder relationship categories
   * 
   * @param relationshipCategoryListDto List of Guid (optional)
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
  public ApiResponse<Void> updateRelationshipCategoryOrderWithHttpInfo(RelationshipCategoryListDto relationshipCategoryListDto) throws ApiException {
    Object localVarPostBody = relationshipCategoryListDto;
    
    // create path and map variables
    String localVarPath = "/v1/relationship-categories/reorder";

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
    > apiResponse = apiClient.invokeAPI("ContactsRelationshipCategoryApi.updateRelationshipCategoryOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateRelationshipCategoryOrderResponseTypeMap, false);

    return apiResponse;

  }
}
