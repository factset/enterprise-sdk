package com.factset.sdk.StreetAccountNews.api;

import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiResponse;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StreetAccountNews.models.CreateEditDeleteViewResponse;
import com.factset.sdk.StreetAccountNews.models.CreateOrEditViewBody;
import com.factset.sdk.StreetAccountNews.models.Error;
import com.factset.sdk.StreetAccountNews.models.Views;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ViewsApi {
  private ApiClient apiClient;

  public ViewsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ViewsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createStreetAccountViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createStreetAccountViewResponseTypeMap.put(200, new GenericType<CreateEditDeleteViewResponse>(){});
    createStreetAccountViewResponseTypeMap.put(400, new GenericType<Error>(){});
    createStreetAccountViewResponseTypeMap.put(401, new GenericType<Error>(){});
    createStreetAccountViewResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> deleteStreetAccountViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    deleteStreetAccountViewResponseTypeMap.put(200, new GenericType<CreateEditDeleteViewResponse>(){});
    deleteStreetAccountViewResponseTypeMap.put(400, new GenericType<Error>(){});
    deleteStreetAccountViewResponseTypeMap.put(401, new GenericType<Error>(){});
    deleteStreetAccountViewResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> editStreetAccountViewResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    editStreetAccountViewResponseTypeMap.put(200, new GenericType<CreateEditDeleteViewResponse>(){});
    editStreetAccountViewResponseTypeMap.put(400, new GenericType<Error>(){});
    editStreetAccountViewResponseTypeMap.put(401, new GenericType<Error>(){});
    editStreetAccountViewResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStreetAccountViewsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStreetAccountViewsResponseTypeMap.put(200, new GenericType<Views>(){});
    getStreetAccountViewsResponseTypeMap.put(400, new GenericType<Error>(){});
    getStreetAccountViewsResponseTypeMap.put(401, new GenericType<Error>(){});
    getStreetAccountViewsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Creates and saves a StreetAccount view
   * This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.
   * @param id view id of the view which is the be created (required)
   * @param createOrEditViewBody Create or Edit View Body which needs to be sent with request (optional)
   * @return CreateEditDeleteViewResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CreateEditDeleteViewResponse createStreetAccountView(String id, CreateOrEditViewBody createOrEditViewBody) throws ApiException {
    return createStreetAccountViewWithHttpInfo(id, createOrEditViewBody).getData();
  }

  /**
   * Creates and saves a StreetAccount view
   * This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.
   * @param id view id of the view which is the be created (required)
   * @param createOrEditViewBody Create or Edit View Body which needs to be sent with request (optional)
   * @return ApiResponse&lt;CreateEditDeleteViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateEditDeleteViewResponse> createStreetAccountViewWithHttpInfo(String id, CreateOrEditViewBody createOrEditViewBody) throws ApiException {
    Object localVarPostBody = createOrEditViewBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createStreetAccountView");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/views/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CreateEditDeleteViewResponse
      
    > apiResponse = apiClient.invokeAPI("ViewsApi.createStreetAccountView", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createStreetAccountViewResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Deletes an existing StreetAccount view
   * This endpoint allows you to delete a previously saved StreetAccount view.
   * @param id view id of the view to be deleted (required)
   * @return CreateEditDeleteViewResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CreateEditDeleteViewResponse deleteStreetAccountView(String id) throws ApiException {
    return deleteStreetAccountViewWithHttpInfo(id).getData();
  }

  /**
   * Deletes an existing StreetAccount view
   * This endpoint allows you to delete a previously saved StreetAccount view.
   * @param id view id of the view to be deleted (required)
   * @return ApiResponse&lt;CreateEditDeleteViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateEditDeleteViewResponse> deleteStreetAccountViewWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteStreetAccountView");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/views/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        CreateEditDeleteViewResponse
      
    > apiResponse = apiClient.invokeAPI("ViewsApi.deleteStreetAccountView", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteStreetAccountViewResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edits and saves an existing StreetAccount view
   * This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.
   * @param id view id of the view to be edited (required)
   * @param createOrEditViewBody Create or Edit View Body which needs to be sent with request (optional)
   * @return CreateEditDeleteViewResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CreateEditDeleteViewResponse editStreetAccountView(String id, CreateOrEditViewBody createOrEditViewBody) throws ApiException {
    return editStreetAccountViewWithHttpInfo(id, createOrEditViewBody).getData();
  }

  /**
   * Edits and saves an existing StreetAccount view
   * This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.
   * @param id view id of the view to be edited (required)
   * @param createOrEditViewBody Create or Edit View Body which needs to be sent with request (optional)
   * @return ApiResponse&lt;CreateEditDeleteViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateEditDeleteViewResponse> editStreetAccountViewWithHttpInfo(String id, CreateOrEditViewBody createOrEditViewBody) throws ApiException {
    Object localVarPostBody = createOrEditViewBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling editStreetAccountView");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/views/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CreateEditDeleteViewResponse
      
    > apiResponse = apiClient.invokeAPI("ViewsApi.editStreetAccountView", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, editStreetAccountViewResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves StreetAccount search views
   * This endpoint allows you to pull the full list of StreetAccount views that have been previously saved.
   * @return Views
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public Views getStreetAccountViews() throws ApiException {
    return getStreetAccountViewsWithHttpInfo().getData();
  }

  /**
   * Retrieves StreetAccount search views
   * This endpoint allows you to pull the full list of StreetAccount views that have been previously saved.
   * @return ApiResponse&lt;Views&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Views> getStreetAccountViewsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/streetaccount/views";

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
        
        Views
      
    > apiResponse = apiClient.invokeAPI("ViewsApi.getStreetAccountViews", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStreetAccountViewsResponseTypeMap, false);

    return apiResponse;

  }
}
