package com.factset.sdk.AnalyticsDatastore.api;

import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiResponse;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.AnalyticsDatastore.models.DocumentListResponse;
import com.factset.sdk.AnalyticsDatastore.models.DocumentRequest;
import com.factset.sdk.AnalyticsDatastore.models.ProductTypeListResponse;
import com.factset.sdk.AnalyticsDatastore.models.TagFilterModel;
import com.factset.sdk.AnalyticsDatastore.models.TagListResponse;
import com.factset.sdk.AnalyticsDatastore.models.TagResponse;
import com.factset.sdk.AnalyticsDatastore.models.TagValuesListResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentsApi {
  private ApiClient apiClient;

  public DocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDocumentsEndPointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocumentsEndPointResponseTypeMap.put(200, new GenericType<DocumentListResponse>(){});
  }

  private static final Map<Integer, GenericType> getProductTypesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProductTypesResponseTypeMap.put(200, new GenericType<ProductTypeListResponse>(){});
  }

  private static final Map<Integer, GenericType> getSingleTagEndPointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSingleTagEndPointResponseTypeMap.put(200, new GenericType<TagResponse>(){});
  }

  private static final Map<Integer, GenericType> getTagValuesEndPointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTagValuesEndPointResponseTypeMap.put(200, new GenericType<TagValuesListResponse>(){});
  }

  private static final Map<Integer, GenericType> getTagsEndPointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTagsEndPointResponseTypeMap.put(200, new GenericType<TagListResponse>(){});
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
   * Gets a list of Documents that a user has access to.
   * Retrieves metadata around documents stored in the Analytics Datastore Service. Each Document will have a &#39;url&#39; property which will act as a re-direct to the underlying document data    This end point supports pagination and filtering through the use of the request body listed below.    To discover what tags are available to filter on, see GET /tags and GET /tags/{name}/values to retrieve these filter values.    Similarly, to discover what product types are available to filter on, see POST /product-types/search to retrieve a list of product types.
   * @param documentRequest Example request of a filtered Documents search call (required)
   * @return DocumentListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, a list of documents the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public DocumentListResponse getDocumentsEndPoint(DocumentRequest documentRequest) throws ApiException {
    return getDocumentsEndPointWithHttpInfo(documentRequest).getData();
  }

  /**
   * Gets a list of Documents that a user has access to.
   * Retrieves metadata around documents stored in the Analytics Datastore Service. Each Document will have a &#39;url&#39; property which will act as a re-direct to the underlying document data    This end point supports pagination and filtering through the use of the request body listed below.    To discover what tags are available to filter on, see GET /tags and GET /tags/{name}/values to retrieve these filter values.    Similarly, to discover what product types are available to filter on, see POST /product-types/search to retrieve a list of product types.
   * @param documentRequest Example request of a filtered Documents search call (required)
   * @return ApiResponse&lt;DocumentListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, a list of documents the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<DocumentListResponse> getDocumentsEndPointWithHttpInfo(DocumentRequest documentRequest) throws ApiException {
    Object localVarPostBody = documentRequest;
    
    // verify the required parameter 'documentRequest' is set
    if (documentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'documentRequest' when calling getDocumentsEndPoint");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/tag-search/v1/documents/search";

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
        
        DocumentListResponse
      
    > apiResponse = apiClient.invokeAPI("DocumentsApi.getDocumentsEndPoint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocumentsEndPointResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a list of product types that a user has access to.
   * Retrieves a list of product types that have been specified across all documents the user has access to
   * @param tagFilterModel Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. (required)
   * @return ProductTypeListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, a list of product types the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ProductTypeListResponse getProductTypes(TagFilterModel tagFilterModel) throws ApiException {
    return getProductTypesWithHttpInfo(tagFilterModel).getData();
  }

  /**
   * Gets a list of product types that a user has access to.
   * Retrieves a list of product types that have been specified across all documents the user has access to
   * @param tagFilterModel Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. (required)
   * @return ApiResponse&lt;ProductTypeListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, a list of product types the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<ProductTypeListResponse> getProductTypesWithHttpInfo(TagFilterModel tagFilterModel) throws ApiException {
    Object localVarPostBody = tagFilterModel;
    
    // verify the required parameter 'tagFilterModel' is set
    if (tagFilterModel == null) {
      throw new ApiException(400, "Missing the required parameter 'tagFilterModel' when calling getProductTypes");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/tag-search/v1/product-types/search";

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
        
        ProductTypeListResponse
      
    > apiResponse = apiClient.invokeAPI("DocumentsApi.getProductTypes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProductTypesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a single tag definition based on its name
   * Retrieve a tag definition based on its name
   * @param name The name of the tag (required)
   * @return TagResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the tag requested </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public TagResponse getSingleTagEndPoint(String name) throws ApiException {
    return getSingleTagEndPointWithHttpInfo(name).getData();
  }

  /**
   * Get a single tag definition based on its name
   * Retrieve a tag definition based on its name
   * @param name The name of the tag (required)
   * @return ApiResponse&lt;TagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the tag requested </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<TagResponse> getSingleTagEndPointWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getSingleTagEndPoint");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/tag-search/v1/tags/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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
        
        TagResponse
      
    > apiResponse = apiClient.invokeAPI("DocumentsApi.getSingleTagEndPoint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSingleTagEndPointResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a list of tag values for the given name
   * Returns a list of tag values depending on the name provided. Supports filtering on additional tag name value pairs, which operates as an &#39;AND&#39; where the Document must have the tag name specified in the path AND the filtered parameter.
   * @param name The name of the tag (required)
   * @param tagFilterModel Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. (required)
   * @return TagValuesListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of tag definitions the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public TagValuesListResponse getTagValuesEndPoint(String name, TagFilterModel tagFilterModel) throws ApiException {
    return getTagValuesEndPointWithHttpInfo(name, tagFilterModel).getData();
  }

  /**
   * Gets a list of tag values for the given name
   * Returns a list of tag values depending on the name provided. Supports filtering on additional tag name value pairs, which operates as an &#39;AND&#39; where the Document must have the tag name specified in the path AND the filtered parameter.
   * @param name The name of the tag (required)
   * @param tagFilterModel Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. (required)
   * @return ApiResponse&lt;TagValuesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of tag definitions the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<TagValuesListResponse> getTagValuesEndPointWithHttpInfo(String name, TagFilterModel tagFilterModel) throws ApiException {
    Object localVarPostBody = tagFilterModel;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getTagValuesEndPoint");
    }
    
    // verify the required parameter 'tagFilterModel' is set
    if (tagFilterModel == null) {
      throw new ApiException(400, "Missing the required parameter 'tagFilterModel' when calling getTagValuesEndPoint");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/tag-search/v1/tags/{name}/values"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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
        
        TagValuesListResponse
      
    > apiResponse = apiClient.invokeAPI("DocumentsApi.getTagValuesEndPoint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTagValuesEndPointResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a list of tag definitions for the user.
   * Tag definitions consist of a name and a type. Use this end point to see a list of pre-existing tags that can be used to filter on the Documents end point.
   * @param paginationOffset The offset integer on where to begin paginating (optional, default to 0)
   * @param paginationLimit The limit of records to return when paginating (optional, default to 50)
   * @return TagListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of tag definitions the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public TagListResponse getTagsEndPoint(Integer paginationOffset, Integer paginationLimit) throws ApiException {
    return getTagsEndPointWithHttpInfo(paginationOffset, paginationLimit).getData();
  }

  /**
   * Gets a list of tag definitions for the user.
   * Tag definitions consist of a name and a type. Use this end point to see a list of pre-existing tags that can be used to filter on the Documents end point.
   * @param paginationOffset The offset integer on where to begin paginating (optional, default to 0)
   * @param paginationLimit The limit of records to return when paginating (optional, default to 50)
   * @return ApiResponse&lt;TagListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of tag definitions the user has access to. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<TagListResponse> getTagsEndPointWithHttpInfo(Integer paginationOffset, Integer paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/tag-search/v1/tags";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TagListResponse
      
    > apiResponse = apiClient.invokeAPI("DocumentsApi.getTagsEndPoint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTagsEndPointResponseTypeMap, false);

    return apiResponse;

  }
}
