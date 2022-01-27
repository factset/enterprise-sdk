package com.factset.sdk.IRNContacts.api;

import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiResponse;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNContacts.models.ProblemDetails;
import com.factset.sdk.IRNContacts.models.RelationshipCategoryDto;
import com.factset.sdk.IRNContacts.models.RelationshipCategoryListDto;
import com.factset.sdk.IRNContacts.models.RelationshipCategorySaveDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RelationshipCategoriesApi {
  private ApiClient apiClient;

  public RelationshipCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RelationshipCategoriesApi(ApiClient apiClient) {
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
   * Get list of the relationship categories configured in your group
   * 
   * @return java.util.List&lt;RelationshipCategoryDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RelationshipCategoryDto> v1RelationshipCategoriesGet() throws ApiException {
    return v1RelationshipCategoriesGetWithHttpInfo().getData();
  }

  /**
   * Get list of the relationship categories configured in your group
   * 
   * @return ApiResponse&lt;java.util.List&lt;RelationshipCategoryDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RelationshipCategoryDto>> v1RelationshipCategoriesGetWithHttpInfo() throws ApiException {
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

    GenericType<java.util.List<RelationshipCategoryDto>> localVarReturnType = new GenericType<java.util.List<RelationshipCategoryDto>>() {};

    return apiClient.invokeAPI("RelationshipCategoriesApi.v1RelationshipCategoriesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a relationship category
   * 
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to save (optional)
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
  public java.util.UUID v1RelationshipCategoriesPost(RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    return v1RelationshipCategoriesPostWithHttpInfo(relationshipCategorySaveDto).getData();
  }

  /**
   * Create a relationship category
   * 
   * @param relationshipCategorySaveDto RelationshipCategorySaveDto object to save (optional)
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
  public ApiResponse<java.util.UUID> v1RelationshipCategoriesPostWithHttpInfo(RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
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

    GenericType<java.util.UUID> localVarReturnType = new GenericType<java.util.UUID>() {};

    return apiClient.invokeAPI("RelationshipCategoriesApi.v1RelationshipCategoriesPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1RelationshipCategoriesRelationshipCategoryIdDelete(java.util.UUID relationshipCategoryId) throws ApiException {
    v1RelationshipCategoriesRelationshipCategoryIdDeleteWithHttpInfo(relationshipCategoryId);
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
  public ApiResponse<Void> v1RelationshipCategoriesRelationshipCategoryIdDeleteWithHttpInfo(java.util.UUID relationshipCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'relationshipCategoryId' is set
    if (relationshipCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipCategoryId' when calling v1RelationshipCategoriesRelationshipCategoryIdDelete");
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

    return apiClient.invokeAPI("RelationshipCategoriesApi.v1RelationshipCategoriesRelationshipCategoryIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void v1RelationshipCategoriesRelationshipCategoryIdPut(java.util.UUID relationshipCategoryId, RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    v1RelationshipCategoriesRelationshipCategoryIdPutWithHttpInfo(relationshipCategoryId, relationshipCategorySaveDto);
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
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1RelationshipCategoriesRelationshipCategoryIdPutWithHttpInfo(java.util.UUID relationshipCategoryId, RelationshipCategorySaveDto relationshipCategorySaveDto) throws ApiException {
    Object localVarPostBody = relationshipCategorySaveDto;
    
    // verify the required parameter 'relationshipCategoryId' is set
    if (relationshipCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipCategoryId' when calling v1RelationshipCategoriesRelationshipCategoryIdPut");
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

    return apiClient.invokeAPI("RelationshipCategoriesApi.v1RelationshipCategoriesRelationshipCategoryIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Reorder relationship categories
   * 
   * @param relationshipCategoryListDto List of Guid (optional)
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
  public void v1RelationshipCategoriesReorderPost(RelationshipCategoryListDto relationshipCategoryListDto) throws ApiException {
    v1RelationshipCategoriesReorderPostWithHttpInfo(relationshipCategoryListDto);
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
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1RelationshipCategoriesReorderPostWithHttpInfo(RelationshipCategoryListDto relationshipCategoryListDto) throws ApiException {
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

    return apiClient.invokeAPI("RelationshipCategoriesApi.v1RelationshipCategoriesReorderPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
